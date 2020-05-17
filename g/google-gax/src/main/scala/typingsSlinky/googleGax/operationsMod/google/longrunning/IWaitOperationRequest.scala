package typingsSlinky.googleGax.operationsMod.google.longrunning

import typingsSlinky.googleGax.operationsMod.google.protobuf.IDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a WaitOperationRequest. */
@js.native
trait IWaitOperationRequest extends js.Object {
  /** WaitOperationRequest name */
  var name: js.UndefOr[String | Null] = js.native
  /** WaitOperationRequest timeout */
  var timeout: js.UndefOr[IDuration | Null] = js.native
}

object IWaitOperationRequest {
  @scala.inline
  def apply(): IWaitOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWaitOperationRequest]
  }
  @scala.inline
  implicit class IWaitOperationRequestOps[Self <: IWaitOperationRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTimeout(value: IDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(null)
        ret
    }
  }
  
}

