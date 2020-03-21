package typingsSlinky.muiDatatables.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.muiDatatables.mod.MUIDataTableFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableFilter
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("mui-datatables", "TableFilter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    filterData: js.Array[_],
    options: js.Object,
    classes: js.Object = null,
    filterList: js.Array[js.Array[String]] = null,
    onFilterRest: /* args */ js.Any => _ = null,
    onFilterUpdate: /* args */ js.Any => _ = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(filterData = filterData.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (filterList != null) __obj.updateDynamic("filterList")(filterList.asInstanceOf[js.Any])
    if (onFilterRest != null) __obj.updateDynamic("onFilterRest")(js.Any.fromFunction1(onFilterRest))
    if (onFilterUpdate != null) __obj.updateDynamic("onFilterUpdate")(js.Any.fromFunction1(onFilterUpdate))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MUIDataTableFilter
}

