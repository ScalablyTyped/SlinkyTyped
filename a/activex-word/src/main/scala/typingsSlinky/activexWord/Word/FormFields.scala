package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormFields extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var Shaded: Boolean = js.native
  @JSName("Word.FormFields_typekey")
  var WordDotFormFields_typekey: FormFields = js.native
  def Add(Range: Range, Type: WdFieldType): FormField = js.native
  def Item(Index: js.Any): FormField = js.native
}

object FormFields {
  @scala.inline
  def apply(
    Add: (Range, WdFieldType) => FormField,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => FormField,
    Parent: js.Any,
    Shaded: Boolean,
    WordDotFormFields_typekey: FormFields
  ): FormFields = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Shaded = Shaded.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FormFields_typekey")(WordDotFormFields_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFields]
  }
  @scala.inline
  implicit class FormFieldsOps[Self <: FormFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Range, WdFieldType) => FormField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => FormField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotFormFields_typekey(value: FormFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.FormFields_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

