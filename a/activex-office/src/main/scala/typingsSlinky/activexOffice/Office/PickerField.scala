package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerField extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val IsHidden: Boolean = js.native
  val Name: String = js.native
  @JSName("Office.PickerField_typekey")
  var OfficeDotPickerField_typekey: PickerField = js.native
  val Type: MsoPickerField = js.native
}

object PickerField {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    IsHidden: Boolean,
    Name: String,
    OfficeDotPickerField_typekey: PickerField,
    Type: MsoPickerField
  ): PickerField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], IsHidden = IsHidden.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PickerField_typekey")(OfficeDotPickerField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerField]
  }
  @scala.inline
  implicit class PickerFieldOps[Self <: PickerField] (val x: Self) extends AnyVal {
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
    def withIsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotPickerField_typekey(value: PickerField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.PickerField_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoPickerField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

