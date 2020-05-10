package typingsSlinky.jqueryGridster

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridsterResizable extends js.Object {
  var axes: js.UndefOr[js.Array[String]] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var handle_append_to: js.UndefOr[String] = js.native
  var handle_class: js.UndefOr[String] = js.native
  var max_size: js.UndefOr[js.Array[Double]] = js.native
  var min_size: js.UndefOr[js.Array[Double]] = js.native
  var resize: js.UndefOr[js.Function3[/* event */ Event_, /* ui */ GridsterUi, /* $el */ JQuery, Unit]] = js.native
  var start: js.UndefOr[js.Function3[/* event */ Event_, /* ui */ AnonHelper, /* $el */ JQuery, Unit]] = js.native
  var stop: js.UndefOr[js.Function3[/* event */ Event_, /* ui */ AnonHelper, /* $el */ JQuery, Unit]] = js.native
}

object GridsterResizable {
  @scala.inline
  def apply(): GridsterResizable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterResizable]
  }
  @scala.inline
  implicit class GridsterResizableOps[Self <: GridsterResizable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle_append_to(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle_append_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle_append_to: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle_append_to")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle_class")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_size(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_size")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_size(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_size")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: (/* event */ Event_, /* ui */ GridsterUi, /* $el */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: (/* event */ Event_, /* ui */ AnonHelper, /* $el */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: (/* event */ Event_, /* ui */ AnonHelper, /* $el */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
  }
  
}

