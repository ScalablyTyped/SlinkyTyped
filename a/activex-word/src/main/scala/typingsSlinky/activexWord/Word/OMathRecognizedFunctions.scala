package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathRecognizedFunctions extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathRecognizedFunctions_typekey")
  var WordDotOMathRecognizedFunctions_typekey: OMathRecognizedFunctions = js.native
  def Add(Name: String): OMathRecognizedFunction = js.native
  def Item(Index: js.Any): OMathRecognizedFunction = js.native
}

object OMathRecognizedFunctions {
  @scala.inline
  def apply(
    Add: String => OMathRecognizedFunction,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => OMathRecognizedFunction,
    Parent: js.Any,
    WordDotOMathRecognizedFunctions_typekey: OMathRecognizedFunctions
  ): OMathRecognizedFunctions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathRecognizedFunctions_typekey")(WordDotOMathRecognizedFunctions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathRecognizedFunctions]
  }
  @scala.inline
  implicit class OMathRecognizedFunctionsOps[Self <: OMathRecognizedFunctions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: String => OMathRecognizedFunction): Self = {
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
    def withItem(value: js.Any => OMathRecognizedFunction): Self = {
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
    def withWordDotOMathRecognizedFunctions_typekey(value: OMathRecognizedFunctions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathRecognizedFunctions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

