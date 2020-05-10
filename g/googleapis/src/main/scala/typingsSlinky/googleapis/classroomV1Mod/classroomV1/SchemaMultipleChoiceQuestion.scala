package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional details for multiple-choice questions.
  */
@js.native
trait SchemaMultipleChoiceQuestion extends js.Object {
  /**
    * Possible choices.
    */
  var choices: js.UndefOr[js.Array[String]] = js.native
}

object SchemaMultipleChoiceQuestion {
  @scala.inline
  def apply(): SchemaMultipleChoiceQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultipleChoiceQuestion]
  }
  @scala.inline
  implicit class SchemaMultipleChoiceQuestionOps[Self <: SchemaMultipleChoiceQuestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChoices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChoices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(js.undefined)
        ret
    }
  }
  
}

