package typingsSlinky.atFeathersjsAuthenticationDashJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atFeathersjsAuthenticationDashJwtMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type JwtFromRequestFunction = js.Function1[/* req */ Request[ParamsDictionary], String | Null]
}
