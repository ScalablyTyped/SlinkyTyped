package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwoInitialCapsExceptions extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.TwoInitialCapsExceptions_typekey")
  var WordDotTwoInitialCapsExceptions_typekey: TwoInitialCapsExceptions = js.native
  def Add(Name: String): TwoInitialCapsException = js.native
  def Item(Index: js.Any): TwoInitialCapsException = js.native
}

object TwoInitialCapsExceptions {
  @scala.inline
  def apply(
    Add: String => TwoInitialCapsException,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => TwoInitialCapsException,
    Parent: js.Any,
    WordDotTwoInitialCapsExceptions_typekey: TwoInitialCapsExceptions
  ): TwoInitialCapsExceptions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TwoInitialCapsExceptions_typekey")(WordDotTwoInitialCapsExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoInitialCapsExceptions]
  }
  @scala.inline
  implicit class TwoInitialCapsExceptionsOps[Self <: TwoInitialCapsExceptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: String => TwoInitialCapsException): Self = {
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
    def withItem(value: js.Any => TwoInitialCapsException): Self = {
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
    def withWordDotTwoInitialCapsExceptions_typekey(value: TwoInitialCapsExceptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.TwoInitialCapsExceptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

