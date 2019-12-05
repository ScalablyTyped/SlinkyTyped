package typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui

import typingsSlinky.angular.angularMod.IServiceProvider
import typingsSlinky.angular.angularMod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateProvider extends IServiceProvider {
  def decorator(): js.Any = js.native
  def decorator(name: String): js.Any = js.native
  def decorator(
    name: String,
    decorator: js.Function2[
      /* state */ typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IState, 
      /* parent */ Function, 
      _
    ]
  ): js.Any = js.native
  def state(config: typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IState): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IStateProvider = js.native
  def state(
    name: String,
    config: typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IState
  ): typingsSlinky.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IStateProvider = js.native
}

