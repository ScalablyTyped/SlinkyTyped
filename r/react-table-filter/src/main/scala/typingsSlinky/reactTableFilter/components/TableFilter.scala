package typingsSlinky.reactTableFilter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTableFilter.mod.TabfilterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableFilter {
  @JSImport("react-table-filter", "TableFilter")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactTableFilter.mod.TableFilter] {
    @scala.inline
    def initialFiltersVarargs(value: String*): this.type = set("initialFilters", js.Array(value :_*))
    @scala.inline
    def initialFilters(value: String | js.Array[String] | StringDictionary[Boolean]): this.type = set("initialFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def rowClass(value: String): this.type = set("rowClass", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabfilterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    onFilterUpdate: (js.Array[String], js.Array[_]) => js.Array[_] | Unit,
    rows: String | js.Array[String] | StringDictionary[Boolean]
  ): Builder = {
    val __props = js.Dynamic.literal(onFilterUpdate = js.Any.fromFunction2(onFilterUpdate), rows = rows.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabfilterProps]))
  }
}

