package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.layoutDashGridMod.ALIGNMENT
import typingsSlinky.baseui.layoutDashGridMod.BEHAVIOR
import typingsSlinky.baseui.layoutDashGridMod.GridProps
import typingsSlinky.baseui.layoutDashGridMod.Responsive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Unstable_Grid
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/layout-grid", "Unstable_Grid")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    align: Responsive[ALIGNMENT] = null,
    behavior: BEHAVIOR = null,
    gridColumns: Responsive[Double] = null,
    gridGaps: Responsive[Double] = null,
    gridGutters: Responsive[Double] = null,
    gridMargins: Responsive[Double] = null,
    gridMaxWidth: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (gridColumns != null) __obj.updateDynamic("gridColumns")(gridColumns.asInstanceOf[js.Any])
    if (gridGaps != null) __obj.updateDynamic("gridGaps")(gridGaps.asInstanceOf[js.Any])
    if (gridGutters != null) __obj.updateDynamic("gridGutters")(gridGutters.asInstanceOf[js.Any])
    if (gridMargins != null) __obj.updateDynamic("gridMargins")(gridMargins.asInstanceOf[js.Any])
    if (gridMaxWidth != null) __obj.updateDynamic("gridMaxWidth")(gridMaxWidth.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GridProps
}

