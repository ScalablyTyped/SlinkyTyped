package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.baseuiStrings.ASC
import typingsSlinky.baseui.baseuiStrings.DESC
import typingsSlinky.baseui.tableSemanticMod.BuilderOverrides
import typingsSlinky.baseui.tableSemanticMod.TableBuilderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBuilder
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.tableSemanticMod.TableBuilder[js.Any]] {
  @JSImport("baseui/table-semantic", "TableBuilder")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[RowT](
    data: js.Array[RowT],
    horizontalScrollWidth: String = null,
    onSort: /* columnId */ String => Unit = null,
    overrides: BuilderOverrides = null,
    sortColumn: String = null,
    sortOrder: ASC | DESC = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.tableSemanticMod.TableBuilder[js.Any]] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (horizontalScrollWidth != null) __obj.updateDynamic("horizontalScrollWidth")(horizontalScrollWidth.asInstanceOf[js.Any])
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.baseui.tableSemanticMod.TableBuilder[js.Any]]]
  }
  type Props = TableBuilderProps[js.Any]
}

