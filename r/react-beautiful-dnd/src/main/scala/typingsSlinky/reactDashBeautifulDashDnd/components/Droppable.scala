package typingsSlinky.reactDashBeautifulDashDnd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.DroppableId
import typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.DroppableProps
import typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndStrings.horizontal
import typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Droppable
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.Droppable
    ] {
  @JSImport("react-beautiful-dnd", "Droppable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: type */
  def apply(
    droppableId: DroppableId,
    direction: vertical | horizontal = null,
    ignoreContainerClipping: js.UndefOr[Boolean] = js.undefined,
    isCombineEnabled: js.UndefOr[Boolean] = js.undefined,
    isDropDisabled: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.Droppable
  ] = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreContainerClipping)) __obj.updateDynamic("ignoreContainerClipping")(ignoreContainerClipping.asInstanceOf[js.Any])
    if (!js.isUndefined(isCombineEnabled)) __obj.updateDynamic("isCombineEnabled")(isCombineEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropDisabled)) __obj.updateDynamic("isDropDisabled")(isDropDisabled.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DroppableProps
}

