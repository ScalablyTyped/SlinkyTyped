package typingsSlinky.griddleReact.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.griddleReact.mod.GriddleComponent
import typingsSlinky.griddleReact.mod.components.CellProps
import typingsSlinky.griddleReact.mod.components.ColumnDefinitionProps
import typingsSlinky.griddleReact.mod.components.TableHeadingCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnDefinition {
  @JSImport("griddle-react", "components.ColumnDefinition")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.griddleReact.mod.components.ColumnDefinition] {
    @scala.inline
    def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def cssClassNameFunction1(value: /* props */ js.Any => String): this.type = set("cssClassName", js.Any.fromFunction1(value))
    @scala.inline
    def cssClassName(value: String | (js.Function1[/* props */ js.Any, String])): this.type = set("cssClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def customComponentFunctionComponent(value: ReactComponentClass[CellProps with js.Any]): this.type = set("customComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def customComponentComponentClass(value: ReactComponentClass[CellProps with js.Any]): this.type = set("customComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def customComponent(value: GriddleComponent[CellProps with js.Any]): this.type = set("customComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def customHeadingComponentFunctionComponent(value: ReactComponentClass[TableHeadingCellProps with js.Any]): this.type = set("customHeadingComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def customHeadingComponentComponentClass(value: ReactComponentClass[TableHeadingCellProps with js.Any]): this.type = set("customHeadingComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def customHeadingComponent(value: GriddleComponent[TableHeadingCellProps with js.Any]): this.type = set("customHeadingComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def extraData(value: js.Any): this.type = set("extraData", value.asInstanceOf[js.Any])
    @scala.inline
    def filterable(value: Boolean): this.type = set("filterable", value.asInstanceOf[js.Any])
    @scala.inline
    def headerCssClassNameFunction1(value: /* props */ js.Any => String): this.type = set("headerCssClassName", js.Any.fromFunction1(value))
    @scala.inline
    def headerCssClassName(value: String | (js.Function1[/* props */ js.Any, String])): this.type = set("headerCssClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def isMetadata(value: Boolean): this.type = set("isMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def locked(value: Boolean): this.type = set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def order(value: Double): this.type = set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def sortMethod(
      value: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): this.type = set("sortMethod", js.Any.fromFunction3(value))
    @scala.inline
    def sortType(value: String): this.type = set("sortType", value.asInstanceOf[js.Any])
    @scala.inline
    def sortable(value: Boolean): this.type = set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColumnDefinitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColumnDefinitionProps]))
  }
}

