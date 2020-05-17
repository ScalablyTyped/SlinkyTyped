package typingsSlinky.googleGax.operationsMod.google.longrunning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetOperationRequest. */
@js.native
trait IGetOperationRequest extends js.Object {
  /** GetOperationRequest name */
  var name: js.UndefOr[String | Null] = js.native
}

object IGetOperationRequest {
  @scala.inline
  def apply(): IGetOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetOperationRequest]
  }
  @scala.inline
  implicit class IGetOperationRequestOps[Self <: IGetOperationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
  }
  
}

