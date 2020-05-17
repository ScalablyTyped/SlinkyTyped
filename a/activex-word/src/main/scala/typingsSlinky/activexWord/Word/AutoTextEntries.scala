package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoTextEntries extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.AutoTextEntries_typekey")
  var WordDotAutoTextEntries_typekey: AutoTextEntries = js.native
  def Add(Name: String, Range: Range): AutoTextEntry = js.native
  def AppendToSpike(Range: Range): AutoTextEntry = js.native
  def Item(Index: js.Any): AutoTextEntry = js.native
}

object AutoTextEntries {
  @scala.inline
  def apply(
    Add: (String, Range) => AutoTextEntry,
    AppendToSpike: Range => AutoTextEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => AutoTextEntry,
    Parent: js.Any,
    WordDotAutoTextEntries_typekey: AutoTextEntries
  ): AutoTextEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AppendToSpike = js.Any.fromFunction1(AppendToSpike), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoTextEntries_typekey")(WordDotAutoTextEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoTextEntries]
  }
  @scala.inline
  implicit class AutoTextEntriesOps[Self <: AutoTextEntries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, Range) => AutoTextEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAppendToSpike(value: Range => AutoTextEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppendToSpike")(js.Any.fromFunction1(value))
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
    def withItem(value: js.Any => AutoTextEntry): Self = {
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
    def withWordDotAutoTextEntries_typekey(value: AutoTextEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.AutoTextEntries_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

