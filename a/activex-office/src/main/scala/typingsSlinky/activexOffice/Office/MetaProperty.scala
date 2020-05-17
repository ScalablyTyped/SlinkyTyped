package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaProperty extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Id: String = js.native
  val IsReadOnly: Boolean = js.native
  val IsRequired: Boolean = js.native
  val Name: String = js.native
  @JSName("Office.MetaProperty_typekey")
  var OfficeDotMetaProperty_typekey: MetaProperty = js.native
  val Parent: js.Any = js.native
  val Type: MsoMetaPropertyType = js.native
  val ValidationError: String = js.native
  var Value: js.Any = js.native
  def Validate(): String = js.native
}

object MetaProperty {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Id: String,
    IsReadOnly: Boolean,
    IsRequired: Boolean,
    Name: String,
    OfficeDotMetaProperty_typekey: MetaProperty,
    Parent: js.Any,
    Type: MsoMetaPropertyType,
    Validate: () => String,
    ValidationError: String,
    Value: js.Any
  ): MetaProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], IsRequired = IsRequired.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Validate = js.Any.fromFunction0(Validate), ValidationError = ValidationError.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.MetaProperty_typekey")(OfficeDotMetaProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaProperty]
  }
  @scala.inline
  implicit class MetaPropertyOps[Self <: MetaProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotMetaProperty_typekey(value: MetaProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.MetaProperty_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoMetaPropertyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidationError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

