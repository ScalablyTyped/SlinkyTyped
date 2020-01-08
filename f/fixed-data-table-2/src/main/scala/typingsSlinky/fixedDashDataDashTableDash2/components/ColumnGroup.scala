package typingsSlinky.fixedDashDataDashTableDash2.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Mod.ColumnGroupHeaderProps
import typingsSlinky.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Mod.ColumnGroupProps
import typingsSlinky.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Strings.center
import typingsSlinky.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Strings.left
import typingsSlinky.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Strings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnGroup
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Mod.ColumnGroup
    ] {
  @JSImport("fixed-data-table-2", "ColumnGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    align: left | center | right = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    header: String | ReactElement | (js.Function1[/* props */ ColumnGroupHeaderProps, String | ReactElement]) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Mod.ColumnGroup
  ] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Mod.ColumnGroup
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Mod.ColumnGroup](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ColumnGroupProps
}

