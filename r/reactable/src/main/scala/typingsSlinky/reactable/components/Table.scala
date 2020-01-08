package typingsSlinky.reactable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactable.Anon_Column
import typingsSlinky.reactable.reactableMod.ColumnsType
import typingsSlinky.reactable.reactableMod.TableComponentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactable.reactableMod.Table[js.Any]] {
  @JSImport("reactable", "Table")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply[T](
    columns: js.Array[ColumnsType] = null,
    currentPage: Int | Double = null,
    data: js.Array[T] = null,
    defaultSort: Anon_Column = null,
    filterBy: String = null,
    filterable: js.Array[String] = null,
    hideFilterInput: js.UndefOr[Boolean] = js.undefined,
    itemsPerPage: Int | Double = null,
    noDataText: String = null,
    onFilter: /* text */ String => Unit = null,
    pageButtonLimit: Int | Double = null,
    sortBy: js.UndefOr[Boolean] = js.undefined,
    sortable: js.Array[String] | Boolean = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactable.reactableMod.Table[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultSort != null) __obj.updateDynamic("defaultSort")(defaultSort.asInstanceOf[js.Any])
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy.asInstanceOf[js.Any])
    if (filterable != null) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFilterInput)) __obj.updateDynamic("hideFilterInput")(hideFilterInput.asInstanceOf[js.Any])
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (pageButtonLimit != null) __obj.updateDynamic("pageButtonLimit")(pageButtonLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(sortBy)) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactable.reactableMod.Table[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactable.reactableMod.Table[js.Any]] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactable.reactableMod.Table[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TableComponentProperties[js.Any]
}

