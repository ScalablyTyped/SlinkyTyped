package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDown extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Default: Double = js.native
  val ListEntries: typingsSlinky.activexWord.Word.ListEntries = js.native
  val Parent: js.Any = js.native
  val Valid: Boolean = js.native
  var Value: Double = js.native
  @JSName("Word.DropDown_typekey")
  var WordDotDropDown_typekey: DropDown = js.native
}

object DropDown {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Default: Double,
    ListEntries: ListEntries,
    Parent: js.Any,
    Valid: Boolean,
    Value: Double,
    WordDotDropDown_typekey: DropDown
  ): DropDown = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], ListEntries = ListEntries.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.DropDown_typekey")(WordDotDropDown_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDown]
  }
  @scala.inline
  implicit class DropDownOps[Self <: DropDown] (val x: Self) extends AnyVal {
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
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEntries(value: ListEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotDropDown_typekey(value: DropDown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.DropDown_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

