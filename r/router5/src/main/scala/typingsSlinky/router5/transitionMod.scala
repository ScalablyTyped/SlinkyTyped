package typingsSlinky.router5

import typingsSlinky.router5.baseMod.DoneFn
import typingsSlinky.router5.baseMod.NavigationOptions
import typingsSlinky.router5.baseMod.State
import typingsSlinky.router5.routerMod.DefaultDependencies
import typingsSlinky.router5.routerMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("router5/dist/transition", JSImport.Namespace)
@js.native
object transitionMod extends js.Object {
  
  def default(
    router: Router[DefaultDependencies],
    toState: State,
    fromState: Null,
    opts: NavigationOptions,
    callback: DoneFn
  ): js.Function0[Unit] = js.native
  def default(
    router: Router[DefaultDependencies],
    toState: State,
    fromState: State,
    opts: NavigationOptions,
    callback: DoneFn
  ): js.Function0[Unit] = js.native
}
