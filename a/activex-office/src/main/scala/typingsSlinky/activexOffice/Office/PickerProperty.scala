package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerProperty extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Id: String = js.native
  @JSName("Office.PickerProperty_typekey")
  var OfficeDotPickerProperty_typekey: PickerProperty = js.native
  val Type: MsoPickerField = js.native
  val Value: js.Any = js.native
}

object PickerProperty {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Id: String,
    OfficeDotPickerProperty_typekey: PickerProperty,
    Type: MsoPickerField,
    Value: js.Any
  ): PickerProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PickerProperty_typekey")(OfficeDotPickerProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProperty]
  }
  @scala.inline
  implicit class PickerPropertyOps[Self <: PickerProperty] (val x: Self) extends AnyVal {
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
    def withOfficeDotPickerProperty_typekey(value: PickerProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.PickerProperty_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoPickerField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
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

