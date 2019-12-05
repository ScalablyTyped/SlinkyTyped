package typingsSlinky.compression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object compressionMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type CompressionFilter = js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, Boolean]
}
