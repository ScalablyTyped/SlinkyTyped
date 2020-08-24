package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snowballMod {
  type AddressId = java.lang.String
  type AddressList = js.Array[typingsSlinky.awsSdk.snowballMod.Address]
  type AmiId = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.snowballMod.ClientApiVersions
  type ClusterId = java.lang.String
  type ClusterListEntryList = js.Array[typingsSlinky.awsSdk.snowballMod.ClusterListEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AwaitingQuorum
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - typingsSlinky.awsSdk.awsSdkStrings.InUse
    - typingsSlinky.awsSdk.awsSdkStrings.Complete_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - java.lang.String
  */
  type ClusterState = typingsSlinky.awsSdk.snowballMod._ClusterState | java.lang.String
  type CompatibleImageList = js.Array[typingsSlinky.awsSdk.snowballMod.CompatibleImage]
  type Ec2AmiResourceList = js.Array[typingsSlinky.awsSdk.snowballMod.Ec2AmiResource]
  type EventTriggerDefinitionList = js.Array[typingsSlinky.awsSdk.snowballMod.EventTriggerDefinition]
  type GSTIN = java.lang.String
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobListEntryList = js.Array[typingsSlinky.awsSdk.snowballMod.JobListEntry]
  type JobMetadataList = js.Array[typingsSlinky.awsSdk.snowballMod.JobMetadata]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.New_
    - typingsSlinky.awsSdk.awsSdkStrings.PreparingAppliance
    - typingsSlinky.awsSdk.awsSdkStrings.PreparingShipment
    - typingsSlinky.awsSdk.awsSdkStrings.InTransitToCustomer
    - typingsSlinky.awsSdk.awsSdkStrings.WithCustomer
    - typingsSlinky.awsSdk.awsSdkStrings.InTransitToAWS
    - typingsSlinky.awsSdk.awsSdkStrings.WithAWSSortingFacility
    - typingsSlinky.awsSdk.awsSdkStrings.WithAWS
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Complete_
    - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
    - typingsSlinky.awsSdk.awsSdkStrings.Listing
    - typingsSlinky.awsSdk.awsSdkStrings.Pending_
    - java.lang.String
  */
  type JobState = typingsSlinky.awsSdk.snowballMod._JobState | java.lang.String
  type JobStateList = js.Array[typingsSlinky.awsSdk.snowballMod.JobState]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORT
    - typingsSlinky.awsSdk.awsSdkStrings.EXPORT
    - typingsSlinky.awsSdk.awsSdkStrings.LOCAL_USE
    - java.lang.String
  */
  type JobType = typingsSlinky.awsSdk.snowballMod._JobType | java.lang.String
  type KmsKeyARN = java.lang.String
  type LambdaResourceList = js.Array[typingsSlinky.awsSdk.snowballMod.LambdaResource]
  type ListLimit = scala.Double
  type Long = scala.Double
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  type S3ResourceList = js.Array[typingsSlinky.awsSdk.snowballMod.S3Resource]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SECOND_DAY
    - typingsSlinky.awsSdk.awsSdkStrings.NEXT_DAY
    - typingsSlinky.awsSdk.awsSdkStrings.EXPRESS
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type ShippingOption = typingsSlinky.awsSdk.snowballMod._ShippingOption | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.T50
    - typingsSlinky.awsSdk.awsSdkStrings.T80
    - typingsSlinky.awsSdk.awsSdkStrings.T100
    - typingsSlinky.awsSdk.awsSdkStrings.T42
    - typingsSlinky.awsSdk.awsSdkStrings.T98
    - typingsSlinky.awsSdk.awsSdkStrings.T8
    - typingsSlinky.awsSdk.awsSdkStrings.NoPreference
    - java.lang.String
  */
  type SnowballCapacity = typingsSlinky.awsSdk.snowballMod._SnowballCapacity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.EDGE
    - typingsSlinky.awsSdk.awsSdkStrings.EDGE_C
    - typingsSlinky.awsSdk.awsSdkStrings.EDGE_CG
    - typingsSlinky.awsSdk.awsSdkStrings.EDGE_S
    - typingsSlinky.awsSdk.awsSdkStrings.SNC1_HDD
    - java.lang.String
  */
  type SnowballType = typingsSlinky.awsSdk.snowballMod._SnowballType | java.lang.String
  type SnsTopicARN = java.lang.String
  type String = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-06-30`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.snowballMod._apiVersion | java.lang.String
}
