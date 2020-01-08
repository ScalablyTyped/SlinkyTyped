package typingsSlinky.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisvideoarchivedmediaMod {
  import typingsSlinky.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.streamMod.Readable

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FRAGMENTED_MP4
    - typings.awsDashSdk.awsDashSdkStrings.MPEG_TS
    - java.lang.String
  */
  type ContainerFormat = _ContainerFormat | java.lang.String
  type ContentType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS
    - typings.awsDashSdk.awsDashSdkStrings.NEVER
    - java.lang.String
  */
  type DASHDisplayFragmentNumber = _DASHDisplayFragmentNumber | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS
    - typings.awsDashSdk.awsDashSdkStrings.NEVER
    - java.lang.String
  */
  type DASHDisplayFragmentTimestamp = _DASHDisplayFragmentTimestamp | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type DASHFragmentSelectorType = _DASHFragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LIVE
    - typings.awsDashSdk.awsDashSdkStrings.LIVE_REPLAY
    - typings.awsDashSdk.awsDashSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type DASHPlaybackMode = _DASHPlaybackMode | java.lang.String
  type DASHStreamingSessionURL = java.lang.String
  type Expires = Double
  type FragmentList = js.Array[Fragment]
  type FragmentNumberList = js.Array[FragmentNumberString]
  type FragmentNumberString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type FragmentSelectorType = _FragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS
    - typings.awsDashSdk.awsDashSdkStrings.NEVER
    - typings.awsDashSdk.awsDashSdkStrings.ON_DISCONTINUITY
    - java.lang.String
  */
  type HLSDiscontinuityMode = _HLSDiscontinuityMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS
    - typings.awsDashSdk.awsDashSdkStrings.NEVER
    - java.lang.String
  */
  type HLSDisplayFragmentTimestamp = _HLSDisplayFragmentTimestamp | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type HLSFragmentSelectorType = _HLSFragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LIVE
    - typings.awsDashSdk.awsDashSdkStrings.LIVE_REPLAY
    - typings.awsDashSdk.awsDashSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type HLSPlaybackMode = _HLSPlaybackMode | java.lang.String
  type HLSStreamingSessionURL = java.lang.String
  type Long = Double
  type PageLimit = Double
  type Payload = Buffer | scala.scalajs.js.typedarray.Uint8Array | Blob | java.lang.String | Readable
  type ResourceARN = java.lang.String
  type StreamName = java.lang.String
  type String = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-09-30`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
