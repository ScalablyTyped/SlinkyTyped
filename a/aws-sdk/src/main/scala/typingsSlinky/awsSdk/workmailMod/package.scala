package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object workmailMod {
  type AccessControlRuleAction = java.lang.String
  type AccessControlRuleDescription = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW
    - typingsSlinky.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type AccessControlRuleEffect = typingsSlinky.awsSdk.workmailMod._AccessControlRuleEffect | java.lang.String
  type AccessControlRuleName = java.lang.String
  type AccessControlRuleNameList = js.Array[typingsSlinky.awsSdk.workmailMod.AccessControlRuleName]
  type AccessControlRulesList = js.Array[typingsSlinky.awsSdk.workmailMod.AccessControlRule]
  type ActionsList = js.Array[typingsSlinky.awsSdk.workmailMod.AccessControlRuleAction]
  type Aliases = js.Array[typingsSlinky.awsSdk.workmailMod.EmailAddress]
  type AmazonResourceName = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.workmailMod.ClientApiVersions
  type EmailAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type EntityState = typingsSlinky.awsSdk.workmailMod._EntityState | java.lang.String
  type GroupName = java.lang.String
  type Groups = js.Array[typingsSlinky.awsSdk.workmailMod.Group]
  type IpAddress = java.lang.String
  type IpRange = java.lang.String
  type IpRangeList = js.Array[typingsSlinky.awsSdk.workmailMod.IpRange]
  type MailboxQuota = scala.Double
  type MailboxSize = scala.Double
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GROUP
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - java.lang.String
  */
  type MemberType = typingsSlinky.awsSdk.workmailMod._MemberType | java.lang.String
  type Members = js.Array[typingsSlinky.awsSdk.workmailMod.Member]
  type NextToken = java.lang.String
  type OrganizationId = java.lang.String
  type OrganizationName = java.lang.String
  type OrganizationSummaries = js.Array[typingsSlinky.awsSdk.workmailMod.OrganizationSummary]
  type Password = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FULL_ACCESS
    - typingsSlinky.awsSdk.awsSdkStrings.SEND_AS
    - typingsSlinky.awsSdk.awsSdkStrings.SEND_ON_BEHALF
    - java.lang.String
  */
  type PermissionType = typingsSlinky.awsSdk.workmailMod._PermissionType | java.lang.String
  type PermissionValues = js.Array[typingsSlinky.awsSdk.workmailMod.PermissionType]
  type Permissions = js.Array[typingsSlinky.awsSdk.workmailMod.Permission]
  type ResourceDelegates = js.Array[typingsSlinky.awsSdk.workmailMod.Delegate]
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ROOM
    - typingsSlinky.awsSdk.awsSdkStrings.EQUIPMENT
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.workmailMod._ResourceType | java.lang.String
  type Resources = js.Array[typingsSlinky.awsSdk.workmailMod.Resource]
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.workmailMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.workmailMod.Tag]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  type UserIdList = js.Array[typingsSlinky.awsSdk.workmailMod.WorkMailIdentifier]
  type UserName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USER
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM_USER
    - java.lang.String
  */
  type UserRole = typingsSlinky.awsSdk.workmailMod._UserRole | java.lang.String
  type Users = js.Array[typingsSlinky.awsSdk.workmailMod.User]
  type WorkMailIdentifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-10-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.workmailMod._apiVersion | java.lang.String
}
