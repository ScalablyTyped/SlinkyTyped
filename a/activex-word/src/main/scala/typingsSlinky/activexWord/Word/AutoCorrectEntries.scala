package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCorrectEntries extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.AutoCorrectEntries_typekey")
  var WordDotAutoCorrectEntries_typekey: AutoCorrectEntries = js.native
  def Add(Name: String, Value: String): AutoCorrectEntry = js.native
  def AddRichText(Name: String, Range: Range): AutoCorrectEntry = js.native
  def Item(Index: js.Any): AutoCorrectEntry = js.native
}

object AutoCorrectEntries {
  @scala.inline
  def apply(
    Add: (String, String) => AutoCorrectEntry,
    AddRichText: (String, Range) => AutoCorrectEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => AutoCorrectEntry,
    Parent: js.Any,
    WordDotAutoCorrectEntries_typekey: AutoCorrectEntries
  ): AutoCorrectEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AddRichText = js.Any.fromFunction2(AddRichText), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCorrectEntries_typekey")(WordDotAutoCorrectEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrectEntries]
  }
  @scala.inline
  implicit class AutoCorrectEntriesOps[Self <: AutoCorrectEntries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, String) => AutoCorrectEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddRichText(value: (String, Range) => AutoCorrectEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddRichText")(js.Any.fromFunction2(value))
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
    def withItem(value: js.Any => AutoCorrectEntry): Self = {
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
    def withWordDotAutoCorrectEntries_typekey(value: AutoCorrectEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.AutoCorrectEntries_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

