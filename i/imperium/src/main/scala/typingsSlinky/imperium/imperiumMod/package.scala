package typingsSlinky.imperium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object imperiumMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typingsSlinky.imperium.imperiumStrings.body
  import typingsSlinky.imperium.imperiumStrings.headers
  import typingsSlinky.imperium.imperiumStrings.params
  import typingsSlinky.imperium.imperiumStrings.query

  type Actions = js.Array[String] | String
  type Context = js.Array[params | query | headers | body]
  type GetAcl = js.Function1[/* req */ Request[ParamsDictionary], js.Promise[Boolean | js.Object]]
  type RoleParams = StringDictionary[String]
  type Roles = StringDictionary[RoleActions]
}
