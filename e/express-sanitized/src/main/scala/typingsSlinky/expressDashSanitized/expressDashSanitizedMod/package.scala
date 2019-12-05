package typingsSlinky.expressDashSanitized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashSanitizedMod {
  import typingsSlinky.express.expressMod.NextFunction
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type e = js.Function0[
    js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction, Unit]
  ]
}
