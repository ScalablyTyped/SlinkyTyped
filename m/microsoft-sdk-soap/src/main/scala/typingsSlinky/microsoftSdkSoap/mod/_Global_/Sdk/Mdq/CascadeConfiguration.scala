package typingsSlinky.microsoftSdkSoap.mod._Global_.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CascadeConfiguration extends js.Object {
  var Assign: CascadeType = js.native
  var Delete: CascadeType = js.native
  var ExtensionData: CascadeType = js.native
  var Merge: CascadeType = js.native
  var Reparent: CascadeType = js.native
  var Share: CascadeType = js.native
  var Unshare: CascadeType = js.native
}

object CascadeConfiguration {
  @scala.inline
  def apply(
    Assign: CascadeType,
    Delete: CascadeType,
    ExtensionData: CascadeType,
    Merge: CascadeType,
    Reparent: CascadeType,
    Share: CascadeType,
    Unshare: CascadeType
  ): CascadeConfiguration = {
    val __obj = js.Dynamic.literal(Assign = Assign.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any], ExtensionData = ExtensionData.asInstanceOf[js.Any], Merge = Merge.asInstanceOf[js.Any], Reparent = Reparent.asInstanceOf[js.Any], Share = Share.asInstanceOf[js.Any], Unshare = Unshare.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascadeConfiguration]
  }
  @scala.inline
  implicit class CascadeConfigurationOps[Self <: CascadeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssign(value: CascadeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: CascadeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionData(value: CascadeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtensionData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge(value: CascadeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReparent(value: CascadeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShare(value: CascadeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Share")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnshare(value: CascadeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unshare")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

