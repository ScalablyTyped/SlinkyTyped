package typingsSlinky.atAngularRouter.atAngularRouterMod

import typingsSlinky.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "PreloadingStrategy")
@js.native
abstract class PreloadingStrategy () extends js.Object {
  def preload(route: Route, fn: js.Function0[Observable[_]]): Observable[_] = js.native
}

