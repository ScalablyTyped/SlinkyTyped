package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckBox extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var AutoSize: Boolean = js.native
  val Creator: Double = js.native
  var Default: Boolean = js.native
  val Parent: js.Any = js.native
  var Size: Double = js.native
  val Valid: Boolean = js.native
  var Value: Boolean = js.native
  @JSName("Word.CheckBox_typekey")
  var WordDotCheckBox_typekey: CheckBox = js.native
}

object CheckBox {
  @scala.inline
  def apply(
    Application: Application,
    AutoSize: Boolean,
    Creator: Double,
    Default: Boolean,
    Parent: js.Any,
    Size: Double,
    Valid: Boolean,
    Value: Boolean,
    WordDotCheckBox_typekey: CheckBox
  ): CheckBox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CheckBox_typekey")(WordDotCheckBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBox]
  }
  @scala.inline
  implicit class CheckBoxOps[Self <: CheckBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotCheckBox_typekey(value: CheckBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.CheckBox_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

