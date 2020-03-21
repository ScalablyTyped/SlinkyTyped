package typingsSlinky.navigationReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.navigation.mod.StateNavigator
import typingsSlinky.navigationReact.AnonStateNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigationHandler
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.navigationReact.mod.NavigationHandler] {
  @JSImport("navigation-react", "NavigationHandler")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(stateNavigator: StateNavigator, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.navigationReact.mod.NavigationHandler] = {
    val __obj = js.Dynamic.literal(stateNavigator = stateNavigator.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnonStateNavigator
}

