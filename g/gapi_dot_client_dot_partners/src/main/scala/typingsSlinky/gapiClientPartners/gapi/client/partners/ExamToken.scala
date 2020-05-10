package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExamToken extends js.Object {
  /** The id of the exam the token is for. */
  var examId: js.UndefOr[String] = js.native
  /** The type of the exam the token belongs to. */
  var examType: js.UndefOr[String] = js.native
  /** The token, only present if the user has access to the exam. */
  var token: js.UndefOr[String] = js.native
}

object ExamToken {
  @scala.inline
  def apply(): ExamToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExamToken]
  }
  @scala.inline
  implicit class ExamTokenOps[Self <: ExamToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examId")(js.undefined)
        ret
    }
    @scala.inline
    def withExamType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examType")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

