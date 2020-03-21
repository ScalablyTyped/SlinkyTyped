package typingsSlinky.reactTouch.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactTouch.mod.CustomGestureProps
import typingsSlinky.reactTouch.mod.moves
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CustomGesture
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactTouch.mod.CustomGesture] {
  @JSImport("react-touch", "CustomGesture")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(config: js.Array[moves], onGesture: () => Unit, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactTouch.mod.CustomGesture] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], onGesture = js.Any.fromFunction0(onGesture))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CustomGestureProps
}

