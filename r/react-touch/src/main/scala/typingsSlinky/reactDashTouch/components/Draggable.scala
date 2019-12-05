package typingsSlinky.reactDashTouch.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashTouch.reactDashTouchMod.DraggableProps
import typingsSlinky.reactDashTouch.reactDashTouchMod.DraggableStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Draggable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashTouch.reactDashTouchMod.Draggable] {
  @JSImport("react-touch", "Draggable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(style: DraggableStyle, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashTouch.reactDashTouchMod.Draggable] = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DraggableProps
}

