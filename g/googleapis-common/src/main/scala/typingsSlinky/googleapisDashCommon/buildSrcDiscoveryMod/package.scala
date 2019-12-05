package typingsSlinky.googleapisDashCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcDiscoveryMod {
  import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
  import typingsSlinky.googleapisDashCommon.buildSrcEndpointMod.Endpoint

  type EndpointCreator = js.Function2[/* options */ GlobalOptions, /* google */ js.Object, Endpoint]
}
