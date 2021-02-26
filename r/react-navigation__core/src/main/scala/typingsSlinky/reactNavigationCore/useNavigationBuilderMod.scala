package typingsSlinky.reactNavigationCore

import typingsSlinky.reactNavigationCore.anon.Descriptors
import typingsSlinky.reactNavigationCore.typesMod.DefaultNavigatorOptions
import typingsSlinky.reactNavigationRouters.typesMod.DefaultRouterOptions
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.reactNavigationRouters.typesMod.RouterFactory
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNavigationBuilderMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationBuilder", JSImport.Default)
  @js.native
  def default[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, _] */](
    createRouter: RouterFactory[State, _, RouterOptions],
    options: (DefaultNavigatorOptions[ScreenOptions, ParamListBase]) with RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = js.native
}
