package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherCorrectionsExceptions extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OtherCorrectionsExceptions_typekey")
  var WordDotOtherCorrectionsExceptions_typekey: OtherCorrectionsExceptions = js.native
  def Add(Name: String): OtherCorrectionsException = js.native
  def Item(Index: js.Any): OtherCorrectionsException = js.native
}

object OtherCorrectionsExceptions {
  @scala.inline
  def apply(
    Add: String => OtherCorrectionsException,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => OtherCorrectionsException,
    Parent: js.Any,
    WordDotOtherCorrectionsExceptions_typekey: OtherCorrectionsExceptions
  ): OtherCorrectionsExceptions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OtherCorrectionsExceptions_typekey")(WordDotOtherCorrectionsExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherCorrectionsExceptions]
  }
  @scala.inline
  implicit class OtherCorrectionsExceptionsOps[Self <: OtherCorrectionsExceptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: String => OtherCorrectionsException): Self = {
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
    def withItem(value: js.Any => OtherCorrectionsException): Self = {
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
    def withWordDotOtherCorrectionsExceptions_typekey(value: OtherCorrectionsExceptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OtherCorrectionsExceptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

