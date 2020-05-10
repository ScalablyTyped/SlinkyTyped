package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Student work for a multiple-choice question.
  */
@js.native
trait SchemaMultipleChoiceSubmission extends js.Object {
  /**
    * Student&#39;s select choice.
    */
  var answer: js.UndefOr[String] = js.native
}

object SchemaMultipleChoiceSubmission {
  @scala.inline
  def apply(): SchemaMultipleChoiceSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultipleChoiceSubmission]
  }
  @scala.inline
  implicit class SchemaMultipleChoiceSubmissionOps[Self <: SchemaMultipleChoiceSubmission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answer")(js.undefined)
        ret
    }
  }
  
}

