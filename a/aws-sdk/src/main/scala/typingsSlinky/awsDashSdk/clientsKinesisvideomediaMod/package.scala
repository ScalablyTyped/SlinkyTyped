package typingsSlinky.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisvideomediaMod {
  import typingsSlinky.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.streamMod.Readable

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ContentType = String
  type ContinuationToken = String
  type FragmentNumberString = String
  type Payload = Buffer | scala.scalajs.js.typedarray.Uint8Array | Blob | String | Readable
  type ResourceARN = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FRAGMENT_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_TIMESTAMP
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsDashSdk.awsDashSdkStrings.NOW
    - typings.awsDashSdk.awsDashSdkStrings.EARLIEST
    - typings.awsDashSdk.awsDashSdkStrings.CONTINUATION_TOKEN
    - java.lang.String
  */
  type StartSelectorType = _StartSelectorType | String
  type StreamName = String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-09-30`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
