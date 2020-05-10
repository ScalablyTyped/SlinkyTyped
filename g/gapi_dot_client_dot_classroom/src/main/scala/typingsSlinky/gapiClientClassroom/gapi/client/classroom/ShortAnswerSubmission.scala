package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortAnswerSubmission extends js.Object {
  /** Student response to a short-answer question. */
  var answer: js.UndefOr[String] = js.native
}

object ShortAnswerSubmission {
  @scala.inline
  def apply(): ShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortAnswerSubmission]
  }
  @scala.inline
  implicit class ShortAnswerSubmissionOps[Self <: ShortAnswerSubmission] (val x: Self) extends AnyVal {
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

