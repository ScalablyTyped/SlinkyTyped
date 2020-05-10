package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHITWithHITTypeRequest extends js.Object {
  /**
    *  The Assignment-level Review Policy applies to the assignments under the HIT. You can specify for Mechanical Turk to take various actions based on the policy. 
    */
  var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.native
  /**
    *  The HITLayoutId allows you to use a pre-existing HIT design with placeholder values and create an additional HIT by providing those values as HITLayoutParameters.   Constraints: Either a Question parameter or a HITLayoutId parameter must be provided. 
    */
  var HITLayoutId: js.UndefOr[EntityId] = js.native
  /**
    *  If the HITLayoutId is provided, any placeholder values must be filled in with values using the HITLayoutParameter structure. For more information, see HITLayout. 
    */
  var HITLayoutParameters: js.UndefOr[HITLayoutParameterList] = js.native
  /**
    *  The HIT-level Review Policy applies to the HIT. You can specify for Mechanical Turk to take various actions based on the policy. 
    */
  var HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.native
  /**
    * The HIT type ID you want to create this HIT with.
    */
  var HITTypeId: EntityId = js.native
  /**
    *  An amount of time, in seconds, after which the HIT is no longer available for users to accept. After the lifetime of the HIT elapses, the HIT no longer appears in HIT searches, even if not all of the assignments for the HIT have been accepted. 
    */
  var LifetimeInSeconds: Long = js.native
  /**
    *  The number of times the HIT can be accepted and completed before the HIT becomes unavailable. 
    */
  var MaxAssignments: js.UndefOr[Integer] = js.native
  /**
    *  The data the person completing the HIT uses to produce the results.   Constraints: Must be a QuestionForm data structure, an ExternalQuestion data structure, or an HTMLQuestion data structure. The XML question data must not be larger than 64 kilobytes (65,535 bytes) in size, including whitespace.  Either a Question parameter or a HITLayoutId parameter must be provided.
    */
  var Question: js.UndefOr[String] = js.native
  /**
    *  An arbitrary data field. The RequesterAnnotation parameter lets your application attach arbitrary data to the HIT for tracking purposes. For example, this parameter could be an identifier internal to the Requester's application that corresponds with the HIT.   The RequesterAnnotation parameter for a HIT is only visible to the Requester who created the HIT. It is not shown to the Worker, or any other Requester.   The RequesterAnnotation parameter may be different for each HIT you submit. It does not affect how your HITs are grouped. 
    */
  var RequesterAnnotation: js.UndefOr[String] = js.native
  /**
    *  A unique identifier for this request which allows you to retry the call on error without creating duplicate HITs. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the HIT already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return a AWS.MechanicalTurk.HitAlreadyExists error with a message containing the HITId.    Note: It is your responsibility to ensure uniqueness of the token. The unique token expires after 24 hours. Subsequent calls using the same UniqueRequestToken made after the 24 hour limit could create duplicate HITs.  
    */
  var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.native
}

object CreateHITWithHITTypeRequest {
  @scala.inline
  def apply(HITTypeId: EntityId, LifetimeInSeconds: Long): CreateHITWithHITTypeRequest = {
    val __obj = js.Dynamic.literal(HITTypeId = HITTypeId.asInstanceOf[js.Any], LifetimeInSeconds = LifetimeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHITWithHITTypeRequest]
  }
  @scala.inline
  implicit class CreateHITWithHITTypeRequestOps[Self <: CreateHITWithHITTypeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHITTypeId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifetimeInSeconds(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifetimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignmentReviewPolicy(value: ReviewPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentReviewPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentReviewPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentReviewPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withHITLayoutId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITLayoutId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITLayoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITLayoutId")(js.undefined)
        ret
    }
    @scala.inline
    def withHITLayoutParameters(value: HITLayoutParameterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITLayoutParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITLayoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITLayoutParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withHITReviewPolicy(value: ReviewPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITReviewPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITReviewPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITReviewPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAssignments(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAssignments")(js.undefined)
        ret
    }
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Question")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterAnnotation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueRequestToken(value: IdempotencyToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueRequestToken")(js.undefined)
        ret
    }
  }
  
}

