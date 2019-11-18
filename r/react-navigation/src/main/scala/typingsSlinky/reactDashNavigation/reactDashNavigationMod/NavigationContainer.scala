package typingsSlinky.reactDashNavigation.reactDashNavigationMod

import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.reactDashNavigation.Anon_Nav
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationContainer
  extends ComponentClass[
      (NavigationContainerProps[js.Object, js.Object, _]) with (NavigationNavigatorProps[_, js.Object, _]), 
      ComponentState
    ] {
  var navigationOptions: js.Any = js.native
  var router: NavigationRouter[_, _] = js.native
  var screenProps: js.Any = js.native
  var state: Anon_Nav = js.native
}

