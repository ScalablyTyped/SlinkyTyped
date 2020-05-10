package typingsSlinky.jqueryGridster

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jqueryGridster.jqueryGridsterStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridsterOptions extends js.Object {
  /**
    * A boolean to specify if the stylesheet should be generated or not
    **/
  var autogenerate_stylesheet: js.UndefOr[Boolean] = js.native
  /**
  	* If true, all the CSS required to  osition  	l widgets in their respective col umns and rows will be generated automatically and injectedt the<head> of thed cument.You can set this to false, and write your own CSS targeting rows and cols via data - attributes like so: [data - col = "1"] { left: 10px; }
  	* Default = true
  	**/
  var autogenerate_sytesheet: js.UndefOr[Boolean] = js.native
  /**
  	* Avoid that widgets loaded from the DOM can be overlapped.  It is helpful if the positions were bad stored in the database or if there was any conflict.
  	* Default = true
  	**/
  var avoid_overlapped_widgets: js.UndefOr[Boolean] = js.native
  /**
  	* An object with all options for Collision class you want to overwrite.  @see GridsterCollision or docs for more info.
  	**/
  var collision: js.UndefOr[GridsterCollision] = js.native
  /**
  	* An object with all options for Draggable class you want to overwrite.  @see GridsterDraggable or docs for more info.
  	**/
  var draggable: js.UndefOr[GridsterDraggable] = js.native
  /**
  	* Add more columns in addition to those that have been calculated.
  	* Default = 0
  	**/
  var extra_cols: js.UndefOr[Double] = js.native
  /**
  	* Add more rows in addition to those that have been calculated.
  	* Default = 0
  	**/
  var extra_rows: js.UndefOr[Double] = js.native
  /**
  	* The maximum columns possible (set to null for no maximum).
  	* Default = null
  	**/
  var max_cols: js.UndefOr[Double] = js.native
  /**
  	* The maximum number of columns that a widget can span.
  	* Default = 6
  	**/
  var max_size_x: js.UndefOr[Double] = js.native
  /**
  	* The minimum required columns.
  	* Default = 1
  	**/
  var min_cols: js.UndefOr[Double] = js.native
  /**
  	* The minimum required rows.
  	* Default = 15
  	**/
  var min_rows: js.UndefOr[Double] = js.native
  /**
  	* A string to differentiate one gridster from another
  	**/
  var namespace: js.UndefOr[String] = js.native
  /**
    * An object with all options for Resizable class you want to overwrite.  @see GridsterResizable or docs for more info.
    **/
  var resize: js.UndefOr[GridsterResizable] = js.native
  /**
  	* Return the data you want for each widget in the serialization.
  	**/
  var serialize_params: js.UndefOr[js.Function2[/* $w */ JQuery, /* wgd */ GridsterCoords, _]] = js.native
  /**
  	* Base widget dimensions in pixels.  The first index for the width and the second for the height.
  	* Default = [400, 225]
  	**/
  var widget_base_dimensions: js.UndefOr[js.Array[auto | Double]] = js.native
  /**
  	* Margin between widgets.  The first index for the horizontal margin (left, right) and the second for the vertical margin (top, bottom).
  	* Default = [10, 10]
  	**/
  var widget_margins: js.UndefOr[js.Array[Double]] = js.native
  /**
  	* Define who will be the draggable widgets.  Can be a CSS Selector String or a collection of HTMLElements.
  	* Type => string css selector
  	* Type => HTMLElement[]
  	* Default = 'li'
  	**/
  var widget_selector: js.UndefOr[String | js.Array[HTMLElement]] = js.native
}

object GridsterOptions {
  @scala.inline
  def apply(): GridsterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterOptions]
  }
  @scala.inline
  implicit class GridsterOptionsOps[Self <: GridsterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutogenerate_stylesheet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autogenerate_stylesheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutogenerate_stylesheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autogenerate_stylesheet")(js.undefined)
        ret
    }
    @scala.inline
    def withAutogenerate_sytesheet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autogenerate_sytesheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutogenerate_sytesheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autogenerate_sytesheet")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoid_overlapped_widgets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoid_overlapped_widgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoid_overlapped_widgets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoid_overlapped_widgets")(js.undefined)
        ret
    }
    @scala.inline
    def withCollision(value: GridsterCollision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: GridsterDraggable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra_cols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra_cols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_cols")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra_rows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra_rows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_rows")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_cols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_cols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_cols")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_size_x(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_size_x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_size_x: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_size_x")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_cols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_cols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_cols")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_rows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_rows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_rows")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: GridsterResizable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize_params(value: (/* $w */ JQuery, /* wgd */ GridsterCoords) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize_params")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSerialize_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize_params")(js.undefined)
        ret
    }
    @scala.inline
    def withWidget_base_dimensions(value: js.Array[auto | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget_base_dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidget_base_dimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget_base_dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withWidget_margins(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget_margins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidget_margins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget_margins")(js.undefined)
        ret
    }
    @scala.inline
    def withWidget_selector(value: String | js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget_selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidget_selector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget_selector")(js.undefined)
        ret
    }
  }
  
}

