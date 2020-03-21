package typingsSlinky.reactNativeNavigation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeNavigation.sharedElementMod.SharedElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SharedElement
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeNavigation.sharedElementMod.SharedElement] {
  @JSImport("react-native-navigation/lib/dist/adapters/SharedElement", "SharedElement")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(elementId: String, resizeMode: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactNativeNavigation.sharedElementMod.SharedElement] = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SharedElementProps
}

