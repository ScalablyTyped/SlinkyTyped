package typingsSlinky.reactDashDragtastic.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.DraggableProps
import typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.Id
import typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Draggable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.Draggable] {
  @JSImport("react-dragtastic", "Draggable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onDragEnd, onDragStart */
  def apply(
    data: js.Any = null,
    delay: Int | Double = null,
    id: Id = null,
    onDrag: () => Unit = null,
    subscribeTo: js.Array[String] = null,
    `type`: Type = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.Draggable] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction0(onDrag))
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DraggableProps
}

