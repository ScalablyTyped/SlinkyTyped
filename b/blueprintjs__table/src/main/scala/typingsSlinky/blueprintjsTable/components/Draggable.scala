package typingsSlinky.blueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsTable.draggableMod.ICoordinateData
import typingsSlinky.blueprintjsTable.draggableMod.IDraggableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Draggable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsTable.mod.Draggable] {
  @JSImport("@blueprintjs/table", "Draggable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    onActivate: /* event */ MouseEvent => Boolean = null,
    onClick: /* event */ MouseEvent => Unit = null,
    onDoubleClick: /* event */ MouseEvent => Unit = null,
    onDragEnd: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Unit = null,
    onDragMove: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Unit = null,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.Draggable] = {
    val __obj = js.Dynamic.literal()
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1(onActivate))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2(onDragEnd))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction2(onDragMove))
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.Draggable] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.blueprintjsTable.mod.Draggable](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDraggableProps
}

