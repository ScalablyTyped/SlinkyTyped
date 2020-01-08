package typingsSlinky.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsApigatewaymanagementapiMod {
  import typingsSlinky.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typingsSlinky.node.Buffer

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Data = Buffer | scala.scalajs.js.typedarray.Uint8Array | Blob | String
  type __string = String
  type __timestampIso8601 = js.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-11-29`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
