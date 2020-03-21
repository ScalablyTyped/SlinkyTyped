package typingsSlinky.reactNavigation.mod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.reactNavigation.AnonNav
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
  var state: AnonNav = js.native
}

