package typingsSlinky.googleGax.operationsMod.google.longrunning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CancelOperationRequest. */
@js.native
trait ICancelOperationRequest extends js.Object {
  /** CancelOperationRequest name */
  var name: js.UndefOr[String | Null] = js.native
}

object ICancelOperationRequest {
  @scala.inline
  def apply(): ICancelOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICancelOperationRequest]
  }
  @scala.inline
  implicit class ICancelOperationRequestOps[Self <: ICancelOperationRequest] (val x: Self) extends AnyVal {
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

