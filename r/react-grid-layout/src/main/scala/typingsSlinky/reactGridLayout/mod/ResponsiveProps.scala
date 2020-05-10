package typingsSlinky.reactGridLayout.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsiveProps extends CoreProps {
  /**
    * `{name: pxVal}, e.g. {lg: 1200, md: 996, sm: 768, xs: 480}`
    *
    * Breakpoint names are arbitrary but must match in the cols and layouts objects.
    */
  var breakpoints: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Number of cols. This is a breakpoint -> cols map, e.g. `{lg: 12, md: 10, ...}`.
    */
  var cols: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Padding inside the container in px and formatt [x, y] or { breakpoint: [x, y] }.
    */
  var containerPadding: js.UndefOr[(js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])] = js.native
  /**
    * layouts is an object mapping breakpoints to layouts.
    *
    * e.g. `{lg: Layout[], md: Layout[], ...}`
    */
  var layouts: js.UndefOr[Layouts] = js.native
  /**
    * Margin between items in px and formatt [x, y] or { breakpoint: [x, y] }.
    */
  var margin: js.UndefOr[(js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])] = js.native
  /**
    * Calls back with breakpoint and new number pf cols.
    */
  var onBreakpointChange: js.UndefOr[js.Function2[/* newBreakpoint */ String, /* newCols */ Double, Unit]] = js.native
  /**
    * Callback so you can save the layout.
    */
  var onLayoutChange: js.UndefOr[
    js.Function2[/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts, Unit]
  ] = js.native
  /**
    * Callback when the width changes, so you can modify the layout as needed.
    */
  var onWidthChange: js.UndefOr[
    js.Function4[
      /* containerWidth */ Double, 
      /* margin */ js.Tuple2[Double, Double], 
      /* cols */ Double, 
      /* containerPadding */ js.Tuple2[Double, Double], 
      Unit
    ]
  ] = js.native
}

object ResponsiveProps {
  @scala.inline
  def apply(): ResponsiveProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveProps]
  }
  @scala.inline
  implicit class ResponsivePropsOps[Self <: ResponsiveProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoints(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withCols(value: StringDictionary[Double]): Self = {
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
    def withContainerPadding(value: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])): Self = {
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
    def withLayouts(value: Layouts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layouts")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])): Self = {
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
    def withOnBreakpointChange(value: (/* newBreakpoint */ String, /* newCols */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBreakpointChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBreakpointChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBreakpointChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayoutChange(value: (/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayoutChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnLayoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayoutChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWidthChange(
      value: (/* containerWidth */ Double, /* margin */ js.Tuple2[Double, Double], /* cols */ Double, /* containerPadding */ js.Tuple2[Double, Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWidthChange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnWidthChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWidthChange")(js.undefined)
        ret
    }
  }
  
}

