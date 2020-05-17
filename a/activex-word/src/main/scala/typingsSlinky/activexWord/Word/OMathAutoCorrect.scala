package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathAutoCorrect extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Entries: OMathAutoCorrectEntries = js.native
  val Functions: OMathRecognizedFunctions = js.native
  val Parent: js.Any = js.native
  var ReplaceText: Boolean = js.native
  var UseOutsideOMath: Boolean = js.native
  @JSName("Word.OMathAutoCorrect_typekey")
  var WordDotOMathAutoCorrect_typekey: OMathAutoCorrect = js.native
}

object OMathAutoCorrect {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Entries: OMathAutoCorrectEntries,
    Functions: OMathRecognizedFunctions,
    Parent: js.Any,
    ReplaceText: Boolean,
    UseOutsideOMath: Boolean,
    WordDotOMathAutoCorrect_typekey: OMathAutoCorrect
  ): OMathAutoCorrect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Functions = Functions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReplaceText = ReplaceText.asInstanceOf[js.Any], UseOutsideOMath = UseOutsideOMath.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathAutoCorrect_typekey")(WordDotOMathAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathAutoCorrect]
  }
  @scala.inline
  implicit class OMathAutoCorrectOps[Self <: OMathAutoCorrect] (val x: Self) extends AnyVal {
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
    def withEntries(value: OMathAutoCorrectEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctions(value: OMathRecognizedFunctions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseOutsideOMath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseOutsideOMath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathAutoCorrect_typekey(value: OMathAutoCorrect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathAutoCorrect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

