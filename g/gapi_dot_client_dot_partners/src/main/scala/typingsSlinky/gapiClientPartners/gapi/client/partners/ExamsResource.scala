package typingsSlinky.gapiClientPartners.gapi.client.partners

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPartners.AnonExamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExamsResource extends js.Object {
  /** Gets an Exam Token for a Partner's user to take an exam in the Exams System */
  def getToken(request: AnonExamType): Request_[ExamToken] = js.native
}

object ExamsResource {
  @scala.inline
  def apply(getToken: AnonExamType => Request_[ExamToken]): ExamsResource = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction1(getToken))
    __obj.asInstanceOf[ExamsResource]
  }
  @scala.inline
  implicit class ExamsResourceOps[Self <: ExamsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetToken(value: AnonExamType => Request_[ExamToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToken")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

