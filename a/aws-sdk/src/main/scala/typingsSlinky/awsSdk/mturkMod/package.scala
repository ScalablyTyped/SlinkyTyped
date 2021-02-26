package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mturkMod {
  
  type AssignmentList = js.Array[typingsSlinky.awsSdk.mturkMod.Assignment]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Submitted_
    - typingsSlinky.awsSdk.awsSdkStrings.Approved_
    - typingsSlinky.awsSdk.awsSdkStrings.Rejected_
    - java.lang.String
  */
  type AssignmentStatus = typingsSlinky.awsSdk.mturkMod._AssignmentStatus | java.lang.String
  
  type AssignmentStatusList = js.Array[typingsSlinky.awsSdk.mturkMod.AssignmentStatus]
  
  type BonusPaymentList = js.Array[typingsSlinky.awsSdk.mturkMod.BonusPayment]
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.mturkMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LessThan
    - typingsSlinky.awsSdk.awsSdkStrings.LessThanOrEqualTo
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThan
    - typingsSlinky.awsSdk.awsSdkStrings.GreaterThanOrEqualTo
    - typingsSlinky.awsSdk.awsSdkStrings.EqualTo
    - typingsSlinky.awsSdk.awsSdkStrings.NotEqualTo
    - typingsSlinky.awsSdk.awsSdkStrings.Exists
    - typingsSlinky.awsSdk.awsSdkStrings.DoesNotExist
    - typingsSlinky.awsSdk.awsSdkStrings.In_
    - typingsSlinky.awsSdk.awsSdkStrings.NotIn
    - java.lang.String
  */
  type Comparator = typingsSlinky.awsSdk.mturkMod._Comparator | java.lang.String
  
  type CountryParameters = java.lang.String
  
  type CurrencyAmount = java.lang.String
  
  type CustomerId = java.lang.String
  
  type CustomerIdList = js.Array[typingsSlinky.awsSdk.mturkMod.CustomerId]
  
  type EntityId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AssignmentAccepted
    - typingsSlinky.awsSdk.awsSdkStrings.AssignmentAbandoned
    - typingsSlinky.awsSdk.awsSdkStrings.AssignmentReturned
    - typingsSlinky.awsSdk.awsSdkStrings.AssignmentSubmitted
    - typingsSlinky.awsSdk.awsSdkStrings.AssignmentRejected
    - typingsSlinky.awsSdk.awsSdkStrings.AssignmentApproved
    - typingsSlinky.awsSdk.awsSdkStrings.HITCreated
    - typingsSlinky.awsSdk.awsSdkStrings.HITExpired
    - typingsSlinky.awsSdk.awsSdkStrings.HITReviewable
    - typingsSlinky.awsSdk.awsSdkStrings.HITExtended
    - typingsSlinky.awsSdk.awsSdkStrings.HITDisposed
    - typingsSlinky.awsSdk.awsSdkStrings.Ping
    - java.lang.String
  */
  type EventType = typingsSlinky.awsSdk.mturkMod._EventType | java.lang.String
  
  type EventTypeList = js.Array[typingsSlinky.awsSdk.mturkMod.EventType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Accept_
    - typingsSlinky.awsSdk.awsSdkStrings.PreviewAndAccept
    - typingsSlinky.awsSdk.awsSdkStrings.DiscoverPreviewAndAccept
    - java.lang.String
  */
  type HITAccessActions = typingsSlinky.awsSdk.mturkMod._HITAccessActions | java.lang.String
  
  type HITLayoutParameterList = js.Array[typingsSlinky.awsSdk.mturkMod.HITLayoutParameter]
  
  type HITList = js.Array[typingsSlinky.awsSdk.mturkMod.HIT]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NotReviewed
    - typingsSlinky.awsSdk.awsSdkStrings.MarkedForReview
    - typingsSlinky.awsSdk.awsSdkStrings.ReviewedAppropriate
    - typingsSlinky.awsSdk.awsSdkStrings.ReviewedInappropriate
    - java.lang.String
  */
  type HITReviewStatus = typingsSlinky.awsSdk.mturkMod._HITReviewStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Assignable
    - typingsSlinky.awsSdk.awsSdkStrings.Unassignable
    - typingsSlinky.awsSdk.awsSdkStrings.Reviewable
    - typingsSlinky.awsSdk.awsSdkStrings.Reviewing
    - typingsSlinky.awsSdk.awsSdkStrings.Disposed
    - java.lang.String
  */
  type HITStatus = typingsSlinky.awsSdk.mturkMod._HITStatus | java.lang.String
  
  type IdempotencyToken = java.lang.String
  
  type Integer = scala.Double
  
  type IntegerList = js.Array[typingsSlinky.awsSdk.mturkMod.Integer]
  
  type LocaleList = js.Array[typingsSlinky.awsSdk.mturkMod.Locale]
  
  type Long = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Email_
    - typingsSlinky.awsSdk.awsSdkStrings.SQS
    - typingsSlinky.awsSdk.awsSdkStrings.SNS
    - java.lang.String
  */
  type NotificationTransport = typingsSlinky.awsSdk.mturkMod._NotificationTransport | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SoftFailure
    - typingsSlinky.awsSdk.awsSdkStrings.HardFailure
    - java.lang.String
  */
  type NotifyWorkersFailureCode = typingsSlinky.awsSdk.mturkMod._NotifyWorkersFailureCode | java.lang.String
  
  type NotifyWorkersFailureStatusList = js.Array[typingsSlinky.awsSdk.mturkMod.NotifyWorkersFailureStatus]
  
  type PaginationToken = java.lang.String
  
  type ParameterMapEntryList = js.Array[typingsSlinky.awsSdk.mturkMod.ParameterMapEntry]
  
  type PolicyParameterList = js.Array[typingsSlinky.awsSdk.mturkMod.PolicyParameter]
  
  type QualificationList = js.Array[typingsSlinky.awsSdk.mturkMod.Qualification]
  
  type QualificationRequestList = js.Array[typingsSlinky.awsSdk.mturkMod.QualificationRequest]
  
  type QualificationRequirementList = js.Array[typingsSlinky.awsSdk.mturkMod.QualificationRequirement]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Granted_
    - typingsSlinky.awsSdk.awsSdkStrings.Revoked_
    - java.lang.String
  */
  type QualificationStatus = typingsSlinky.awsSdk.mturkMod._QualificationStatus | java.lang.String
  
  type QualificationTypeList = js.Array[typingsSlinky.awsSdk.mturkMod.QualificationType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Active_
    - typingsSlinky.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type QualificationTypeStatus = typingsSlinky.awsSdk.mturkMod._QualificationTypeStatus | java.lang.String
  
  type ResultSize = scala.Double
  
  type ReviewActionDetailList = js.Array[typingsSlinky.awsSdk.mturkMod.ReviewActionDetail]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Intended
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - java.lang.String
  */
  type ReviewActionStatus = typingsSlinky.awsSdk.mturkMod._ReviewActionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Assignment
    - typingsSlinky.awsSdk.awsSdkStrings.HIT
    - java.lang.String
  */
  type ReviewPolicyLevel = typingsSlinky.awsSdk.mturkMod._ReviewPolicyLevel | java.lang.String
  
  type ReviewPolicyLevelList = js.Array[typingsSlinky.awsSdk.mturkMod.ReviewPolicyLevel]
  
  type ReviewResultDetailList = js.Array[typingsSlinky.awsSdk.mturkMod.ReviewResultDetail]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Reviewable
    - typingsSlinky.awsSdk.awsSdkStrings.Reviewing
    - java.lang.String
  */
  type ReviewableHITStatus = typingsSlinky.awsSdk.mturkMod._ReviewableHITStatus | java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.mturkMod.String]
  
  type Timestamp = js.Date
  
  type WorkerBlockList = js.Array[typingsSlinky.awsSdk.mturkMod.WorkerBlock]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-01-17`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.mturkMod._apiVersion | java.lang.String
}
