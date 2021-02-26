package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ssoadminMod {
  
  type AccountAssignmentList = js.Array[typingsSlinky.awsSdk.ssoadminMod.AccountAssignment]
  
  type AccountAssignmentOperationStatusList = js.Array[typingsSlinky.awsSdk.ssoadminMod.AccountAssignmentOperationStatusMetadata]
  
  type AccountId = java.lang.String
  
  type AccountList = js.Array[typingsSlinky.awsSdk.ssoadminMod.AccountId]
  
  type AttachedManagedPolicyList = js.Array[typingsSlinky.awsSdk.ssoadminMod.AttachedManagedPolicy]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ssoadminMod.ClientApiVersions
  
  type Date = js.Date
  
  type Duration = java.lang.String
  
  type GeneralArn = java.lang.String
  
  type Id = java.lang.String
  
  type InstanceArn = java.lang.String
  
  type InstanceList = js.Array[typingsSlinky.awsSdk.ssoadminMod.InstanceMetadata]
  
  type ManagedPolicyArn = java.lang.String
  
  type MaxResults = scala.Double
  
  type Name = java.lang.String
  
  type PermissionSetArn = java.lang.String
  
  type PermissionSetDescription = java.lang.String
  
  type PermissionSetList = js.Array[typingsSlinky.awsSdk.ssoadminMod.PermissionSetArn]
  
  type PermissionSetName = java.lang.String
  
  type PermissionSetPolicyDocument = java.lang.String
  
  type PermissionSetProvisioningStatusList = js.Array[typingsSlinky.awsSdk.ssoadminMod.PermissionSetProvisioningStatusMetadata]
  
  type PrincipalId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - typingsSlinky.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type PrincipalType = typingsSlinky.awsSdk.ssoadminMod._PrincipalType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_ACCOUNT
    - typingsSlinky.awsSdk.awsSdkStrings.ALL_PROVISIONED_ACCOUNTS
    - java.lang.String
  */
  type ProvisionTargetType = typingsSlinky.awsSdk.ssoadminMod._ProvisionTargetType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LATEST_PERMISSION_SET_PROVISIONED
    - typingsSlinky.awsSdk.awsSdkStrings.LATEST_PERMISSION_SET_NOT_PROVISIONED
    - java.lang.String
  */
  type ProvisioningStatus = typingsSlinky.awsSdk.ssoadminMod._ProvisioningStatus | java.lang.String
  
  type Reason = java.lang.String
  
  type RelayState = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - java.lang.String
  */
  type StatusValues = typingsSlinky.awsSdk.ssoadminMod._StatusValues | java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.ssoadminMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.ssoadminMod.Tag]
  
  type TagValue = java.lang.String
  
  type TargetId = java.lang.String
  
  type TargetType = typingsSlinky.awsSdk.awsSdkStrings.AWS_ACCOUNT | java.lang.String
  
  type Token = java.lang.String
  
  type UUId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2020-07-20`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.ssoadminMod._apiVersion | java.lang.String
}
