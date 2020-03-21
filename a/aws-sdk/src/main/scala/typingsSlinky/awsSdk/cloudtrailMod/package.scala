package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudtrailMod {
  type Boolean = scala.Boolean
  type ByteBuffer = typingsSlinky.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsSlinky.awsSdk.cloudtrailMod.Blob | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.cloudtrailMod.ClientApiVersions
  type DataResourceValues = js.Array[typingsSlinky.awsSdk.cloudtrailMod.String]
  type DataResources = js.Array[typingsSlinky.awsSdk.cloudtrailMod.DataResource]
  type Date = js.Date
  type EventCategory = typingsSlinky.awsSdk.awsSdkStrings.insight | java.lang.String
  type EventSelectors = js.Array[typingsSlinky.awsSdk.cloudtrailMod.EventSelector]
  type EventsList = js.Array[typingsSlinky.awsSdk.cloudtrailMod.Event]
  type ExcludeManagementEventSources = js.Array[typingsSlinky.awsSdk.cloudtrailMod.String]
  type InsightSelectors = js.Array[typingsSlinky.awsSdk.cloudtrailMod.InsightSelector]
  type InsightType = typingsSlinky.awsSdk.awsSdkStrings.ApiCallRateInsight | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EventId
    - typingsSlinky.awsSdk.awsSdkStrings.EventName
    - typingsSlinky.awsSdk.awsSdkStrings.ReadOnly
    - typingsSlinky.awsSdk.awsSdkStrings.Username_
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceType
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceName
    - typingsSlinky.awsSdk.awsSdkStrings.EventSource
    - typingsSlinky.awsSdk.awsSdkStrings.AccessKeyId
    - java.lang.String
  */
  type LookupAttributeKey = typingsSlinky.awsSdk.cloudtrailMod._LookupAttributeKey | java.lang.String
  type LookupAttributesList = js.Array[typingsSlinky.awsSdk.cloudtrailMod.LookupAttribute]
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type PublicKeyList = js.Array[typingsSlinky.awsSdk.cloudtrailMod.PublicKey]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ReadOnly
    - typingsSlinky.awsSdk.awsSdkStrings.WriteOnly
    - typingsSlinky.awsSdk.awsSdkStrings.All_
    - java.lang.String
  */
  type ReadWriteType = typingsSlinky.awsSdk.cloudtrailMod._ReadWriteType | java.lang.String
  type ResourceIdList = js.Array[typingsSlinky.awsSdk.cloudtrailMod.String]
  type ResourceList = js.Array[typingsSlinky.awsSdk.cloudtrailMod.Resource]
  type ResourceTagList = js.Array[typingsSlinky.awsSdk.cloudtrailMod.ResourceTag]
  type String = java.lang.String
  type TagsList = js.Array[typingsSlinky.awsSdk.cloudtrailMod.Tag]
  type TrailList = js.Array[typingsSlinky.awsSdk.cloudtrailMod.Trail]
  type TrailNameList = js.Array[typingsSlinky.awsSdk.cloudtrailMod.String]
  type Trails = js.Array[typingsSlinky.awsSdk.cloudtrailMod.TrailInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-11-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.cloudtrailMod._apiVersion | java.lang.String
}
