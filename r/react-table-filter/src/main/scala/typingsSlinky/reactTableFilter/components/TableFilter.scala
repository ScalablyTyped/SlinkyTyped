package typingsSlinky.reactTableFilter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactTableFilter.mod.TabfilterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableFilter
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactTableFilter.mod.TableFilter] {
  @JSImport("react-table-filter", "TableFilter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onFilterUpdate: (js.Array[String], js.Array[_]) => js.Array[_] | Unit,
    rows: String | js.Array[String] | StringDictionary[Boolean],
    initialFilters: String | js.Array[String] | StringDictionary[Boolean] = null,
    rowClass: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactTableFilter.mod.TableFilter] = {
    val __obj = js.Dynamic.literal(onFilterUpdate = js.Any.fromFunction2(onFilterUpdate), rows = rows.asInstanceOf[js.Any])
    if (initialFilters != null) __obj.updateDynamic("initialFilters")(initialFilters.asInstanceOf[js.Any])
    if (rowClass != null) __obj.updateDynamic("rowClass")(rowClass.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabfilterProps
}

