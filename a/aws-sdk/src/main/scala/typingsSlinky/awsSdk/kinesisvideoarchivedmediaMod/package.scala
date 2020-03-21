package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisvideoarchivedmediaMod {
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FRAGMENTED_MP4
    - typingsSlinky.awsSdk.awsSdkStrings.MPEG_TS
    - java.lang.String
  */
  type ContainerFormat = typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod._ContainerFormat | java.lang.String
  type ContentType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS
    - typingsSlinky.awsSdk.awsSdkStrings.NEVER
    - java.lang.String
  */
  type DASHDisplayFragmentNumber = typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod._DASHDisplayFragmentNumber | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS
    - typingsSlinky.awsSdk.awsSdkStrings.NEVER
    - java.lang.String
  */
  type DASHDisplayFragmentTimestamp = typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod._DASHDisplayFragmentTimestamp | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typingsSlinky.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type DASHFragmentSelectorType = typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod._DASHFragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LIVE
    - typingsSlinky.awsSdk.awsSdkStrings.LIVE_REPLAY
    - typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type DASHPlaybackMode = typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod._DASHPlaybackMode | java.lang.String
  type DASHStreamingSessionURL = java.lang.String
  type Expires = scala.Double
  type FragmentList = js.Array[typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.Fragment]
  type FragmentNumberList = js.Array[typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.FragmentNumberString]
  type FragmentNumberString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typingsSlinky.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type FragmentSelectorType = typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod._FragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS
    - typingsSlinky.awsSdk.awsSdkStrings.NEVER
    - typingsSlinky.awsSdk.awsSdkStrings.ON_DISCONTINUITY
    - java.lang.String
  */
  type HLSDiscontinuityMode = typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod._HLSDiscontinuityMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS
    - typingsSlinky.awsSdk.awsSdkStrings.NEVER
    - java.lang.String
  */
  type HLSDisplayFragmentTimestamp = typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod._HLSDisplayFragmentTimestamp | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typingsSlinky.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type HLSFragmentSelectorType = typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod._HLSFragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LIVE
    - typingsSlinky.awsSdk.awsSdkStrings.LIVE_REPLAY
    - typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type HLSPlaybackMode = typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod._HLSPlaybackMode | java.lang.String
  type HLSStreamingSessionURL = java.lang.String
  type Long = scala.Double
  type PageLimit = scala.Double
  type Payload = typingsSlinky.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.Blob | java.lang.String | typingsSlinky.node.streamMod.Readable
  type ResourceARN = java.lang.String
  type StreamName = java.lang.String
  type String = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-09-30`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod._apiVersion | java.lang.String
}
