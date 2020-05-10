package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Student work for a short answer question.
  */
@js.native
trait SchemaShortAnswerSubmission extends js.Object {
  /**
    * Student response to a short-answer question.
    */
  var answer: js.UndefOr[String] = js.native
}

object SchemaShortAnswerSubmission {
  @scala.inline
  def apply(): SchemaShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShortAnswerSubmission]
  }
  @scala.inline
  implicit class SchemaShortAnswerSubmissionOps[Self <: SchemaShortAnswerSubmission] (val x: Self) extends AnyVal {
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

