package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamedACLAdmin extends js.Object {
  var AccessControlListForNamedACL: IAccessControlList = js.native
  var NamedACL: INamedACL = js.native
  var SemanticAliases: ISemanticAliases = js.native
  def Clone(): INamedACLAdmin = js.native
}

object INamedACLAdmin {
  @scala.inline
  def apply(
    AccessControlListForNamedACL: IAccessControlList,
    Clone: () => INamedACLAdmin,
    NamedACL: INamedACL,
    SemanticAliases: ISemanticAliases
  ): INamedACLAdmin = {
    val __obj = js.Dynamic.literal(AccessControlListForNamedACL = AccessControlListForNamedACL.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), NamedACL = NamedACL.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamedACLAdmin]
  }
  @scala.inline
  implicit class INamedACLAdminOps[Self <: INamedACLAdmin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlListForNamedACL(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlListForNamedACL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => INamedACLAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNamedACL(value: INamedACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedACL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticAliases(value: ISemanticAliases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticAliases")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

