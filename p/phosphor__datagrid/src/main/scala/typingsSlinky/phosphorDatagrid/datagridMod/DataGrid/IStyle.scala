package typingsSlinky.phosphorDatagrid.datagridMod.DataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which defines the style for a data grid.
  *
  * #### Notes
  * All style colors support the full CSS color syntax.
  */
@js.native
trait IStyle extends js.Object {
  /**
    * The background color for the body cells.
    *
    * This color is layered on top of the `voidColor`.
    */
  val backgroundColor: js.UndefOr[String] = js.native
  /**
    * A function which returns the background color for a column.
    *
    * This color is layered on top of the `backgroundColor` and can
    * be used to implement "zebra striping" of the grid columns.
    */
  val columnBackgroundColor: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  /**
    * The color for the grid lines of the body cells.
    *
    * The grid lines are draw on top of the cell contents.
    */
  val gridLineColor: js.UndefOr[String] = js.native
  /**
    * The background color for the header cells.
    *
    * This color is layered on top of the `voidColor`.
    */
  val headerBackgroundColor: js.UndefOr[String] = js.native
  /**
    * The color for the grid lines of the header cells.
    *
    * The grid lines are draw on top of the cell contents.
    */
  val headerGridLineColor: js.UndefOr[String] = js.native
  /**
    * The color for the horizontal grid lines of the header cells.
    *
    * This overrides the `headerGridLineColor` option.
    */
  val headerHorizontalGridLineColor: js.UndefOr[String] = js.native
  /**
    * The color for the vertical grid lines of the header cells.
    *
    * This overrides the `headerGridLineColor` option.
    */
  val headerVerticalGridLineColor: js.UndefOr[String] = js.native
  /**
    * The color for the horizontal grid lines of the body cells.
    *
    * This overrides the `gridLineColor` option.
    */
  val horizontalGridLineColor: js.UndefOr[String] = js.native
  /**
    * A function which returns the background color for a row.
    *
    * This color is layered on top of the `backgroundColor` and can
    * be used to implement "zebra striping" of the grid rows.
    */
  val rowBackgroundColor: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  /**
    * The color for the vertical grid lines of the body cells.
    *
    * This overrides the `gridLineColor` option.
    */
  val verticalGridLineColor: js.UndefOr[String] = js.native
  /**
    * The void color for the data grid.
    *
    * This is the base fill color for the entire data grid.
    */
  val voidColor: js.UndefOr[String] = js.native
}

object IStyle {
  @scala.inline
  def apply(): IStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStyle]
  }
  @scala.inline
  implicit class IStyleOps[Self <: IStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnBackgroundColor(value: /* index */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnBackgroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderGridLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerGridLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderGridLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerGridLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderHorizontalGridLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHorizontalGridLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderHorizontalGridLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHorizontalGridLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderVerticalGridLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerVerticalGridLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderVerticalGridLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerVerticalGridLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalGridLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalGridLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalGridLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalGridLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRowBackgroundColor(value: /* index */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowBackgroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalGridLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGridLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalGridLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGridLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withVoidColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voidColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoidColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voidColor")(js.undefined)
        ret
    }
  }
  
}

