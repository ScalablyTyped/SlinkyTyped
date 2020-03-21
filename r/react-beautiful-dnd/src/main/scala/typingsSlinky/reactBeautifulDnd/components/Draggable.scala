package typingsSlinky.reactBeautifulDnd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactBeautifulDnd.mod.DraggableId
import typingsSlinky.reactBeautifulDnd.mod.DraggableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Draggable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBeautifulDnd.mod.Draggable] {
  @JSImport("react-beautiful-dnd", "Draggable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    draggableId: DraggableId,
    index: Double,
    disableInteractiveElementBlocking: js.UndefOr[Boolean] = js.undefined,
    isDragDisabled: js.UndefOr[Boolean] = js.undefined,
    shouldRespectForcePress: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBeautifulDnd.mod.Draggable] = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInteractiveElementBlocking)) __obj.updateDynamic("disableInteractiveElementBlocking")(disableInteractiveElementBlocking.asInstanceOf[js.Any])
    if (!js.isUndefined(isDragDisabled)) __obj.updateDynamic("isDragDisabled")(isDragDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRespectForcePress)) __obj.updateDynamic("shouldRespectForcePress")(shouldRespectForcePress.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DraggableProps
}

