package typingsSlinky.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsWorkmailmessageflowMod {
  import typingsSlinky.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.streamMod.Readable

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-05-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type messageContentBlob = Buffer | scala.scalajs.js.typedarray.Uint8Array | Blob | String | Readable
  type messageIdType = String
}
