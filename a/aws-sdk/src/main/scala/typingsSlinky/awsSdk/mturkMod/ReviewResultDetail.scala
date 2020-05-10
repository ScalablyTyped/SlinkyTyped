package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewResultDetail extends js.Object {
  /**
    *  A unique identifier of the Review action result. 
    */
  var ActionId: js.UndefOr[EntityId] = js.native
  /**
    *  Key identifies the particular piece of reviewed information. 
    */
  var Key: js.UndefOr[String] = js.native
  /**
    *  Specifies the QuestionId the result is describing. Depending on whether the TargetType is a HIT or Assignment this results could specify multiple values. If TargetType is HIT and QuestionId is absent, then the result describes results of the HIT, including the HIT agreement score. If ObjectType is Assignment and QuestionId is absent, then the result describes the Worker's performance on the HIT. 
    */
  var QuestionId: js.UndefOr[EntityId] = js.native
  /**
    * The HITID or AssignmentId about which this result was taken. Note that HIT-level Review Policies will often emit results about both the HIT itself and its Assignments, while Assignment-level review policies generally only emit results about the Assignment itself. 
    */
  var SubjectId: js.UndefOr[EntityId] = js.native
  /**
    *  The type of the object from the SubjectId field.
    */
  var SubjectType: js.UndefOr[String] = js.native
  /**
    *  The values of Key provided by the review policies you have selected. 
    */
  var Value: js.UndefOr[String] = js.native
}

object ReviewResultDetail {
  @scala.inline
  def apply(): ReviewResultDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewResultDetail]
  }
  @scala.inline
  implicit class ReviewResultDetailOps[Self <: ReviewResultDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionId")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withQuestionId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuestionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuestionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuestionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectType")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

