package typingsSlinky.atBlueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsResizableMod.IResizableProps
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsResizeHandleMod.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Resizable
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atBlueprintjsTable.libEsmInteractionsResizableMod.Resizable
    ] {
  @JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, size */
  def apply(
    onLayoutLock: js.UndefOr[Boolean] => Unit,
    orientation: Orientation,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    maxSize: Int | Double = null,
    minSize: Int | Double = null,
    onDoubleClick: () => Unit = null,
    onResizeEnd: /* size */ Double => Unit = null,
    onSizeChanged: /* size */ Double => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.atBlueprintjsTable.libEsmInteractionsResizableMod.Resizable
  ] = {
    val __obj = js.Dynamic.literal(onLayoutLock = js.Any.fromFunction1(onLayoutLock), orientation = orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction0(onDoubleClick))
    if (onResizeEnd != null) __obj.updateDynamic("onResizeEnd")(js.Any.fromFunction1(onResizeEnd))
    if (onSizeChanged != null) __obj.updateDynamic("onSizeChanged")(js.Any.fromFunction1(onSizeChanged))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IResizableProps
}

