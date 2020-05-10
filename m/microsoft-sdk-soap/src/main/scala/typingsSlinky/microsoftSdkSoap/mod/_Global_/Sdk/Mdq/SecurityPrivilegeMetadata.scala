package typingsSlinky.microsoftSdkSoap.mod._Global_.Sdk.Mdq

import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Append
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.AppendTo
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Assign
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Create
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Delete
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.None
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Read
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Share
import typingsSlinky.microsoftSdkSoap.microsoftSdkSoapStrings.Write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityPrivilegeMetadata extends js.Object {
  var CanBeBasic: Boolean = js.native
  var CanBeDeep: Boolean = js.native
  var CanBeEntityReference: Boolean = js.native
  var CanBeGlobal: Boolean = js.native
  var CanBeLocal: Boolean = js.native
  var CanBeParentEntityReference: Boolean = js.native
  var ExtensionData: Boolean = js.native
  var Name: String = js.native
  var PrivilegeId: String = js.native
  var PrivilegeType: Append | AppendTo | Assign | Create | Delete | None | Read | Share | Write = js.native
}

object SecurityPrivilegeMetadata {
  @scala.inline
  def apply(
    CanBeBasic: Boolean,
    CanBeDeep: Boolean,
    CanBeEntityReference: Boolean,
    CanBeGlobal: Boolean,
    CanBeLocal: Boolean,
    CanBeParentEntityReference: Boolean,
    ExtensionData: Boolean,
    Name: String,
    PrivilegeId: String,
    PrivilegeType: Append | AppendTo | Assign | Create | Delete | None | Read | Share | Write
  ): SecurityPrivilegeMetadata = {
    val __obj = js.Dynamic.literal(CanBeBasic = CanBeBasic.asInstanceOf[js.Any], CanBeDeep = CanBeDeep.asInstanceOf[js.Any], CanBeEntityReference = CanBeEntityReference.asInstanceOf[js.Any], CanBeGlobal = CanBeGlobal.asInstanceOf[js.Any], CanBeLocal = CanBeLocal.asInstanceOf[js.Any], CanBeParentEntityReference = CanBeParentEntityReference.asInstanceOf[js.Any], ExtensionData = ExtensionData.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PrivilegeId = PrivilegeId.asInstanceOf[js.Any], PrivilegeType = PrivilegeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPrivilegeMetadata]
  }
  @scala.inline
  implicit class SecurityPrivilegeMetadataOps[Self <: SecurityPrivilegeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanBeBasic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeBasic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeDeep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeEntityReference(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeEntityReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeGlobal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeLocal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanBeParentEntityReference(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeParentEntityReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtensionData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivilegeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivilegeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivilegeType(value: Append | AppendTo | Assign | Create | Delete | None | Read | Share | Write): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivilegeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

