package typingsSlinky.awsSdk.mturkMod

import typingsSlinky.awsSdk.configBaseMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MTurk extends Service {
  
  /**
    *  The AcceptQualificationRequest operation approves a Worker's request for a Qualification.   Only the owner of the Qualification type can grant a Qualification request for that type.   A successful request for the AcceptQualificationRequest operation returns with no errors and an empty body. 
    */
  def acceptQualificationRequest(): Request[AcceptQualificationRequestResponse, AWSError] = js.native
  def acceptQualificationRequest(callback: js.Function2[/* err */ AWSError, /* data */ AcceptQualificationRequestResponse, Unit]): Request[AcceptQualificationRequestResponse, AWSError] = js.native
  /**
    *  The AcceptQualificationRequest operation approves a Worker's request for a Qualification.   Only the owner of the Qualification type can grant a Qualification request for that type.   A successful request for the AcceptQualificationRequest operation returns with no errors and an empty body. 
    */
  def acceptQualificationRequest(params: AcceptQualificationRequestRequest): Request[AcceptQualificationRequestResponse, AWSError] = js.native
  def acceptQualificationRequest(
    params: AcceptQualificationRequestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptQualificationRequestResponse, Unit]
  ): Request[AcceptQualificationRequestResponse, AWSError] = js.native
  
  /**
    *  The ApproveAssignment operation approves the results of a completed assignment.   Approving an assignment initiates two payments from the Requester's Amazon.com account     The Worker who submitted the results is paid the reward specified in the HIT.     Amazon Mechanical Turk fees are debited.     If the Requester's account does not have adequate funds for these payments, the call to ApproveAssignment returns an exception, and the approval is not processed. You can include an optional feedback message with the approval, which the Worker can see in the Status section of the web site.   You can also call this operation for assignments that were previous rejected and approve them by explicitly overriding the previous rejection. This only works on rejected assignments that were submitted within the previous 30 days and only if the assignment's related HIT has not been deleted. 
    */
  def approveAssignment(): Request[ApproveAssignmentResponse, AWSError] = js.native
  def approveAssignment(callback: js.Function2[/* err */ AWSError, /* data */ ApproveAssignmentResponse, Unit]): Request[ApproveAssignmentResponse, AWSError] = js.native
  /**
    *  The ApproveAssignment operation approves the results of a completed assignment.   Approving an assignment initiates two payments from the Requester's Amazon.com account     The Worker who submitted the results is paid the reward specified in the HIT.     Amazon Mechanical Turk fees are debited.     If the Requester's account does not have adequate funds for these payments, the call to ApproveAssignment returns an exception, and the approval is not processed. You can include an optional feedback message with the approval, which the Worker can see in the Status section of the web site.   You can also call this operation for assignments that were previous rejected and approve them by explicitly overriding the previous rejection. This only works on rejected assignments that were submitted within the previous 30 days and only if the assignment's related HIT has not been deleted. 
    */
  def approveAssignment(params: ApproveAssignmentRequest): Request[ApproveAssignmentResponse, AWSError] = js.native
  def approveAssignment(
    params: ApproveAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ApproveAssignmentResponse, Unit]
  ): Request[ApproveAssignmentResponse, AWSError] = js.native
  
  /**
    *  The AssociateQualificationWithWorker operation gives a Worker a Qualification. AssociateQualificationWithWorker does not require that the Worker submit a Qualification request. It gives the Qualification directly to the Worker.   You can only assign a Qualification of a Qualification type that you created (using the CreateQualificationType operation).    Note: AssociateQualificationWithWorker does not affect any pending Qualification requests for the Qualification by the Worker. If you assign a Qualification to a Worker, then later grant a Qualification request made by the Worker, the granting of the request may modify the Qualification score. To resolve a pending Qualification request without affecting the Qualification the Worker already has, reject the request with the RejectQualificationRequest operation.  
    */
  def associateQualificationWithWorker(): Request[AssociateQualificationWithWorkerResponse, AWSError] = js.native
  def associateQualificationWithWorker(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateQualificationWithWorkerResponse, Unit]
  ): Request[AssociateQualificationWithWorkerResponse, AWSError] = js.native
  /**
    *  The AssociateQualificationWithWorker operation gives a Worker a Qualification. AssociateQualificationWithWorker does not require that the Worker submit a Qualification request. It gives the Qualification directly to the Worker.   You can only assign a Qualification of a Qualification type that you created (using the CreateQualificationType operation).    Note: AssociateQualificationWithWorker does not affect any pending Qualification requests for the Qualification by the Worker. If you assign a Qualification to a Worker, then later grant a Qualification request made by the Worker, the granting of the request may modify the Qualification score. To resolve a pending Qualification request without affecting the Qualification the Worker already has, reject the request with the RejectQualificationRequest operation.  
    */
  def associateQualificationWithWorker(params: AssociateQualificationWithWorkerRequest): Request[AssociateQualificationWithWorkerResponse, AWSError] = js.native
  def associateQualificationWithWorker(
    params: AssociateQualificationWithWorkerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateQualificationWithWorkerResponse, Unit]
  ): Request[AssociateQualificationWithWorkerResponse, AWSError] = js.native
  
  @JSName("config")
  var config_MTurk: ConfigBase with ClientConfiguration = js.native
  
  /**
    *  The CreateAdditionalAssignmentsForHIT operation increases the maximum number of assignments of an existing HIT.   To extend the maximum number of assignments, specify the number of additional assignments.    HITs created with fewer than 10 assignments cannot be extended to have 10 or more assignments. Attempting to add assignments in a way that brings the total number of assignments for a HIT from fewer than 10 assignments to 10 or more assignments will result in an AWS.MechanicalTurk.InvalidMaximumAssignmentsIncrease exception.   HITs that were created before July 22, 2015 cannot be extended. Attempting to extend HITs that were created before July 22, 2015 will result in an AWS.MechanicalTurk.HITTooOldForExtension exception.    
    */
  def createAdditionalAssignmentsForHIT(): Request[CreateAdditionalAssignmentsForHITResponse, AWSError] = js.native
  def createAdditionalAssignmentsForHIT(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAdditionalAssignmentsForHITResponse, Unit]
  ): Request[CreateAdditionalAssignmentsForHITResponse, AWSError] = js.native
  /**
    *  The CreateAdditionalAssignmentsForHIT operation increases the maximum number of assignments of an existing HIT.   To extend the maximum number of assignments, specify the number of additional assignments.    HITs created with fewer than 10 assignments cannot be extended to have 10 or more assignments. Attempting to add assignments in a way that brings the total number of assignments for a HIT from fewer than 10 assignments to 10 or more assignments will result in an AWS.MechanicalTurk.InvalidMaximumAssignmentsIncrease exception.   HITs that were created before July 22, 2015 cannot be extended. Attempting to extend HITs that were created before July 22, 2015 will result in an AWS.MechanicalTurk.HITTooOldForExtension exception.    
    */
  def createAdditionalAssignmentsForHIT(params: CreateAdditionalAssignmentsForHITRequest): Request[CreateAdditionalAssignmentsForHITResponse, AWSError] = js.native
  def createAdditionalAssignmentsForHIT(
    params: CreateAdditionalAssignmentsForHITRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAdditionalAssignmentsForHITResponse, Unit]
  ): Request[CreateAdditionalAssignmentsForHITResponse, AWSError] = js.native
  
  /**
    * The CreateHIT operation creates a new Human Intelligence Task (HIT). The new HIT is made available for Workers to find and accept on the Amazon Mechanical Turk website.   This operation allows you to specify a new HIT by passing in values for the properties of the HIT, such as its title, reward amount and number of assignments. When you pass these values to CreateHIT, a new HIT is created for you, with a new HITTypeID. The HITTypeID can be used to create additional HITs in the future without needing to specify common parameters such as the title, description and reward amount each time.  An alternative way to create HITs is to first generate a HITTypeID using the CreateHITType operation and then call the CreateHITWithHITType operation. This is the recommended best practice for Requesters who are creating large numbers of HITs.  CreateHIT also supports several ways to provide question data: by providing a value for the Question parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated HitLayoutParameters.    If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing. 
    */
  def createHIT(): Request[CreateHITResponse, AWSError] = js.native
  def createHIT(callback: js.Function2[/* err */ AWSError, /* data */ CreateHITResponse, Unit]): Request[CreateHITResponse, AWSError] = js.native
  /**
    * The CreateHIT operation creates a new Human Intelligence Task (HIT). The new HIT is made available for Workers to find and accept on the Amazon Mechanical Turk website.   This operation allows you to specify a new HIT by passing in values for the properties of the HIT, such as its title, reward amount and number of assignments. When you pass these values to CreateHIT, a new HIT is created for you, with a new HITTypeID. The HITTypeID can be used to create additional HITs in the future without needing to specify common parameters such as the title, description and reward amount each time.  An alternative way to create HITs is to first generate a HITTypeID using the CreateHITType operation and then call the CreateHITWithHITType operation. This is the recommended best practice for Requesters who are creating large numbers of HITs.  CreateHIT also supports several ways to provide question data: by providing a value for the Question parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated HitLayoutParameters.    If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing. 
    */
  def createHIT(params: CreateHITRequest): Request[CreateHITResponse, AWSError] = js.native
  def createHIT(
    params: CreateHITRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHITResponse, Unit]
  ): Request[CreateHITResponse, AWSError] = js.native
  
  /**
    *  The CreateHITType operation creates a new HIT type. This operation allows you to define a standard set of HIT properties to use when creating HITs. If you register a HIT type with values that match an existing HIT type, the HIT type ID of the existing type will be returned. 
    */
  def createHITType(): Request[CreateHITTypeResponse, AWSError] = js.native
  def createHITType(callback: js.Function2[/* err */ AWSError, /* data */ CreateHITTypeResponse, Unit]): Request[CreateHITTypeResponse, AWSError] = js.native
  /**
    *  The CreateHITType operation creates a new HIT type. This operation allows you to define a standard set of HIT properties to use when creating HITs. If you register a HIT type with values that match an existing HIT type, the HIT type ID of the existing type will be returned. 
    */
  def createHITType(params: CreateHITTypeRequest): Request[CreateHITTypeResponse, AWSError] = js.native
  def createHITType(
    params: CreateHITTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHITTypeResponse, Unit]
  ): Request[CreateHITTypeResponse, AWSError] = js.native
  
  /**
    *  The CreateHITWithHITType operation creates a new Human Intelligence Task (HIT) using an existing HITTypeID generated by the CreateHITType operation.   This is an alternative way to create HITs from the CreateHIT operation. This is the recommended best practice for Requesters who are creating large numbers of HITs.  CreateHITWithHITType also supports several ways to provide question data: by providing a value for the Question parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated HitLayoutParameters.    If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing.  
    */
  def createHITWithHITType(): Request[CreateHITWithHITTypeResponse, AWSError] = js.native
  def createHITWithHITType(callback: js.Function2[/* err */ AWSError, /* data */ CreateHITWithHITTypeResponse, Unit]): Request[CreateHITWithHITTypeResponse, AWSError] = js.native
  /**
    *  The CreateHITWithHITType operation creates a new Human Intelligence Task (HIT) using an existing HITTypeID generated by the CreateHITType operation.   This is an alternative way to create HITs from the CreateHIT operation. This is the recommended best practice for Requesters who are creating large numbers of HITs.  CreateHITWithHITType also supports several ways to provide question data: by providing a value for the Question parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated HitLayoutParameters.    If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing.  
    */
  def createHITWithHITType(params: CreateHITWithHITTypeRequest): Request[CreateHITWithHITTypeResponse, AWSError] = js.native
  def createHITWithHITType(
    params: CreateHITWithHITTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHITWithHITTypeResponse, Unit]
  ): Request[CreateHITWithHITTypeResponse, AWSError] = js.native
  
  /**
    *  The CreateQualificationType operation creates a new Qualification type, which is represented by a QualificationType data structure. 
    */
  def createQualificationType(): Request[CreateQualificationTypeResponse, AWSError] = js.native
  def createQualificationType(callback: js.Function2[/* err */ AWSError, /* data */ CreateQualificationTypeResponse, Unit]): Request[CreateQualificationTypeResponse, AWSError] = js.native
  /**
    *  The CreateQualificationType operation creates a new Qualification type, which is represented by a QualificationType data structure. 
    */
  def createQualificationType(params: CreateQualificationTypeRequest): Request[CreateQualificationTypeResponse, AWSError] = js.native
  def createQualificationType(
    params: CreateQualificationTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateQualificationTypeResponse, Unit]
  ): Request[CreateQualificationTypeResponse, AWSError] = js.native
  
  /**
    * The CreateWorkerBlock operation allows you to prevent a Worker from working on your HITs. For example, you can block a Worker who is producing poor quality work. You can block up to 100,000 Workers.
    */
  def createWorkerBlock(): Request[CreateWorkerBlockResponse, AWSError] = js.native
  def createWorkerBlock(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkerBlockResponse, Unit]): Request[CreateWorkerBlockResponse, AWSError] = js.native
  /**
    * The CreateWorkerBlock operation allows you to prevent a Worker from working on your HITs. For example, you can block a Worker who is producing poor quality work. You can block up to 100,000 Workers.
    */
  def createWorkerBlock(params: CreateWorkerBlockRequest): Request[CreateWorkerBlockResponse, AWSError] = js.native
  def createWorkerBlock(
    params: CreateWorkerBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkerBlockResponse, Unit]
  ): Request[CreateWorkerBlockResponse, AWSError] = js.native
  
  /**
    *  The DeleteHIT operation is used to delete HIT that is no longer needed. Only the Requester who created the HIT can delete it.   You can only dispose of HITs that are in the Reviewable state, with all of their submitted assignments already either approved or rejected. If you call the DeleteHIT operation on a HIT that is not in the Reviewable state (for example, that has not expired, or still has active assignments), or on a HIT that is Reviewable but without all of its submitted assignments already approved or rejected, the service will return an error.      HITs are automatically disposed of after 120 days.     After you dispose of a HIT, you can no longer approve the HIT's rejected assignments.     Disposed HITs are not returned in results for the ListHITs operation.     Disposing HITs can improve the performance of operations such as ListReviewableHITs and ListHITs.    
    */
  def deleteHIT(): Request[DeleteHITResponse, AWSError] = js.native
  def deleteHIT(callback: js.Function2[/* err */ AWSError, /* data */ DeleteHITResponse, Unit]): Request[DeleteHITResponse, AWSError] = js.native
  /**
    *  The DeleteHIT operation is used to delete HIT that is no longer needed. Only the Requester who created the HIT can delete it.   You can only dispose of HITs that are in the Reviewable state, with all of their submitted assignments already either approved or rejected. If you call the DeleteHIT operation on a HIT that is not in the Reviewable state (for example, that has not expired, or still has active assignments), or on a HIT that is Reviewable but without all of its submitted assignments already approved or rejected, the service will return an error.      HITs are automatically disposed of after 120 days.     After you dispose of a HIT, you can no longer approve the HIT's rejected assignments.     Disposed HITs are not returned in results for the ListHITs operation.     Disposing HITs can improve the performance of operations such as ListReviewableHITs and ListHITs.    
    */
  def deleteHIT(params: DeleteHITRequest): Request[DeleteHITResponse, AWSError] = js.native
  def deleteHIT(
    params: DeleteHITRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteHITResponse, Unit]
  ): Request[DeleteHITResponse, AWSError] = js.native
  
  /**
    *  The DeleteQualificationType deletes a Qualification type and deletes any HIT types that are associated with the Qualification type.  This operation does not revoke Qualifications already assigned to Workers because the Qualifications might be needed for active HITs. If there are any pending requests for the Qualification type, Amazon Mechanical Turk rejects those requests. After you delete a Qualification type, you can no longer use it to create HITs or HIT types.  DeleteQualificationType must wait for all the HITs that use the deleted Qualification type to be deleted before completing. It may take up to 48 hours before DeleteQualificationType completes and the unique name of the Qualification type is available for reuse with CreateQualificationType. 
    */
  def deleteQualificationType(): Request[DeleteQualificationTypeResponse, AWSError] = js.native
  def deleteQualificationType(callback: js.Function2[/* err */ AWSError, /* data */ DeleteQualificationTypeResponse, Unit]): Request[DeleteQualificationTypeResponse, AWSError] = js.native
  /**
    *  The DeleteQualificationType deletes a Qualification type and deletes any HIT types that are associated with the Qualification type.  This operation does not revoke Qualifications already assigned to Workers because the Qualifications might be needed for active HITs. If there are any pending requests for the Qualification type, Amazon Mechanical Turk rejects those requests. After you delete a Qualification type, you can no longer use it to create HITs or HIT types.  DeleteQualificationType must wait for all the HITs that use the deleted Qualification type to be deleted before completing. It may take up to 48 hours before DeleteQualificationType completes and the unique name of the Qualification type is available for reuse with CreateQualificationType. 
    */
  def deleteQualificationType(params: DeleteQualificationTypeRequest): Request[DeleteQualificationTypeResponse, AWSError] = js.native
  def deleteQualificationType(
    params: DeleteQualificationTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteQualificationTypeResponse, Unit]
  ): Request[DeleteQualificationTypeResponse, AWSError] = js.native
  
  /**
    * The DeleteWorkerBlock operation allows you to reinstate a blocked Worker to work on your HITs. This operation reverses the effects of the CreateWorkerBlock operation. You need the Worker ID to use this operation. If the Worker ID is missing or invalid, this operation fails and returns the message “WorkerId is invalid.” If the specified Worker is not blocked, this operation returns successfully.
    */
  def deleteWorkerBlock(): Request[DeleteWorkerBlockResponse, AWSError] = js.native
  def deleteWorkerBlock(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkerBlockResponse, Unit]): Request[DeleteWorkerBlockResponse, AWSError] = js.native
  /**
    * The DeleteWorkerBlock operation allows you to reinstate a blocked Worker to work on your HITs. This operation reverses the effects of the CreateWorkerBlock operation. You need the Worker ID to use this operation. If the Worker ID is missing or invalid, this operation fails and returns the message “WorkerId is invalid.” If the specified Worker is not blocked, this operation returns successfully.
    */
  def deleteWorkerBlock(params: DeleteWorkerBlockRequest): Request[DeleteWorkerBlockResponse, AWSError] = js.native
  def deleteWorkerBlock(
    params: DeleteWorkerBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkerBlockResponse, Unit]
  ): Request[DeleteWorkerBlockResponse, AWSError] = js.native
  
  /**
    *  The DisassociateQualificationFromWorker revokes a previously granted Qualification from a user.   You can provide a text message explaining why the Qualification was revoked. The user who had the Qualification can see this message. 
    */
  def disassociateQualificationFromWorker(): Request[DisassociateQualificationFromWorkerResponse, AWSError] = js.native
  def disassociateQualificationFromWorker(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateQualificationFromWorkerResponse, Unit]
  ): Request[DisassociateQualificationFromWorkerResponse, AWSError] = js.native
  /**
    *  The DisassociateQualificationFromWorker revokes a previously granted Qualification from a user.   You can provide a text message explaining why the Qualification was revoked. The user who had the Qualification can see this message. 
    */
  def disassociateQualificationFromWorker(params: DisassociateQualificationFromWorkerRequest): Request[DisassociateQualificationFromWorkerResponse, AWSError] = js.native
  def disassociateQualificationFromWorker(
    params: DisassociateQualificationFromWorkerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateQualificationFromWorkerResponse, Unit]
  ): Request[DisassociateQualificationFromWorkerResponse, AWSError] = js.native
  
  /**
    * The GetAccountBalance operation retrieves the amount of money in your Amazon Mechanical Turk account.
    */
  def getAccountBalance(): Request[GetAccountBalanceResponse, AWSError] = js.native
  def getAccountBalance(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountBalanceResponse, Unit]): Request[GetAccountBalanceResponse, AWSError] = js.native
  /**
    * The GetAccountBalance operation retrieves the amount of money in your Amazon Mechanical Turk account.
    */
  def getAccountBalance(params: GetAccountBalanceRequest): Request[GetAccountBalanceResponse, AWSError] = js.native
  def getAccountBalance(
    params: GetAccountBalanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountBalanceResponse, Unit]
  ): Request[GetAccountBalanceResponse, AWSError] = js.native
  
  /**
    *  The GetAssignment operation retrieves the details of the specified Assignment. 
    */
  def getAssignment(): Request[GetAssignmentResponse, AWSError] = js.native
  def getAssignment(callback: js.Function2[/* err */ AWSError, /* data */ GetAssignmentResponse, Unit]): Request[GetAssignmentResponse, AWSError] = js.native
  /**
    *  The GetAssignment operation retrieves the details of the specified Assignment. 
    */
  def getAssignment(params: GetAssignmentRequest): Request[GetAssignmentResponse, AWSError] = js.native
  def getAssignment(
    params: GetAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssignmentResponse, Unit]
  ): Request[GetAssignmentResponse, AWSError] = js.native
  
  /**
    *  The GetFileUploadURL operation generates and returns a temporary URL. You use the temporary URL to retrieve a file uploaded by a Worker as an answer to a FileUploadAnswer question for a HIT. The temporary URL is generated the instant the GetFileUploadURL operation is called, and is valid for 60 seconds. You can get a temporary file upload URL any time until the HIT is disposed. After the HIT is disposed, any uploaded files are deleted, and cannot be retrieved. Pending Deprecation on December 12, 2017. The Answer Specification structure will no longer support the FileUploadAnswer element to be used for the QuestionForm data structure. Instead, we recommend that Requesters who want to create HITs asking Workers to upload files to use Amazon S3. 
    */
  def getFileUploadURL(): Request[GetFileUploadURLResponse, AWSError] = js.native
  def getFileUploadURL(callback: js.Function2[/* err */ AWSError, /* data */ GetFileUploadURLResponse, Unit]): Request[GetFileUploadURLResponse, AWSError] = js.native
  /**
    *  The GetFileUploadURL operation generates and returns a temporary URL. You use the temporary URL to retrieve a file uploaded by a Worker as an answer to a FileUploadAnswer question for a HIT. The temporary URL is generated the instant the GetFileUploadURL operation is called, and is valid for 60 seconds. You can get a temporary file upload URL any time until the HIT is disposed. After the HIT is disposed, any uploaded files are deleted, and cannot be retrieved. Pending Deprecation on December 12, 2017. The Answer Specification structure will no longer support the FileUploadAnswer element to be used for the QuestionForm data structure. Instead, we recommend that Requesters who want to create HITs asking Workers to upload files to use Amazon S3. 
    */
  def getFileUploadURL(params: GetFileUploadURLRequest): Request[GetFileUploadURLResponse, AWSError] = js.native
  def getFileUploadURL(
    params: GetFileUploadURLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFileUploadURLResponse, Unit]
  ): Request[GetFileUploadURLResponse, AWSError] = js.native
  
  /**
    *  The GetHIT operation retrieves the details of the specified HIT. 
    */
  def getHIT(): Request[GetHITResponse, AWSError] = js.native
  def getHIT(callback: js.Function2[/* err */ AWSError, /* data */ GetHITResponse, Unit]): Request[GetHITResponse, AWSError] = js.native
  /**
    *  The GetHIT operation retrieves the details of the specified HIT. 
    */
  def getHIT(params: GetHITRequest): Request[GetHITResponse, AWSError] = js.native
  def getHIT(params: GetHITRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetHITResponse, Unit]): Request[GetHITResponse, AWSError] = js.native
  
  /**
    *  The GetQualificationScore operation returns the value of a Worker's Qualification for a given Qualification type.   To get a Worker's Qualification, you must know the Worker's ID. The Worker's ID is included in the assignment data returned by the ListAssignmentsForHIT operation.  Only the owner of a Qualification type can query the value of a Worker's Qualification of that type.
    */
  def getQualificationScore(): Request[GetQualificationScoreResponse, AWSError] = js.native
  def getQualificationScore(callback: js.Function2[/* err */ AWSError, /* data */ GetQualificationScoreResponse, Unit]): Request[GetQualificationScoreResponse, AWSError] = js.native
  /**
    *  The GetQualificationScore operation returns the value of a Worker's Qualification for a given Qualification type.   To get a Worker's Qualification, you must know the Worker's ID. The Worker's ID is included in the assignment data returned by the ListAssignmentsForHIT operation.  Only the owner of a Qualification type can query the value of a Worker's Qualification of that type.
    */
  def getQualificationScore(params: GetQualificationScoreRequest): Request[GetQualificationScoreResponse, AWSError] = js.native
  def getQualificationScore(
    params: GetQualificationScoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQualificationScoreResponse, Unit]
  ): Request[GetQualificationScoreResponse, AWSError] = js.native
  
  /**
    *  The GetQualificationTypeoperation retrieves information about a Qualification type using its ID. 
    */
  def getQualificationType(): Request[GetQualificationTypeResponse, AWSError] = js.native
  def getQualificationType(callback: js.Function2[/* err */ AWSError, /* data */ GetQualificationTypeResponse, Unit]): Request[GetQualificationTypeResponse, AWSError] = js.native
  /**
    *  The GetQualificationTypeoperation retrieves information about a Qualification type using its ID. 
    */
  def getQualificationType(params: GetQualificationTypeRequest): Request[GetQualificationTypeResponse, AWSError] = js.native
  def getQualificationType(
    params: GetQualificationTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQualificationTypeResponse, Unit]
  ): Request[GetQualificationTypeResponse, AWSError] = js.native
  
  /**
    *  The ListAssignmentsForHIT operation retrieves completed assignments for a HIT. You can use this operation to retrieve the results for a HIT.   You can get assignments for a HIT at any time, even if the HIT is not yet Reviewable. If a HIT requested multiple assignments, and has received some results but has not yet become Reviewable, you can still retrieve the partial results with this operation.   Use the AssignmentStatus parameter to control which set of assignments for a HIT are returned. The ListAssignmentsForHIT operation can return submitted assignments awaiting approval, or it can return assignments that have already been approved or rejected. You can set AssignmentStatus=Approved,Rejected to get assignments that have already been approved and rejected together in one result set.   Only the Requester who created the HIT can retrieve the assignments for that HIT.   Results are sorted and divided into numbered pages and the operation returns a single page of results. You can use the parameters of the operation to control sorting and pagination. 
    */
  def listAssignmentsForHIT(): Request[ListAssignmentsForHITResponse, AWSError] = js.native
  def listAssignmentsForHIT(callback: js.Function2[/* err */ AWSError, /* data */ ListAssignmentsForHITResponse, Unit]): Request[ListAssignmentsForHITResponse, AWSError] = js.native
  /**
    *  The ListAssignmentsForHIT operation retrieves completed assignments for a HIT. You can use this operation to retrieve the results for a HIT.   You can get assignments for a HIT at any time, even if the HIT is not yet Reviewable. If a HIT requested multiple assignments, and has received some results but has not yet become Reviewable, you can still retrieve the partial results with this operation.   Use the AssignmentStatus parameter to control which set of assignments for a HIT are returned. The ListAssignmentsForHIT operation can return submitted assignments awaiting approval, or it can return assignments that have already been approved or rejected. You can set AssignmentStatus=Approved,Rejected to get assignments that have already been approved and rejected together in one result set.   Only the Requester who created the HIT can retrieve the assignments for that HIT.   Results are sorted and divided into numbered pages and the operation returns a single page of results. You can use the parameters of the operation to control sorting and pagination. 
    */
  def listAssignmentsForHIT(params: ListAssignmentsForHITRequest): Request[ListAssignmentsForHITResponse, AWSError] = js.native
  def listAssignmentsForHIT(
    params: ListAssignmentsForHITRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssignmentsForHITResponse, Unit]
  ): Request[ListAssignmentsForHITResponse, AWSError] = js.native
  
  /**
    *  The ListBonusPayments operation retrieves the amounts of bonuses you have paid to Workers for a given HIT or assignment. 
    */
  def listBonusPayments(): Request[ListBonusPaymentsResponse, AWSError] = js.native
  def listBonusPayments(callback: js.Function2[/* err */ AWSError, /* data */ ListBonusPaymentsResponse, Unit]): Request[ListBonusPaymentsResponse, AWSError] = js.native
  /**
    *  The ListBonusPayments operation retrieves the amounts of bonuses you have paid to Workers for a given HIT or assignment. 
    */
  def listBonusPayments(params: ListBonusPaymentsRequest): Request[ListBonusPaymentsResponse, AWSError] = js.native
  def listBonusPayments(
    params: ListBonusPaymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBonusPaymentsResponse, Unit]
  ): Request[ListBonusPaymentsResponse, AWSError] = js.native
  
  /**
    *  The ListHITs operation returns all of a Requester's HITs. The operation returns HITs of any status, except for HITs that have been deleted of with the DeleteHIT operation or that have been auto-deleted. 
    */
  def listHITs(): Request[ListHITsResponse, AWSError] = js.native
  def listHITs(callback: js.Function2[/* err */ AWSError, /* data */ ListHITsResponse, Unit]): Request[ListHITsResponse, AWSError] = js.native
  /**
    *  The ListHITs operation returns all of a Requester's HITs. The operation returns HITs of any status, except for HITs that have been deleted of with the DeleteHIT operation or that have been auto-deleted. 
    */
  def listHITs(params: ListHITsRequest): Request[ListHITsResponse, AWSError] = js.native
  def listHITs(
    params: ListHITsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHITsResponse, Unit]
  ): Request[ListHITsResponse, AWSError] = js.native
  
  /**
    *  The ListHITsForQualificationType operation returns the HITs that use the given Qualification type for a Qualification requirement. The operation returns HITs of any status, except for HITs that have been deleted with the DeleteHIT operation or that have been auto-deleted. 
    */
  def listHITsForQualificationType(): Request[ListHITsForQualificationTypeResponse, AWSError] = js.native
  def listHITsForQualificationType(callback: js.Function2[/* err */ AWSError, /* data */ ListHITsForQualificationTypeResponse, Unit]): Request[ListHITsForQualificationTypeResponse, AWSError] = js.native
  /**
    *  The ListHITsForQualificationType operation returns the HITs that use the given Qualification type for a Qualification requirement. The operation returns HITs of any status, except for HITs that have been deleted with the DeleteHIT operation or that have been auto-deleted. 
    */
  def listHITsForQualificationType(params: ListHITsForQualificationTypeRequest): Request[ListHITsForQualificationTypeResponse, AWSError] = js.native
  def listHITsForQualificationType(
    params: ListHITsForQualificationTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHITsForQualificationTypeResponse, Unit]
  ): Request[ListHITsForQualificationTypeResponse, AWSError] = js.native
  
  /**
    *  The ListQualificationRequests operation retrieves requests for Qualifications of a particular Qualification type. The owner of the Qualification type calls this operation to poll for pending requests, and accepts them using the AcceptQualification operation. 
    */
  def listQualificationRequests(): Request[ListQualificationRequestsResponse, AWSError] = js.native
  def listQualificationRequests(callback: js.Function2[/* err */ AWSError, /* data */ ListQualificationRequestsResponse, Unit]): Request[ListQualificationRequestsResponse, AWSError] = js.native
  /**
    *  The ListQualificationRequests operation retrieves requests for Qualifications of a particular Qualification type. The owner of the Qualification type calls this operation to poll for pending requests, and accepts them using the AcceptQualification operation. 
    */
  def listQualificationRequests(params: ListQualificationRequestsRequest): Request[ListQualificationRequestsResponse, AWSError] = js.native
  def listQualificationRequests(
    params: ListQualificationRequestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQualificationRequestsResponse, Unit]
  ): Request[ListQualificationRequestsResponse, AWSError] = js.native
  
  /**
    *  The ListQualificationTypes operation returns a list of Qualification types, filtered by an optional search term. 
    */
  def listQualificationTypes(): Request[ListQualificationTypesResponse, AWSError] = js.native
  def listQualificationTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListQualificationTypesResponse, Unit]): Request[ListQualificationTypesResponse, AWSError] = js.native
  /**
    *  The ListQualificationTypes operation returns a list of Qualification types, filtered by an optional search term. 
    */
  def listQualificationTypes(params: ListQualificationTypesRequest): Request[ListQualificationTypesResponse, AWSError] = js.native
  def listQualificationTypes(
    params: ListQualificationTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQualificationTypesResponse, Unit]
  ): Request[ListQualificationTypesResponse, AWSError] = js.native
  
  /**
    *  The ListReviewPolicyResultsForHIT operation retrieves the computed results and the actions taken in the course of executing your Review Policies for a given HIT. For information about how to specify Review Policies when you call CreateHIT, see Review Policies. The ListReviewPolicyResultsForHIT operation can return results for both Assignment-level and HIT-level review results. 
    */
  def listReviewPolicyResultsForHIT(): Request[ListReviewPolicyResultsForHITResponse, AWSError] = js.native
  def listReviewPolicyResultsForHIT(callback: js.Function2[/* err */ AWSError, /* data */ ListReviewPolicyResultsForHITResponse, Unit]): Request[ListReviewPolicyResultsForHITResponse, AWSError] = js.native
  /**
    *  The ListReviewPolicyResultsForHIT operation retrieves the computed results and the actions taken in the course of executing your Review Policies for a given HIT. For information about how to specify Review Policies when you call CreateHIT, see Review Policies. The ListReviewPolicyResultsForHIT operation can return results for both Assignment-level and HIT-level review results. 
    */
  def listReviewPolicyResultsForHIT(params: ListReviewPolicyResultsForHITRequest): Request[ListReviewPolicyResultsForHITResponse, AWSError] = js.native
  def listReviewPolicyResultsForHIT(
    params: ListReviewPolicyResultsForHITRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReviewPolicyResultsForHITResponse, Unit]
  ): Request[ListReviewPolicyResultsForHITResponse, AWSError] = js.native
  
  /**
    *  The ListReviewableHITs operation retrieves the HITs with Status equal to Reviewable or Status equal to Reviewing that belong to the Requester calling the operation. 
    */
  def listReviewableHITs(): Request[ListReviewableHITsResponse, AWSError] = js.native
  def listReviewableHITs(callback: js.Function2[/* err */ AWSError, /* data */ ListReviewableHITsResponse, Unit]): Request[ListReviewableHITsResponse, AWSError] = js.native
  /**
    *  The ListReviewableHITs operation retrieves the HITs with Status equal to Reviewable or Status equal to Reviewing that belong to the Requester calling the operation. 
    */
  def listReviewableHITs(params: ListReviewableHITsRequest): Request[ListReviewableHITsResponse, AWSError] = js.native
  def listReviewableHITs(
    params: ListReviewableHITsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReviewableHITsResponse, Unit]
  ): Request[ListReviewableHITsResponse, AWSError] = js.native
  
  /**
    * The ListWorkersBlocks operation retrieves a list of Workers who are blocked from working on your HITs.
    */
  def listWorkerBlocks(): Request[ListWorkerBlocksResponse, AWSError] = js.native
  def listWorkerBlocks(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkerBlocksResponse, Unit]): Request[ListWorkerBlocksResponse, AWSError] = js.native
  /**
    * The ListWorkersBlocks operation retrieves a list of Workers who are blocked from working on your HITs.
    */
  def listWorkerBlocks(params: ListWorkerBlocksRequest): Request[ListWorkerBlocksResponse, AWSError] = js.native
  def listWorkerBlocks(
    params: ListWorkerBlocksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkerBlocksResponse, Unit]
  ): Request[ListWorkerBlocksResponse, AWSError] = js.native
  
  /**
    *  The ListWorkersWithQualificationType operation returns all of the Workers that have been associated with a given Qualification type. 
    */
  def listWorkersWithQualificationType(): Request[ListWorkersWithQualificationTypeResponse, AWSError] = js.native
  def listWorkersWithQualificationType(
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkersWithQualificationTypeResponse, Unit]
  ): Request[ListWorkersWithQualificationTypeResponse, AWSError] = js.native
  /**
    *  The ListWorkersWithQualificationType operation returns all of the Workers that have been associated with a given Qualification type. 
    */
  def listWorkersWithQualificationType(params: ListWorkersWithQualificationTypeRequest): Request[ListWorkersWithQualificationTypeResponse, AWSError] = js.native
  def listWorkersWithQualificationType(
    params: ListWorkersWithQualificationTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkersWithQualificationTypeResponse, Unit]
  ): Request[ListWorkersWithQualificationTypeResponse, AWSError] = js.native
  
  /**
    *  The NotifyWorkers operation sends an email to one or more Workers that you specify with the Worker ID. You can specify up to 100 Worker IDs to send the same message with a single call to the NotifyWorkers operation. The NotifyWorkers operation will send a notification email to a Worker only if you have previously approved or rejected work from the Worker. 
    */
  def notifyWorkers(): Request[NotifyWorkersResponse, AWSError] = js.native
  def notifyWorkers(callback: js.Function2[/* err */ AWSError, /* data */ NotifyWorkersResponse, Unit]): Request[NotifyWorkersResponse, AWSError] = js.native
  /**
    *  The NotifyWorkers operation sends an email to one or more Workers that you specify with the Worker ID. You can specify up to 100 Worker IDs to send the same message with a single call to the NotifyWorkers operation. The NotifyWorkers operation will send a notification email to a Worker only if you have previously approved or rejected work from the Worker. 
    */
  def notifyWorkers(params: NotifyWorkersRequest): Request[NotifyWorkersResponse, AWSError] = js.native
  def notifyWorkers(
    params: NotifyWorkersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ NotifyWorkersResponse, Unit]
  ): Request[NotifyWorkersResponse, AWSError] = js.native
  
  /**
    *  The RejectAssignment operation rejects the results of a completed assignment.   You can include an optional feedback message with the rejection, which the Worker can see in the Status section of the web site. When you include a feedback message with the rejection, it helps the Worker understand why the assignment was rejected, and can improve the quality of the results the Worker submits in the future.   Only the Requester who created the HIT can reject an assignment for the HIT. 
    */
  def rejectAssignment(): Request[RejectAssignmentResponse, AWSError] = js.native
  def rejectAssignment(callback: js.Function2[/* err */ AWSError, /* data */ RejectAssignmentResponse, Unit]): Request[RejectAssignmentResponse, AWSError] = js.native
  /**
    *  The RejectAssignment operation rejects the results of a completed assignment.   You can include an optional feedback message with the rejection, which the Worker can see in the Status section of the web site. When you include a feedback message with the rejection, it helps the Worker understand why the assignment was rejected, and can improve the quality of the results the Worker submits in the future.   Only the Requester who created the HIT can reject an assignment for the HIT. 
    */
  def rejectAssignment(params: RejectAssignmentRequest): Request[RejectAssignmentResponse, AWSError] = js.native
  def rejectAssignment(
    params: RejectAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectAssignmentResponse, Unit]
  ): Request[RejectAssignmentResponse, AWSError] = js.native
  
  /**
    *  The RejectQualificationRequest operation rejects a user's request for a Qualification.   You can provide a text message explaining why the request was rejected. The Worker who made the request can see this message.
    */
  def rejectQualificationRequest(): Request[RejectQualificationRequestResponse, AWSError] = js.native
  def rejectQualificationRequest(callback: js.Function2[/* err */ AWSError, /* data */ RejectQualificationRequestResponse, Unit]): Request[RejectQualificationRequestResponse, AWSError] = js.native
  /**
    *  The RejectQualificationRequest operation rejects a user's request for a Qualification.   You can provide a text message explaining why the request was rejected. The Worker who made the request can see this message.
    */
  def rejectQualificationRequest(params: RejectQualificationRequestRequest): Request[RejectQualificationRequestResponse, AWSError] = js.native
  def rejectQualificationRequest(
    params: RejectQualificationRequestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectQualificationRequestResponse, Unit]
  ): Request[RejectQualificationRequestResponse, AWSError] = js.native
  
  /**
    *  The SendBonus operation issues a payment of money from your account to a Worker. This payment happens separately from the reward you pay to the Worker when you approve the Worker's assignment. The SendBonus operation requires the Worker's ID and the assignment ID as parameters to initiate payment of the bonus. You must include a message that explains the reason for the bonus payment, as the Worker may not be expecting the payment. Amazon Mechanical Turk collects a fee for bonus payments, similar to the HIT listing fee. This operation fails if your account does not have enough funds to pay for both the bonus and the fees. 
    */
  def sendBonus(): Request[SendBonusResponse, AWSError] = js.native
  def sendBonus(callback: js.Function2[/* err */ AWSError, /* data */ SendBonusResponse, Unit]): Request[SendBonusResponse, AWSError] = js.native
  /**
    *  The SendBonus operation issues a payment of money from your account to a Worker. This payment happens separately from the reward you pay to the Worker when you approve the Worker's assignment. The SendBonus operation requires the Worker's ID and the assignment ID as parameters to initiate payment of the bonus. You must include a message that explains the reason for the bonus payment, as the Worker may not be expecting the payment. Amazon Mechanical Turk collects a fee for bonus payments, similar to the HIT listing fee. This operation fails if your account does not have enough funds to pay for both the bonus and the fees. 
    */
  def sendBonus(params: SendBonusRequest): Request[SendBonusResponse, AWSError] = js.native
  def sendBonus(
    params: SendBonusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendBonusResponse, Unit]
  ): Request[SendBonusResponse, AWSError] = js.native
  
  /**
    *  The SendTestEventNotification operation causes Amazon Mechanical Turk to send a notification message as if a HIT event occurred, according to the provided notification specification. This allows you to test notifications without setting up notifications for a real HIT type and trying to trigger them using the website. When you call this operation, the service attempts to send the test notification immediately. 
    */
  def sendTestEventNotification(): Request[SendTestEventNotificationResponse, AWSError] = js.native
  def sendTestEventNotification(callback: js.Function2[/* err */ AWSError, /* data */ SendTestEventNotificationResponse, Unit]): Request[SendTestEventNotificationResponse, AWSError] = js.native
  /**
    *  The SendTestEventNotification operation causes Amazon Mechanical Turk to send a notification message as if a HIT event occurred, according to the provided notification specification. This allows you to test notifications without setting up notifications for a real HIT type and trying to trigger them using the website. When you call this operation, the service attempts to send the test notification immediately. 
    */
  def sendTestEventNotification(params: SendTestEventNotificationRequest): Request[SendTestEventNotificationResponse, AWSError] = js.native
  def sendTestEventNotification(
    params: SendTestEventNotificationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendTestEventNotificationResponse, Unit]
  ): Request[SendTestEventNotificationResponse, AWSError] = js.native
  
  /**
    *  The UpdateExpirationForHIT operation allows you update the expiration time of a HIT. If you update it to a time in the past, the HIT will be immediately expired. 
    */
  def updateExpirationForHIT(): Request[UpdateExpirationForHITResponse, AWSError] = js.native
  def updateExpirationForHIT(callback: js.Function2[/* err */ AWSError, /* data */ UpdateExpirationForHITResponse, Unit]): Request[UpdateExpirationForHITResponse, AWSError] = js.native
  /**
    *  The UpdateExpirationForHIT operation allows you update the expiration time of a HIT. If you update it to a time in the past, the HIT will be immediately expired. 
    */
  def updateExpirationForHIT(params: UpdateExpirationForHITRequest): Request[UpdateExpirationForHITResponse, AWSError] = js.native
  def updateExpirationForHIT(
    params: UpdateExpirationForHITRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateExpirationForHITResponse, Unit]
  ): Request[UpdateExpirationForHITResponse, AWSError] = js.native
  
  /**
    *  The UpdateHITReviewStatus operation updates the status of a HIT. If the status is Reviewable, this operation can update the status to Reviewing, or it can revert a Reviewing HIT back to the Reviewable status. 
    */
  def updateHITReviewStatus(): Request[UpdateHITReviewStatusResponse, AWSError] = js.native
  def updateHITReviewStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdateHITReviewStatusResponse, Unit]): Request[UpdateHITReviewStatusResponse, AWSError] = js.native
  /**
    *  The UpdateHITReviewStatus operation updates the status of a HIT. If the status is Reviewable, this operation can update the status to Reviewing, or it can revert a Reviewing HIT back to the Reviewable status. 
    */
  def updateHITReviewStatus(params: UpdateHITReviewStatusRequest): Request[UpdateHITReviewStatusResponse, AWSError] = js.native
  def updateHITReviewStatus(
    params: UpdateHITReviewStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateHITReviewStatusResponse, Unit]
  ): Request[UpdateHITReviewStatusResponse, AWSError] = js.native
  
  /**
    *  The UpdateHITTypeOfHIT operation allows you to change the HITType properties of a HIT. This operation disassociates the HIT from its old HITType properties and associates it with the new HITType properties. The HIT takes on the properties of the new HITType in place of the old ones. 
    */
  def updateHITTypeOfHIT(): Request[UpdateHITTypeOfHITResponse, AWSError] = js.native
  def updateHITTypeOfHIT(callback: js.Function2[/* err */ AWSError, /* data */ UpdateHITTypeOfHITResponse, Unit]): Request[UpdateHITTypeOfHITResponse, AWSError] = js.native
  /**
    *  The UpdateHITTypeOfHIT operation allows you to change the HITType properties of a HIT. This operation disassociates the HIT from its old HITType properties and associates it with the new HITType properties. The HIT takes on the properties of the new HITType in place of the old ones. 
    */
  def updateHITTypeOfHIT(params: UpdateHITTypeOfHITRequest): Request[UpdateHITTypeOfHITResponse, AWSError] = js.native
  def updateHITTypeOfHIT(
    params: UpdateHITTypeOfHITRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateHITTypeOfHITResponse, Unit]
  ): Request[UpdateHITTypeOfHITResponse, AWSError] = js.native
  
  /**
    *  The UpdateNotificationSettings operation creates, updates, disables or re-enables notifications for a HIT type. If you call the UpdateNotificationSettings operation for a HIT type that already has a notification specification, the operation replaces the old specification with a new one. You can call the UpdateNotificationSettings operation to enable or disable notifications for the HIT type, without having to modify the notification specification itself by providing updates to the Active status without specifying a new notification specification. To change the Active status of a HIT type's notifications, the HIT type must already have a notification specification, or one must be provided in the same call to UpdateNotificationSettings. 
    */
  def updateNotificationSettings(): Request[UpdateNotificationSettingsResponse, AWSError] = js.native
  def updateNotificationSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotificationSettingsResponse, Unit]): Request[UpdateNotificationSettingsResponse, AWSError] = js.native
  /**
    *  The UpdateNotificationSettings operation creates, updates, disables or re-enables notifications for a HIT type. If you call the UpdateNotificationSettings operation for a HIT type that already has a notification specification, the operation replaces the old specification with a new one. You can call the UpdateNotificationSettings operation to enable or disable notifications for the HIT type, without having to modify the notification specification itself by providing updates to the Active status without specifying a new notification specification. To change the Active status of a HIT type's notifications, the HIT type must already have a notification specification, or one must be provided in the same call to UpdateNotificationSettings. 
    */
  def updateNotificationSettings(params: UpdateNotificationSettingsRequest): Request[UpdateNotificationSettingsResponse, AWSError] = js.native
  def updateNotificationSettings(
    params: UpdateNotificationSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotificationSettingsResponse, Unit]
  ): Request[UpdateNotificationSettingsResponse, AWSError] = js.native
  
  /**
    *  The UpdateQualificationType operation modifies the attributes of an existing Qualification type, which is represented by a QualificationType data structure. Only the owner of a Qualification type can modify its attributes.   Most attributes of a Qualification type can be changed after the type has been created. However, the Name and Keywords fields cannot be modified. The RetryDelayInSeconds parameter can be modified or added to change the delay or to enable retries, but RetryDelayInSeconds cannot be used to disable retries.   You can use this operation to update the test for a Qualification type. The test is updated based on the values specified for the Test, TestDurationInSeconds and AnswerKey parameters. All three parameters specify the updated test. If you are updating the test for a type, you must specify the Test and TestDurationInSeconds parameters. The AnswerKey parameter is optional; omitting it specifies that the updated test does not have an answer key.   If you omit the Test parameter, the test for the Qualification type is unchanged. There is no way to remove a test from a Qualification type that has one. If the type already has a test, you cannot update it to be AutoGranted. If the Qualification type does not have a test and one is provided by an update, the type will henceforth have a test.   If you want to update the test duration or answer key for an existing test without changing the questions, you must specify a Test parameter with the original questions, along with the updated values.   If you provide an updated Test but no AnswerKey, the new test will not have an answer key. Requests for such Qualifications must be granted manually.   You can also update the AutoGranted and AutoGrantedValue attributes of the Qualification type.
    */
  def updateQualificationType(): Request[UpdateQualificationTypeResponse, AWSError] = js.native
  def updateQualificationType(callback: js.Function2[/* err */ AWSError, /* data */ UpdateQualificationTypeResponse, Unit]): Request[UpdateQualificationTypeResponse, AWSError] = js.native
  /**
    *  The UpdateQualificationType operation modifies the attributes of an existing Qualification type, which is represented by a QualificationType data structure. Only the owner of a Qualification type can modify its attributes.   Most attributes of a Qualification type can be changed after the type has been created. However, the Name and Keywords fields cannot be modified. The RetryDelayInSeconds parameter can be modified or added to change the delay or to enable retries, but RetryDelayInSeconds cannot be used to disable retries.   You can use this operation to update the test for a Qualification type. The test is updated based on the values specified for the Test, TestDurationInSeconds and AnswerKey parameters. All three parameters specify the updated test. If you are updating the test for a type, you must specify the Test and TestDurationInSeconds parameters. The AnswerKey parameter is optional; omitting it specifies that the updated test does not have an answer key.   If you omit the Test parameter, the test for the Qualification type is unchanged. There is no way to remove a test from a Qualification type that has one. If the type already has a test, you cannot update it to be AutoGranted. If the Qualification type does not have a test and one is provided by an update, the type will henceforth have a test.   If you want to update the test duration or answer key for an existing test without changing the questions, you must specify a Test parameter with the original questions, along with the updated values.   If you provide an updated Test but no AnswerKey, the new test will not have an answer key. Requests for such Qualifications must be granted manually.   You can also update the AutoGranted and AutoGrantedValue attributes of the Qualification type.
    */
  def updateQualificationType(params: UpdateQualificationTypeRequest): Request[UpdateQualificationTypeResponse, AWSError] = js.native
  def updateQualificationType(
    params: UpdateQualificationTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateQualificationTypeResponse, Unit]
  ): Request[UpdateQualificationTypeResponse, AWSError] = js.native
}
