package typingsSlinky.reactDashNavigationDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypescriptTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationDescriptor
  import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
  import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
  import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationState
  import typingsSlinky.reactDashNavigationDashStack.Anon_NavigationOptions

  type NavigationStackScreenComponent[Params, ScreenProps] = (ReactComponentClass[NavigationStackScreenProps[Params, ScreenProps]]) with (Anon_NavigationOptions[Params, ScreenProps])
  type NavigationStackState = NavigationState
  type SceneDescriptorMap = StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      NavigationStackOptions, 
      NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ]
  type SceneInterpolator = js.Function1[/* props */ SceneInterpolatorProps, js.Any]
}
