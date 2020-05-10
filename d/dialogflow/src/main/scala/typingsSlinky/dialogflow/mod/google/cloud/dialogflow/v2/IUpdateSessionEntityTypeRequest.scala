package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import typingsSlinky.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateSessionEntityTypeRequest. */
@js.native
trait IUpdateSessionEntityTypeRequest extends js.Object {
  /** UpdateSessionEntityTypeRequest sessionEntityType */
  var sessionEntityType: js.UndefOr[ISessionEntityType | Null] = js.native
  /** UpdateSessionEntityTypeRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}

object IUpdateSessionEntityTypeRequest {
  @scala.inline
  def apply(): IUpdateSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateSessionEntityTypeRequest]
  }
  @scala.inline
  implicit class IUpdateSessionEntityTypeRequestOps[Self <: IUpdateSessionEntityTypeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSessionEntityType(value: ISessionEntityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionEntityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionEntityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionEntityType")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionEntityTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionEntityType")(null)
        ret
    }
    @scala.inline
    def withUpdateMask(value: IFieldMask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMaskNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(null)
        ret
    }
  }
  
}

