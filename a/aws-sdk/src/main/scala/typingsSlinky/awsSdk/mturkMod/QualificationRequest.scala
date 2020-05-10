package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualificationRequest extends js.Object {
  /**
    *  The Worker's answers for the Qualification type's test contained in a QuestionFormAnswers document, if the type has a test and the Worker has submitted answers. If the Worker does not provide any answers, Answer may be empty. 
    */
  var Answer: js.UndefOr[String] = js.native
  /**
    * The ID of the Qualification request, a unique identifier generated when the request was submitted. 
    */
  var QualificationRequestId: js.UndefOr[String] = js.native
  /**
    *  The ID of the Qualification type the Worker is requesting, as returned by the CreateQualificationType operation. 
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.native
  /**
    * The date and time the Qualification request had a status of Submitted. This is either the time the Worker submitted answers for a Qualification test, or the time the Worker requested the Qualification if the Qualification type does not have a test. 
    */
  var SubmitTime: js.UndefOr[js.Date] = js.native
  /**
    *  The contents of the Qualification test that was presented to the Worker, if the type has a test and the Worker has submitted answers. This value is identical to the QuestionForm associated with the Qualification type at the time the Worker requests the Qualification.
    */
  var Test: js.UndefOr[String] = js.native
  /**
    *  The ID of the Worker requesting the Qualification.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object QualificationRequest {
  @scala.inline
  def apply(): QualificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QualificationRequest]
  }
  @scala.inline
  implicit class QualificationRequestOps[Self <: QualificationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Answer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Answer")(js.undefined)
        ret
    }
    @scala.inline
    def withQualificationRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualificationRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withQualificationTypeId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualificationTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationTypeId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Test")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerId(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(js.undefined)
        ret
    }
  }
  
}

