package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisvideomediaMod {
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.kinesisvideomediaMod.ClientApiVersions
  type ContentType = java.lang.String
  type ContinuationToken = java.lang.String
  type FragmentNumberString = java.lang.String
  type Payload = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.kinesisvideomediaMod.Blob | java.lang.String | typingsSlinky.node.streamMod.Readable
  type ResourceARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FRAGMENT_NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - typingsSlinky.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typingsSlinky.awsSdk.awsSdkStrings.NOW
    - typingsSlinky.awsSdk.awsSdkStrings.EARLIEST
    - typingsSlinky.awsSdk.awsSdkStrings.CONTINUATION_TOKEN
    - java.lang.String
  */
  type StartSelectorType = typingsSlinky.awsSdk.kinesisvideomediaMod._StartSelectorType | java.lang.String
  type StreamName = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-09-30`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.kinesisvideomediaMod._apiVersion | java.lang.String
}
