package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOnRequest extends js.Object {
  /**
    * The add-on type.
    */
  var addOnType: AddOnType = js.native
  /**
    * An object that represents additional parameters when enabling or modifying the automatic snapshot add-on.
    */
  var autoSnapshotAddOnRequest: js.UndefOr[AutoSnapshotAddOnRequest] = js.native
}

object AddOnRequest {
  @scala.inline
  def apply(addOnType: AddOnType): AddOnRequest = {
    val __obj = js.Dynamic.literal(addOnType = addOnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOnRequest]
  }
  @scala.inline
  implicit class AddOnRequestOps[Self <: AddOnRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOnType(value: AddOnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoSnapshotAddOnRequest(value: AutoSnapshotAddOnRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSnapshotAddOnRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSnapshotAddOnRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSnapshotAddOnRequest")(js.undefined)
        ret
    }
  }
  
}

