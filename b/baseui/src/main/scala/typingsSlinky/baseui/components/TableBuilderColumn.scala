package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.tableSemanticMod.ColumnOverrides
import typingsSlinky.baseui.tableSemanticMod.TableBuilderColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBuilderColumn
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.tableSemanticMod.TableBuilderColumn[js.Any]] {
  @JSImport("baseui/table-semantic", "TableBuilderColumn")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply[RowT](
    header: TagMod[Any] = null,
    numeric: js.UndefOr[Boolean] = js.undefined,
    overrides: ColumnOverrides = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.tableSemanticMod.TableBuilderColumn[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.baseui.tableSemanticMod.TableBuilderColumn[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.tableSemanticMod.TableBuilderColumn[js.Any]] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.baseui.tableSemanticMod.TableBuilderColumn[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TableBuilderColumnProps[js.Any]
}

