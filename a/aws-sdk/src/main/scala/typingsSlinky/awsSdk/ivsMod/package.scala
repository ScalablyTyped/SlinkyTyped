package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ivsMod {
  type BatchErrors = js.Array[typingsSlinky.awsSdk.ivsMod.BatchError]
  type ChannelArn = java.lang.String
  type ChannelArnList = js.Array[typingsSlinky.awsSdk.ivsMod.ChannelArn]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NORMAL
    - typingsSlinky.awsSdk.awsSdkStrings.LOW
    - java.lang.String
  */
  type ChannelLatencyMode = typingsSlinky.awsSdk.ivsMod._ChannelLatencyMode | java.lang.String
  type ChannelList = js.Array[typingsSlinky.awsSdk.ivsMod.ChannelSummary]
  type ChannelName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BASIC
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type ChannelType = typingsSlinky.awsSdk.ivsMod._ChannelType | java.lang.String
  type Channels = js.Array[typingsSlinky.awsSdk.ivsMod.Channel]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ivsMod.ClientApiVersions
  type IngestEndpoint = java.lang.String
  type MaxChannelResults = scala.Double
  type MaxStreamKeyResults = scala.Double
  type MaxStreamResults = scala.Double
  type MaxTagResults = scala.Double
  type PaginationToken = java.lang.String
  type PlaybackURL = java.lang.String
  type ResourceArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HEALTHY
    - typingsSlinky.awsSdk.awsSdkStrings.STARVING
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type StreamHealth = typingsSlinky.awsSdk.ivsMod._StreamHealth | java.lang.String
  type StreamKeyArn = java.lang.String
  type StreamKeyArnList = js.Array[typingsSlinky.awsSdk.ivsMod.StreamKeyArn]
  type StreamKeyList = js.Array[typingsSlinky.awsSdk.ivsMod.StreamKeySummary]
  type StreamKeyValue = java.lang.String
  type StreamKeys = js.Array[typingsSlinky.awsSdk.ivsMod.StreamKey]
  type StreamList = js.Array[typingsSlinky.awsSdk.ivsMod.StreamSummary]
  type StreamMetadata = java.lang.String
  type StreamStartTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LIVE
    - typingsSlinky.awsSdk.awsSdkStrings.OFFLINE
    - java.lang.String
  */
  type StreamState = typingsSlinky.awsSdk.ivsMod._StreamState | java.lang.String
  type StreamViewerCount = scala.Double
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.ivsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.ivsMod.TagValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2020-07-14`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.ivsMod._apiVersion | java.lang.String
  type errorCode = java.lang.String
  type errorMessage = java.lang.String
}
