package typingsSlinky.reactNativeNavigation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeNavigation.sharedElementMod.SharedElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SharedElement {
  @JSImport("react-native-navigation/lib/dist/adapters/SharedElement", "SharedElement")
  @js.native
  object component extends js.Object
  
  def withProps(p: SharedElementProps): Default[tag.type, typingsSlinky.reactNativeNavigation.sharedElementMod.SharedElement] = new Default[tag.type, typingsSlinky.reactNativeNavigation.sharedElementMod.SharedElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(elementId: String, resizeMode: String): Default[tag.type, typingsSlinky.reactNativeNavigation.sharedElementMod.SharedElement] = {
    val __props = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactNativeNavigation.sharedElementMod.SharedElement](js.Array(this.component, __props.asInstanceOf[SharedElementProps]))
  }
}

