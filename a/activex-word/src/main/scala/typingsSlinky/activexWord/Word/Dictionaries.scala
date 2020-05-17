package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictionaries extends js.Object {
  var ActiveCustomDictionary: Dictionary = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Maximum: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Dictionaries_typekey")
  var WordDotDictionaries_typekey: Dictionaries = js.native
  def Add(FileName: String): Dictionary = js.native
  def ClearAll(): Unit = js.native
  def Item(Index: js.Any): Dictionary = js.native
}

object Dictionaries {
  @scala.inline
  def apply(
    ActiveCustomDictionary: Dictionary,
    Add: String => Dictionary,
    Application: Application,
    ClearAll: () => Unit,
    Count: Double,
    Creator: Double,
    Item: js.Any => Dictionary,
    Maximum: Double,
    Parent: js.Any,
    WordDotDictionaries_typekey: Dictionaries
  ): Dictionaries = {
    val __obj = js.Dynamic.literal(ActiveCustomDictionary = ActiveCustomDictionary.asInstanceOf[js.Any], Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], ClearAll = js.Any.fromFunction0(ClearAll), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Maximum = Maximum.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Dictionaries_typekey")(WordDotDictionaries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictionaries]
  }
  @scala.inline
  implicit class DictionariesOps[Self <: Dictionaries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveCustomDictionary(value: Dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveCustomDictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdd(value: String => Dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearAll")(js.Any.fromFunction0(value))
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
    def withItem(value: js.Any => Dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotDictionaries_typekey(value: Dictionaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Dictionaries_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

