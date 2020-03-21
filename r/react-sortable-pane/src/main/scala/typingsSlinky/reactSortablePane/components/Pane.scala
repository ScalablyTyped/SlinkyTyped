package typingsSlinky.reactSortablePane.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactSortablePane.AnonHeight
import typingsSlinky.reactSortablePane.paneMod.IsPaneResizable
import typingsSlinky.reactSortablePane.paneMod.PaneProps
import typingsSlinky.reactSortablePane.paneMod.PaneSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pane
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactSortablePane.mod.Pane] {
  @JSImport("react-sortable-pane", "Pane")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    defaultSize: AnonHeight = null,
    grid: js.Tuple2[Double, Double] = null,
    maxHeight: PaneSize = null,
    maxWidth: PaneSize = null,
    minHeight: PaneSize = null,
    minWidth: PaneSize = null,
    onSizeChange: () => Unit = null,
    resizable: IsPaneResizable = null,
    size: AnonHeight = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactSortablePane.mod.Pane] = {
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
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactSortablePane.mod.Pane] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactSortablePane.mod.Pane](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PaneProps
}

