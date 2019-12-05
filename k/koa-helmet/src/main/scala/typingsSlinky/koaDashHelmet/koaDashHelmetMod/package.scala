package typingsSlinky.koaDashHelmet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashHelmetMod {
  import typingsSlinky.koa.koaMod.Context

  type KoaHelmetContentSecurityPolicyDirectiveFunction = js.Function1[/* ctx */ Context, String]
  type KoaHelmetCspDirectiveValue = String | KoaHelmetContentSecurityPolicyDirectiveFunction
}
