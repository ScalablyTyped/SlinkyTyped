package typingsSlinky.reactNavigationStack

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Context
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.vendorTypesMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previousSceneContextMod extends Shortcut {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/utils/PreviousSceneContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[Scene[NavigationRoute[NavigationParams]]]] = js.native
  
  type _To = Context[js.UndefOr[Scene[NavigationRoute[NavigationParams]]]]
  
  /* This means you don't have to write `default`, but can instead just say `previousSceneContextMod.foo` */
  override def _to: Context[js.UndefOr[Scene[NavigationRoute[NavigationParams]]]] = default
}
