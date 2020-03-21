package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisvideoMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PUT_MEDIA
    - typingsSlinky.awsSdk.awsSdkStrings.GET_MEDIA
    - typingsSlinky.awsSdk.awsSdkStrings.LIST_FRAGMENTS
    - typingsSlinky.awsSdk.awsSdkStrings.GET_MEDIA_FOR_FRAGMENT_LIST
    - typingsSlinky.awsSdk.awsSdkStrings.GET_HLS_STREAMING_SESSION_URL
    - typingsSlinky.awsSdk.awsSdkStrings.GET_DASH_STREAMING_SESSION_URL
    - java.lang.String
  */
  type APIName = typingsSlinky.awsSdk.kinesisvideoMod._APIName | java.lang.String
  type ChannelInfoList = js.Array[typingsSlinky.awsSdk.kinesisvideoMod.ChannelInfo]
  type ChannelName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WSS
    - typingsSlinky.awsSdk.awsSdkStrings.HTTPS
    - java.lang.String
  */
  type ChannelProtocol = typingsSlinky.awsSdk.kinesisvideoMod._ChannelProtocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MASTER
    - typingsSlinky.awsSdk.awsSdkStrings.VIEWER
    - java.lang.String
  */
  type ChannelRole = typingsSlinky.awsSdk.kinesisvideoMod._ChannelRole | java.lang.String
  type ChannelType = typingsSlinky.awsSdk.awsSdkStrings.SINGLE_MASTER | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.kinesisvideoMod.ClientApiVersions
  type ComparisonOperator = typingsSlinky.awsSdk.awsSdkStrings.BEGINS_WITH | java.lang.String
  type DataEndpoint = java.lang.String
  type DataRetentionChangeInHours = scala.Double
  type DataRetentionInHours = scala.Double
  type DeviceName = java.lang.String
  type KmsKeyId = java.lang.String
  type ListOfProtocols = js.Array[typingsSlinky.awsSdk.kinesisvideoMod.ChannelProtocol]
  type ListStreamsInputLimit = scala.Double
  type MediaType = java.lang.String
  type MessageTtlSeconds = scala.Double
  type NextToken = java.lang.String
  type ResourceARN = java.lang.String
  type ResourceEndpoint = java.lang.String
  type ResourceEndpointList = js.Array[typingsSlinky.awsSdk.kinesisvideoMod.ResourceEndpointListItem]
  type ResourceTags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.kinesisvideoMod.TagValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type Status = typingsSlinky.awsSdk.kinesisvideoMod._Status | java.lang.String
  type StreamInfoList = js.Array[typingsSlinky.awsSdk.kinesisvideoMod.StreamInfo]
  type StreamName = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.kinesisvideoMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.kinesisvideoMod.Tag]
  type TagOnCreateList = js.Array[typingsSlinky.awsSdk.kinesisvideoMod.Tag]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INCREASE_DATA_RETENTION
    - typingsSlinky.awsSdk.awsSdkStrings.DECREASE_DATA_RETENTION
    - java.lang.String
  */
  type UpdateDataRetentionOperation = typingsSlinky.awsSdk.kinesisvideoMod._UpdateDataRetentionOperation | java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-09-30`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.kinesisvideoMod._apiVersion | java.lang.String
}
