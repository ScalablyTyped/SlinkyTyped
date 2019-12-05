package typingsSlinky.expressDashRedisDashCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashRedisDashCacheMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type ExpirationConfig = StringDictionary[Double]
  type ExpirationPolicy = js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, Double]
  type ExpireOption = Double | ExpirationConfig
}
