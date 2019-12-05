package typingsSlinky.expressDashJwt.expressDashJwtMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashJwt.Fn_Options
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler
  extends typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler[ParamsDictionary, js.Any, js.Any] {
  @JSName("unless")
  var unless_Original: Fn_Options = js.native
  def unless(options: js.Function1[/* req */ Request[ParamsDictionary], Boolean]): typingsSlinky.express.expressMod.RequestHandler[ParamsDictionary] = js.native
  def unless(options: typingsSlinky.expressDashUnless.expressDashUnlessMod.Options): typingsSlinky.express.expressMod.RequestHandler[ParamsDictionary] = js.native
}

