package typingsSlinky.canvasjs.mod

import typingsSlinky.canvasjs.AnonChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartLegendOptions extends js.Object {
  /**
    * Sets the cursor type for legend items.
    * Default: "default"
    * Examples: "pointer", "crosshair" ..
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * When dockInsidePlotArea is set to true, legend renders inside the plot area there by giving more space to plot area.
    * Default: false
    * Example: true, false
    */
  var dockInsidePlotArea: js.UndefOr[Boolean] = js.native
  /**
    * Sets the font color of Legend Text . The value of fontColor can be a "HTML Color Name" or "hex" code .
    * Default: "black"
    * Example: "red", "#FAC003" ..
    */
  var fontColor: js.UndefOr[String] = js.native
  /**
    * Sets the Font Family of Legend Text.
    * Default: "calibri"
    * Example: "arial" , "tahoma", "verdana" ..
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * Sets the font Size of Legend Text in pixels.
    * Default: 20
    * Example: 16,18,22 ..
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * Sets the fontStyle of Legend Text. fontStyle can be set to one of the below options.
    * Default: "normal"
    * Example: "normal", "italic" , "oblique"
    */
  var fontStyle: js.UndefOr[String] = js.native
  /**
    * Sets the Font Weight of Legend Text.
    * Default: "normal"
    * Example: "lighter", "normal", "bold" , "bolder"
    */
  var fontWeight: js.UndefOr[String] = js.native
  /**
    * This property lets you align the Legend Position horizontally.
    * Default: "right"
    * Example: "left", "right", "center"
    */
  var horizontalAlign: js.UndefOr[String] = js.native
  /**
    * Sets the maximum width of individual legend items after which they get wrapped or clipped depending on whether itemWrap is set to true (default) or false.
    * itemMaxWidth can’t be greater than maxWidth of legend.
    * Default: Automatically calculated based on the chart size.
    * Example: 100, 150, 200 etc.
    */
  var itemMaxWidth: js.UndefOr[Double] = js.native
  /**
    * A custom formatter function that returns text to be displayed inside individual legend items.
    */
  var itemTextFormatter: js.UndefOr[js.Function1[/* e */ js.UndefOr[AnonChart], String]] = js.native
  /**
    * Sets the width of individual legend items after which the it gets wrapped or clipped depending on whether itemWrap is set to true (default) or false.
    * itemWidth can’t be greater than itemMaxWidth and maxWidth of legend.
    * Default: Automatically calculated based on chart size.
    * Example: 100, 200, 300 etc.
    */
  var itemWidth: js.UndefOr[Double] = js.native
  /**
    * itemWrap specifies whether to wrap or clip legendText once its width crosses itemMaxWidth / maxWidth.
    * Default: true
    * Example: true, false
    */
  var itemWrap: js.UndefOr[Boolean] = js.native
  /**
    * Sets the click event handler for the legend, which is triggered when the user clicks on a legend item.
    * After the event is triggered, the event related data is passed as a parameter to the assigned event handler.
    * Parameters passed to the function are shown in the Event Object section below.
    * @param event a chart event
    */
  var itemclick: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  /**
    * Sets the mousemove event handler for the legend, which is triggered when the user moves the mouse(input device) within a legend item.
    * When the event is triggered, the event related data is passed as a parameter to the assigned event handler.
    * Parameters passed to the function are shown in the Event Object section below.
    * @param event a chart event
    */
  var itemmousemove: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  /**
    * Sets the mouseout event handler for the legend, which is triggered when the user moves the mouse pointer outside a legend item.
    * After the event is triggered, the event related data is passed as a parameter to the assigned event handler.
    * Parameters passed to the function are shown in the Event Object section below.
    * @param event a chart event
    */
  var itemmouseout: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  /**
    * Sets the mouseover event handler for the legend, which is triggered when the user moves the mouse(input device) over a legend item.
    * After the event is triggered, the event related data is passed as a parameter to the assigned event handler. Parameters passed to the function are shown in the Event Object section below.
    * @param event a chart event
    */
  var itemmouseover: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  /**
    * Sets the margin between marker and text of each item inside legend.
    * Default: Automatically calculated based on the chart size.
    * Example: 4,12 ..
    */
  var markerMargin: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum height of legend. Once the maximum height is reached, remaining legend items are not shown when horizontally stacked (while on top or bottom or plotArea)
    * and a new column is created when items are vertically stacked (when displayed to the left or right of plotArea).
    * Default: Automatically calculated based on chart size.
    * Example: 100,200, 300 etc.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum width of legend. If any item is longer than the maxWidth, it gets wrapped or clipped depending on the itemWrap property. itemWrap is true by default.
    * Whenever items are stacked horizontally, new items are moved to the next row once maxWidth is reached.
    * Default: Automatically calculated based on the chart size.
    * Example: 100, 200, 500 etc.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * Setting reversed property to true shows legend items in reverse order.
    * Default: false;
    * Example: true, false
    */
  var reversed: js.UndefOr[Boolean] = js.native
  /**
    * This property lets you align the Legend Position vertically.
    * Default: "bottom"
    * Example: "top", "center", "bottom"
    */
  var verticalAlign: js.UndefOr[String] = js.native
}

object ChartLegendOptions {
  @scala.inline
  def apply(): ChartLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendOptions]
  }
  @scala.inline
  implicit class ChartLegendOptionsOps[Self <: ChartLegendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDockInsidePlotArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockInsidePlotArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockInsidePlotArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockInsidePlotArea")(js.undefined)
        ret
    }
    @scala.inline
    def withFontColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withItemMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTextFormatter(value: /* e */ js.UndefOr[AnonChart] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTextFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemTextFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTextFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withItemclick(value: /* event */ ChartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemclick")(js.undefined)
        ret
    }
    @scala.inline
    def withItemmousemove(value: /* event */ ChartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemmousemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemmousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemmousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withItemmouseout(value: /* event */ ChartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemmouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemmouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemmouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withItemmouseover(value: /* event */ ChartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemmouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemmouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemmouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
        ret
    }
  }
  
}

