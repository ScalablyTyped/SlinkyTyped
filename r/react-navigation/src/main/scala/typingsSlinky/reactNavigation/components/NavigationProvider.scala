package typingsSlinky.reactNavigation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNavigation.AnonValue
import typingsSlinky.reactNavigation.mod.NavigationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigationProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNavigation.mod.NavigationProvider] {
  @JSImport("react-navigation", "NavigationProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(value: NavigationProp[_], _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactNavigation.mod.NavigationProvider] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnonValue
}

