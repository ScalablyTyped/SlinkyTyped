package typingsSlinky.atBlueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsResizeHandleMod.IResizeHandleProps
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsResizeHandleMod.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResizeHandle
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsTable.atBlueprintjsTableMod.ResizeHandle] {
  @JSImport("@blueprintjs/table", "ResizeHandle")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    onLayoutLock: js.UndefOr[Boolean] => Unit,
    orientation: Orientation,
    onDoubleClick: () => Unit = null,
    onResizeEnd: /* offset */ Double => Unit = null,
    onResizeMove: (/* offset */ Double, /* delta */ Double) => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsTable.atBlueprintjsTableMod.ResizeHandle] = {
    val __obj = js.Dynamic.literal(onLayoutLock = js.Any.fromFunction1(onLayoutLock), orientation = orientation.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction0(onDoubleClick))
    if (onResizeEnd != null) __obj.updateDynamic("onResizeEnd")(js.Any.fromFunction1(onResizeEnd))
    if (onResizeMove != null) __obj.updateDynamic("onResizeMove")(js.Any.fromFunction2(onResizeMove))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IResizeHandleProps
}

