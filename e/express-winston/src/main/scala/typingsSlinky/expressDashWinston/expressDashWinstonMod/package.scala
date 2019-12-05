package typingsSlinky.expressDashWinston

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWinstonMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type DynamicLevelFunction = js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* err */ js.Error, String]
  type DynamicMetaFunction = js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* err */ js.Error, js.Object]
  type MessageTemplate = String | (js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, String])
  type RequestFilter = js.Function2[/* req */ FilterRequest, /* propName */ String, js.Any]
  type ResponseFilter = js.Function2[/* res */ FilterResponse, /* propName */ String, js.Any]
  type RouteFilter = js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, Boolean]
}
