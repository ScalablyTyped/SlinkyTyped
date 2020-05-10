package typingsSlinky.griddleReact.mod.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.griddleReact.mod.GriddleComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDefinitionProps
  extends /* x */ StringDictionary[js.Any] {
  // TODO: Unused?
  //The number of cells this column should extend. Default is 1.
  var colSpan: js.UndefOr[Double] = js.native
  //The css class name, or a function to generate a class name from props, to apply to this column.
  var cssClassName: js.UndefOr[String | (js.Function1[/* props */ js.Any, String])] = js.native
  //The component that should be rendered instead of the standard column data. This component will still be rendered inside of a TD element.
  var customComponent: js.UndefOr[GriddleComponent[CellProps with js.Any]] = js.native
  //The component that should be used instead of the normal title
  var customHeadingComponent: js.UndefOr[GriddleComponent[TableHeadingCellProps with js.Any]] = js.native
  //Any extra data that should be passed to each instance of this column
  var extraData: js.UndefOr[js.Any] = js.native
  //Can this column be filtered
  var filterable: js.UndefOr[Boolean] = js.native
  //The css class name, or a function to generate a class name from props, to apply to the header for the column.
  var headerCssClassName: js.UndefOr[String | (js.Function1[/* props */ js.Any, String])] = js.native
  //The name of the column that this definition applies to.
  var id: String = js.native
  // Is this column metadta
  var isMetadata: js.UndefOr[Boolean] = js.native
  // TODO: Unused?
  //Determines whether or not the user can disable this column from the settings.
  var locked: js.UndefOr[Boolean] = js.native
  //The order that this column appears in. If not specified will just use the order that they are defined
  var order: js.UndefOr[Double] = js.native
  //What sort method this column uses
  var sortMethod: js.UndefOr[
    js.Function3[
      /* data */ js.Array[_], 
      /* column */ String, 
      /* sortAscending */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  // TODO: Unused?
  //What sort type this column uses - magic string :shame:
  var sortType: js.UndefOr[String] = js.native
  //Can this column be sorted
  var sortable: js.UndefOr[Boolean] = js.native
  //The display name for the column. This is used when the name in the column heading and settings should be different from the data passed in to the Griddle component.
  var title: js.UndefOr[String] = js.native
  // Is this column visible
  var visible: js.UndefOr[Boolean] = js.native
  //The width of this column -- this is string so things like % can be specified
  var width: js.UndefOr[Double | String] = js.native
}

object ColumnDefinitionProps {
  @scala.inline
  def apply(id: String): ColumnDefinitionProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinitionProps]
  }
  @scala.inline
  implicit class ColumnDefinitionPropsOps[Self <: ColumnDefinitionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClassNameFunction1(value: /* props */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCssClassName(value: String | (js.Function1[/* props */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomComponentFunctionComponent(value: ReactComponentClass[CellProps with js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomComponentComponentClass(value: ReactComponentClass[CellProps with js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomComponent(value: GriddleComponent[CellProps with js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomHeadingComponentFunctionComponent(value: ReactComponentClass[TableHeadingCellProps with js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeadingComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomHeadingComponentComponentClass(value: ReactComponentClass[TableHeadingCellProps with js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeadingComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomHeadingComponent(value: GriddleComponent[TableHeadingCellProps with js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeadingComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeadingComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeadingComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraData")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCssClassNameFunction1(value: /* props */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCssClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderCssClassName(value: String | (js.Function1[/* props */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCssClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCssClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCssClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withSortMethod(
      value: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortMethod")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSortMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withSortType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortType")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

