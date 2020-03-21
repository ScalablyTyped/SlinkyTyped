package typingsSlinky.fixedDataTable2.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.center
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.left
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.right
import typingsSlinky.fixedDataTable2.mod.ColumnGroupHeaderProps
import typingsSlinky.fixedDataTable2.mod.ColumnGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.fixedDataTable2.mod.ColumnGroup] {
  @JSImport("fixed-data-table-2", "ColumnGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    align: left | center | right = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    header: String | ReactElement | (js.Function1[/* props */ ColumnGroupHeaderProps, String | ReactElement]) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.fixedDataTable2.mod.ColumnGroup] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.fixedDataTable2.mod.ColumnGroup] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.fixedDataTable2.mod.ColumnGroup](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ColumnGroupProps
}

