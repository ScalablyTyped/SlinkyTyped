package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathAutoCorrectEntries extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathAutoCorrectEntries_typekey")
  var WordDotOMathAutoCorrectEntries_typekey: OMathAutoCorrectEntries = js.native
  def Add(Name: String, Value: String): OMathAutoCorrectEntry = js.native
  def Item(Index: js.Any): OMathAutoCorrectEntry = js.native
}

object OMathAutoCorrectEntries {
  @scala.inline
  def apply(
    Add: (String, String) => OMathAutoCorrectEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => OMathAutoCorrectEntry,
    Parent: js.Any,
    WordDotOMathAutoCorrectEntries_typekey: OMathAutoCorrectEntries
  ): OMathAutoCorrectEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathAutoCorrectEntries_typekey")(WordDotOMathAutoCorrectEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathAutoCorrectEntries]
  }
  @scala.inline
  implicit class OMathAutoCorrectEntriesOps[Self <: OMathAutoCorrectEntries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, String) => OMathAutoCorrectEntry): Self = {
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
    def withItem(value: js.Any => OMathAutoCorrectEntry): Self = {
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
    def withWordDotOMathAutoCorrectEntries_typekey(value: OMathAutoCorrectEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathAutoCorrectEntries_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

