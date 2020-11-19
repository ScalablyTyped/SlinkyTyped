package typingsSlinky.angularUiRouter.mod.angularAugmentingMod.ui

import typingsSlinky.angular.mod.IServiceProvider
import typingsSlinky.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStateProvider extends IServiceProvider {
  
  def decorator(): js.Any = js.native
  def decorator(
    name: js.UndefOr[scala.Nothing],
    decorator: js.Function2[/* state */ IState, /* parent */ Function, _]
  ): js.Any = js.native
  def decorator(name: String): js.Any = js.native
  def decorator(name: String, decorator: js.Function2[/* state */ IState, /* parent */ Function, _]): js.Any = js.native
  
  def state(config: IState): IStateProvider = js.native
  def state(name: String, config: IState): IStateProvider = js.native
}
