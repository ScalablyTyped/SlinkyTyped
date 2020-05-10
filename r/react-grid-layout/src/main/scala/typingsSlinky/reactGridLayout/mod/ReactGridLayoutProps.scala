package typingsSlinky.reactGridLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactGridLayoutProps extends CoreProps {
  /**
    * Number of columns in this layout.
    */
  var cols: js.UndefOr[Double] = js.native
  /**
    * Padding inside the container `[x, y]` in px.
    */
  var containerPadding: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /**
    * Layout is an array of object with the format:
    *
    * `{x: number, y: number, w: number, h: number}`
    *
    * The index into the layout must match the key used on each item component.
    * If you choose to use custom keys, you can specify that key in the layout
    * array objects like so:
    *
    * `{i: string, x: number, y: number, w: number, h: number}`
    *
    * If not provided, use data-grid props on children.
    */
  var layout: js.UndefOr[js.Array[Layout]] = js.native
  /**
    * Margin between items `[x, y]` in px.
    */
  var margin: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /**
    * Callback so you can save the layout.
    * Calls back with (currentLayout) after every drag or resize stop.
    */
  var onLayoutChange: js.UndefOr[js.Function1[/* layout */ js.Array[Layout], Unit]] = js.native
}

object ReactGridLayoutProps {
  @scala.inline
  def apply(): ReactGridLayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactGridLayoutProps]
  }
  @scala.inline
  implicit class ReactGridLayoutPropsOps[Self <: ReactGridLayoutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerPadding(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: js.Array[Layout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayoutChange(value: /* layout */ js.Array[Layout] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayoutChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLayoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayoutChange")(js.undefined)
        ret
    }
  }
  
}

