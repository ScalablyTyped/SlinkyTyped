package typingsSlinky.googleapisDashCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcApiMod {
  import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosResponse
  import typingsSlinky.googleapisDashCommon.buildSrcEndpointMod.Endpoint

  type APIEndpoint = Endpoint with js.Any
  type BodyResponseCallback[T] = js.Function2[/* err */ js.Error | Null, /* res */ js.UndefOr[GaxiosResponse[T] | Null], Unit]
}
