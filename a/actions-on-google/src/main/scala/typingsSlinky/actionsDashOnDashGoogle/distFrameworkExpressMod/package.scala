package typingsSlinky.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFrameworkExpressMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type ExpressHandler = js.Function2[/* request */ Request[ParamsDictionary], /* response */ Response, Unit]
}
