package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.layoutDashGridMod.ALIGNMENT
import typingsSlinky.baseui.layoutDashGridMod.CellProps
import typingsSlinky.baseui.layoutDashGridMod.Responsive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Unstable_Cell
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/layout-grid", "Unstable_Cell")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    align: Responsive[ALIGNMENT] = null,
    order: Responsive[Double] = null,
    skip: Responsive[Double] = null,
    span: Responsive[Double] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CellProps
}

