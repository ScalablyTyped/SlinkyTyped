package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object detectiveMod {
  
  type AccountId = java.lang.String
  
  type AccountIdList = js.Array[typingsSlinky.awsSdk.detectiveMod.AccountId]
  
  type AccountList = js.Array[typingsSlinky.awsSdk.detectiveMod.Account]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.detectiveMod.ClientApiVersions
  
  type EmailAddress = java.lang.String
  
  type EmailMessage = java.lang.String
  
  type GraphArn = java.lang.String
  
  type GraphList = js.Array[typingsSlinky.awsSdk.detectiveMod.Graph]
  
  type MemberDetailList = js.Array[typingsSlinky.awsSdk.detectiveMod.MemberDetail]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VOLUME_TOO_HIGH
    - typingsSlinky.awsSdk.awsSdkStrings.VOLUME_UNKNOWN
    - java.lang.String
  */
  type MemberDisabledReason = typingsSlinky.awsSdk.detectiveMod._MemberDisabledReason | java.lang.String
  
  type MemberResultsLimit = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INVITED
    - typingsSlinky.awsSdk.awsSdkStrings.VERIFICATION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.VERIFICATION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.ACCEPTED_BUT_DISABLED
    - java.lang.String
  */
  type MemberStatus = typingsSlinky.awsSdk.detectiveMod._MemberStatus | java.lang.String
  
  type PaginationToken = java.lang.String
  
  type Percentage = scala.Double
  
  type Timestamp = js.Date
  
  type UnprocessedAccountList = js.Array[typingsSlinky.awsSdk.detectiveMod.UnprocessedAccount]
  
  type UnprocessedReason = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-10-26`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.detectiveMod._apiVersion | java.lang.String
}
