package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyDefAdmin extends js.Object {
  var AllowAutomaticPermissions: Boolean = js.native
  var AutomaticValue: IAutomaticValue = js.native
  var NamedValueNamespaces: INamedValueNamespaces = js.native
  var PropertyDef: IPropertyDef = js.native
  var SemanticAliases: ISemanticAliases = js.native
  var Validation: IValidation = js.native
  def Clone(): IPropertyDefAdmin = js.native
}

object IPropertyDefAdmin {
  @scala.inline
  def apply(
    AllowAutomaticPermissions: Boolean,
    AutomaticValue: IAutomaticValue,
    Clone: () => IPropertyDefAdmin,
    NamedValueNamespaces: INamedValueNamespaces,
    PropertyDef: IPropertyDef,
    SemanticAliases: ISemanticAliases,
    Validation: IValidation
  ): IPropertyDefAdmin = {
    val __obj = js.Dynamic.literal(AllowAutomaticPermissions = AllowAutomaticPermissions.asInstanceOf[js.Any], AutomaticValue = AutomaticValue.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), NamedValueNamespaces = NamedValueNamespaces.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], Validation = Validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDefAdmin]
  }
  @scala.inline
  implicit class IPropertyDefAdminOps[Self <: IPropertyDefAdmin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAutomaticPermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowAutomaticPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomaticValue(value: IAutomaticValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IPropertyDefAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNamedValueNamespaces(value: INamedValueNamespaces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedValueNamespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyDef(value: IPropertyDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticAliases(value: ISemanticAliases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidation(value: IValidation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

