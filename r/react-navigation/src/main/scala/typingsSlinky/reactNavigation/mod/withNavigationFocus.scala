package typingsSlinky.reactNavigation.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNavigation.anon.`4`
import typingsSlinky.reactNavigation.reactNavigationStrings.isFocused
import typingsSlinky.reactNavigation.reactNavigationStrings.navigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "withNavigationFocus")
@js.native
object withNavigationFocus extends js.Object {
  def apply[P /* <: NavigationFocusInjectedProps[NavigationParams] */](Component: ReactComponentClass[P]): ReactComponentClass[
    Omit[
      P, 
      /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ isFocused | navigation
    ]
  ] = js.native
  def apply[P /* <: NavigationFocusInjectedProps[NavigationParams] */, T /* <: ReactComponentClass[P] */](Component: T with ReactComponentClass[P]): ReactComponentClass[
    (Omit[
      P, 
      /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ isFocused | navigation
    ]) with (`4`[T, P])
  ] = js.native
}

