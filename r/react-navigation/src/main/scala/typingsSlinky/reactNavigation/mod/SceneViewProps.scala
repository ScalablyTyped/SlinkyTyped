package typingsSlinky.reactNavigation.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewProps extends js.Object {
  var component: ReactComponentClass[js.Object]
  var navigation: NavigationProp[_]
  var screenProps: js.Any
}

object SceneViewProps {
  @scala.inline
  def apply(component: ReactComponentClass[js.Object], navigation: NavigationProp[_], screenProps: js.Any): SceneViewProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewProps]
  }
}

