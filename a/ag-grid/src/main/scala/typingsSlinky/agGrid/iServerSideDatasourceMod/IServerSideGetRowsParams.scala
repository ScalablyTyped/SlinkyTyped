package typingsSlinky.agGrid.iServerSideDatasourceMod

import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerSideGetRowsParams extends js.Object {
  var parentNode: RowNode = js.native
  var request: IServerSideGetRowsRequest = js.native
  def failCallback(): Unit = js.native
  def successCallback(rowsThisPage: js.Array[_], lastRow: Double): Unit = js.native
}

object IServerSideGetRowsParams {
  @scala.inline
  def apply(
    failCallback: () => Unit,
    parentNode: RowNode,
    request: IServerSideGetRowsRequest,
    successCallback: (js.Array[_], Double) => Unit
  ): IServerSideGetRowsParams = {
    val __obj = js.Dynamic.literal(failCallback = js.Any.fromFunction0(failCallback), parentNode = parentNode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], successCallback = js.Any.fromFunction2(successCallback))
    __obj.asInstanceOf[IServerSideGetRowsParams]
  }
  @scala.inline
  implicit class IServerSideGetRowsParamsOps[Self <: IServerSideGetRowsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParentNode(value: RowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: IServerSideGetRowsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessCallback(value: (js.Array[_], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCallback")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

