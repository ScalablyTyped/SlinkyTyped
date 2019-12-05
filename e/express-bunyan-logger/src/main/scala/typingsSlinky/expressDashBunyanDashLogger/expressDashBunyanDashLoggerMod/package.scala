package typingsSlinky.expressDashBunyanDashLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashBunyanDashLoggerMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type FormatFunction = js.Function1[/* meta */ js.Any, String]
  type IncludesFunction = js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, js.Any]
  type LevelFunction = js.Function3[/* status */ Double, /* err */ js.Error | Null, /* meta */ js.Any, String]
  type RequestIdGenFunction = js.Function1[/* req */ Request[ParamsDictionary], String]
}
