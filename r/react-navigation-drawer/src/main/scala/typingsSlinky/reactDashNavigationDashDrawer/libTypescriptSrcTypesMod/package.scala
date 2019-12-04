package typingsSlinky.reactDashNavigationDashDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypescriptSrcTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationDescriptor
  import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
  import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
  import typingsSlinky.reactDashNavigationDashDrawer.Anon_Dark
  import typingsSlinky.reactDashNavigationDashDrawer.Anon_NavigationOptions

  type NavigationDrawerScreenComponent[Params, ScreenProps] = (ReactComponentClass[NavigationDrawerScreenProps[Params, ScreenProps]]) with (Anon_NavigationOptions[Params, ScreenProps])
  type SceneDescriptorMap = StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], js.Any]
    ]
  ]
  type ThemedColor = String | Anon_Dark
}
