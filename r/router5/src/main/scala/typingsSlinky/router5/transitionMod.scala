package typingsSlinky.router5

import typingsSlinky.router5.baseMod.DoneFn
import typingsSlinky.router5.baseMod.NavigationOptions
import typingsSlinky.router5.baseMod.State
import typingsSlinky.router5.routerMod.DefaultDependencies
import typingsSlinky.router5.routerMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionMod {
  
  @JSImport("router5/dist/transition", JSImport.Default)
  @js.native
  def default(
    router: Router[DefaultDependencies],
    toState: State,
    fromState: Null,
    opts: NavigationOptions,
    callback: DoneFn
  ): js.Function0[Unit] = js.native
  @JSImport("router5/dist/transition", JSImport.Default)
  @js.native
  def default(
    router: Router[DefaultDependencies],
    toState: State,
    fromState: State,
    opts: NavigationOptions,
    callback: DoneFn
  ): js.Function0[Unit] = js.native
}
