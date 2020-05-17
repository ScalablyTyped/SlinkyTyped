package typingsSlinky.flot.jquery.flot

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait legendOptions extends js.Object {
                  //number of pixels or [x margin, y margin]
  var backgroundColor: js.UndefOr[js.Any] = js.native
         //null or color
  var backgroundOpacity: js.UndefOr[Double] = js.native
    // between 0 and 1
  var container: js.UndefOr[JQuery[HTMLElement]] = js.native
   //  null or (fn: string, series object -> string)
  var labelBoxBorderColor: js.UndefOr[js.Any] = js.native
  var labelFormatter: js.UndefOr[js.Function2[/* label */ String, /* series */ js.Any, String]] = js.native
             //"ne" or "nw" or "se" or "sw"
  var margin: js.UndefOr[js.Any] = js.native
     //color
  var noColumns: js.UndefOr[Double] = js.native
  var position: js.UndefOr[String] = js.native
  var show: js.UndefOr[Boolean] = js.native
           // null or jQuery object/DOM element/jQuery expression
  var sorted: js.UndefOr[js.Any] = js.native
}

object legendOptions {
  @scala.inline
  def apply(): legendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[legendOptions]
  }
  @scala.inline
  implicit class legendOptionsOps[Self <: legendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: js.Any): Self = {
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
    def withBackgroundOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelBoxBorderColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBoxBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelBoxBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBoxBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFormatter(value: (/* label */ String, /* series */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLabelFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: js.Any): Self = {
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
    def withNoColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withSorted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(js.undefined)
        ret
    }
  }
  
}

