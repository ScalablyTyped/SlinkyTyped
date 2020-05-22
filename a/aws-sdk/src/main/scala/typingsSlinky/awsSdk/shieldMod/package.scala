package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shieldMod {
  type AttackId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NETWORK
    - typingsSlinky.awsSdk.awsSdkStrings.APPLICATION
    - java.lang.String
  */
  type AttackLayer = typingsSlinky.awsSdk.shieldMod._AttackLayer | java.lang.String
  type AttackProperties = js.Array[typingsSlinky.awsSdk.shieldMod.AttackProperty]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DESTINATION_URL
    - typingsSlinky.awsSdk.awsSdkStrings.REFERRER
    - typingsSlinky.awsSdk.awsSdkStrings.SOURCE_ASN
    - typingsSlinky.awsSdk.awsSdkStrings.SOURCE_COUNTRY
    - typingsSlinky.awsSdk.awsSdkStrings.SOURCE_IP_ADDRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SOURCE_USER_AGENT
    - typingsSlinky.awsSdk.awsSdkStrings.WORDPRESS_PINGBACK_REFLECTOR
    - typingsSlinky.awsSdk.awsSdkStrings.WORDPRESS_PINGBACK_SOURCE
    - java.lang.String
  */
  type AttackPropertyIdentifier = typingsSlinky.awsSdk.shieldMod._AttackPropertyIdentifier | java.lang.String
  type AttackSummaries = js.Array[typingsSlinky.awsSdk.shieldMod.AttackSummary]
  type AttackTimestamp = js.Date
  type AttackVectorDescriptionList = js.Array[typingsSlinky.awsSdk.shieldMod.AttackVectorDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AutoRenew = typingsSlinky.awsSdk.shieldMod._AutoRenew | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.shieldMod.ClientApiVersions
  type Double = scala.Double
  type DurationInSeconds = scala.Double
  type EmailAddress = java.lang.String
  type EmergencyContactList = js.Array[typingsSlinky.awsSdk.shieldMod.EmergencyContact]
  type HealthCheckArn = java.lang.String
  type HealthCheckId = java.lang.String
  type HealthCheckIds = js.Array[typingsSlinky.awsSdk.shieldMod.HealthCheckId]
  type Integer = scala.Double
  type Limits = js.Array[typingsSlinky.awsSdk.shieldMod.Limit]
  type LogBucket = java.lang.String
  type LogBucketList = js.Array[typingsSlinky.awsSdk.shieldMod.LogBucket]
  type Long = scala.Double
  type MaxResults = scala.Double
  type MitigationList = js.Array[typingsSlinky.awsSdk.shieldMod.Mitigation]
  type ProtectionId = java.lang.String
  type ProtectionName = java.lang.String
  type Protections = js.Array[typingsSlinky.awsSdk.shieldMod.Protection]
  type ResourceArn = java.lang.String
  type ResourceArnFilterList = js.Array[typingsSlinky.awsSdk.shieldMod.ResourceArn]
  type RoleArn = java.lang.String
  type String = java.lang.String
  type SubResourceSummaryList = js.Array[typingsSlinky.awsSdk.shieldMod.SubResourceSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IP
    - typingsSlinky.awsSdk.awsSdkStrings.URL
    - java.lang.String
  */
  type SubResourceType = typingsSlinky.awsSdk.shieldMod._SubResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type SubscriptionState = typingsSlinky.awsSdk.shieldMod._SubscriptionState | java.lang.String
  type SummarizedAttackVectorList = js.Array[typingsSlinky.awsSdk.shieldMod.SummarizedAttackVector]
  type SummarizedCounterList = js.Array[typingsSlinky.awsSdk.shieldMod.SummarizedCounter]
  type Timestamp = js.Date
  type Token = java.lang.String
  type TopContributors = js.Array[typingsSlinky.awsSdk.shieldMod.Contributor]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BITS
    - typingsSlinky.awsSdk.awsSdkStrings.BYTES
    - typingsSlinky.awsSdk.awsSdkStrings.PACKETS
    - typingsSlinky.awsSdk.awsSdkStrings.REQUESTS
    - java.lang.String
  */
  type Unit = typingsSlinky.awsSdk.shieldMod._Unit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-06-02`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.shieldMod._apiVersion | java.lang.String
}
