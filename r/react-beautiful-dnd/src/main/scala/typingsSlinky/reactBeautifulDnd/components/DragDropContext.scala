package typingsSlinky.reactBeautifulDnd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactBeautifulDnd.mod.BeforeCapture
import typingsSlinky.reactBeautifulDnd.mod.DragDropContextProps
import typingsSlinky.reactBeautifulDnd.mod.DragStart
import typingsSlinky.reactBeautifulDnd.mod.DragUpdate
import typingsSlinky.reactBeautifulDnd.mod.DropResult
import typingsSlinky.reactBeautifulDnd.mod.ResponderProvided
import typingsSlinky.reactBeautifulDnd.mod.Sensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragDropContext
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBeautifulDnd.mod.DragDropContext] {
  @JSImport("react-beautiful-dnd", "DragDropContext")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onDragEnd: (DropResult, ResponderProvided) => Unit,
    onBeforeCapture: /* before */ BeforeCapture => Unit = null,
    onBeforeDragStart: /* initial */ DragStart => Unit = null,
    onDragStart: (/* initial */ DragStart, /* provided */ ResponderProvided) => Unit = null,
    onDragUpdate: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Unit = null,
    sensors: js.Array[Sensor] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBeautifulDnd.mod.DragDropContext] = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    if (onBeforeCapture != null) __obj.updateDynamic("onBeforeCapture")(js.Any.fromFunction1(onBeforeCapture))
    if (onBeforeDragStart != null) __obj.updateDynamic("onBeforeDragStart")(js.Any.fromFunction1(onBeforeDragStart))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2(onDragStart))
    if (onDragUpdate != null) __obj.updateDynamic("onDragUpdate")(js.Any.fromFunction2(onDragUpdate))
    if (sensors != null) __obj.updateDynamic("sensors")(sensors.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DragDropContextProps
}

