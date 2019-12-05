package typingsSlinky.reactDashBeautifulDashDnd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.DragDropContextProps
import typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.DragStart
import typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.DragUpdate
import typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.DropResult
import typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.ResponderProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragDropContext
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.DragDropContext
    ] {
  @JSImport("react-beautiful-dnd", "DragDropContext")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onDragEnd: (DropResult, ResponderProvided) => Unit,
    onBeforeDragStart: /* initial */ DragStart => Unit = null,
    onDragStart: (/* initial */ DragStart, /* provided */ ResponderProvided) => Unit = null,
    onDragUpdate: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.DragDropContext
  ] = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    if (onBeforeDragStart != null) __obj.updateDynamic("onBeforeDragStart")(js.Any.fromFunction1(onBeforeDragStart))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2(onDragStart))
    if (onDragUpdate != null) __obj.updateDynamic("onDragUpdate")(js.Any.fromFunction2(onDragUpdate))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DragDropContextProps
}

