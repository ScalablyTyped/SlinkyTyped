package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProofreadingErrors extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  val Type: WdProofreadingErrorType = js.native
  @JSName("Word.ProofreadingErrors_typekey")
  var WordDotProofreadingErrors_typekey: ProofreadingErrors = js.native
  def Item(Index: Double): Range = js.native
}

object ProofreadingErrors {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Range,
    Parent: js.Any,
    Type: WdProofreadingErrorType,
    WordDotProofreadingErrors_typekey: ProofreadingErrors
  ): ProofreadingErrors = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ProofreadingErrors_typekey")(WordDotProofreadingErrors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofreadingErrors]
  }
  @scala.inline
  implicit class ProofreadingErrorsOps[Self <: ProofreadingErrors] (val x: Self) extends AnyVal {
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
    def withItem(value: Double => Range): Self = {
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
    def withType(value: WdProofreadingErrorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotProofreadingErrors_typekey(value: ProofreadingErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.ProofreadingErrors_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

