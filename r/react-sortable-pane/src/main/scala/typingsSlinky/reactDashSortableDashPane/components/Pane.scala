package typingsSlinky.reactDashSortableDashPane.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashSortableDashPane.Anon_Height
import typingsSlinky.reactDashSortableDashPane.libPaneMod.IsPaneResizable
import typingsSlinky.reactDashSortableDashPane.libPaneMod.PaneProps
import typingsSlinky.reactDashSortableDashPane.libPaneMod.PaneSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pane
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSortableDashPane.libPaneMod.Pane] {
  @JSImport("react-sortable-pane/lib/pane", "Pane")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    defaultSize: Anon_Height = null,
    grid: js.Tuple2[Double, Double] = null,
    maxHeight: PaneSize = null,
    maxWidth: PaneSize = null,
    minHeight: PaneSize = null,
    minWidth: PaneSize = null,
    onSizeChange: () => Unit = null,
    resizable: IsPaneResizable = null,
    size: Anon_Height = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashSortableDashPane.libPaneMod.Pane] = {
    val __obj = js.Dynamic.literal()
    if (defaultSize != null) __obj.updateDynamic("defaultSize")(defaultSize.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onSizeChange != null) __obj.updateDynamic("onSizeChange")(js.Any.fromFunction0(onSizeChange))
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashSortableDashPane.libPaneMod.Pane] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashSortableDashPane.libPaneMod.Pane](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PaneProps
}

