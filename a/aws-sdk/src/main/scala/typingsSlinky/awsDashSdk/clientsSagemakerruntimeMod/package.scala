package typingsSlinky.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSagemakerruntimeMod {
  import typingsSlinky.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typingsSlinky.node.Buffer

  type BodyBlob = Buffer | scala.scalajs.js.typedarray.Uint8Array | Blob | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CustomAttributesHeader = String
  type EndpointName = String
  type Header = String
  type TargetModelHeader = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-05-13`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
