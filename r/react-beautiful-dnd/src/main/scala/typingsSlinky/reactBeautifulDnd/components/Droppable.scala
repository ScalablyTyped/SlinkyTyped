package typingsSlinky.reactBeautifulDnd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactBeautifulDnd.mod.Direction
import typingsSlinky.reactBeautifulDnd.mod.DraggableProvided
import typingsSlinky.reactBeautifulDnd.mod.DraggableRubric
import typingsSlinky.reactBeautifulDnd.mod.DraggableStateSnapshot
import typingsSlinky.reactBeautifulDnd.mod.DroppableId
import typingsSlinky.reactBeautifulDnd.mod.DroppableMode
import typingsSlinky.reactBeautifulDnd.mod.DroppableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Droppable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBeautifulDnd.mod.Droppable] {
  @JSImport("react-beautiful-dnd", "Droppable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: type */
  def apply(
    droppableId: DroppableId,
    direction: Direction = null,
    getContainerForClone: () => ReactElement = null,
    ignoreContainerClipping: js.UndefOr[Boolean] = js.undefined,
    isCombineEnabled: js.UndefOr[Boolean] = js.undefined,
    isDropDisabled: js.UndefOr[Boolean] = js.undefined,
    mode: DroppableMode = null,
    renderClone: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBeautifulDnd.mod.Droppable] = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (getContainerForClone != null) __obj.updateDynamic("getContainerForClone")(js.Any.fromFunction0(getContainerForClone))
    if (!js.isUndefined(ignoreContainerClipping)) __obj.updateDynamic("ignoreContainerClipping")(ignoreContainerClipping.asInstanceOf[js.Any])
    if (!js.isUndefined(isCombineEnabled)) __obj.updateDynamic("isCombineEnabled")(isCombineEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropDisabled)) __obj.updateDynamic("isDropDisabled")(isDropDisabled.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (renderClone != null) __obj.updateDynamic("renderClone")(js.Any.fromFunction3(renderClone))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DroppableProps
}

