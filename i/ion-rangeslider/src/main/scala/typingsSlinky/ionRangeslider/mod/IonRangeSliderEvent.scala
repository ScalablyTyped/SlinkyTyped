package typingsSlinky.ionRangeslider.mod

import typingsSlinky.ionRangeslider.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRangeSliderEvent extends js.Object {
   // MAX values
  var from: Double = js.native
   // FROM value
  var from_percent: Double = js.native
   // MAX prettified (if used)
  var from_pretty: String = js.native
   // FROM value in percents
  var from_value: Double = js.native
  var input: JQuery = js.native
   // MIN value
  var max: Double = js.native
   // MIN prettified (if used)
  var max_pretty: String = js.native
   // jQuery-link to sliders container
  var min: Double = js.native
   // TO index in values array (if used)
  var min_pretty: String = js.native
   // jQuery-link to input
  var slider: JQuery = js.native
   // FROM index in values array (if used)
  var to: Double = js.native
   // TO value
  var to_percent: Double = js.native
   // FROM prettified (if used)
  var to_pretty: String = js.native
   // TO value in percents
  var to_value: Double = js.native
}

object IonRangeSliderEvent {
  @scala.inline
  def apply(
    from: Double,
    from_percent: Double,
    from_pretty: String,
    from_value: Double,
    input: JQuery,
    max: Double,
    max_pretty: String,
    min: Double,
    min_pretty: String,
    slider: JQuery,
    to: Double,
    to_percent: Double,
    to_pretty: String,
    to_value: Double
  ): IonRangeSliderEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], from_percent = from_percent.asInstanceOf[js.Any], from_pretty = from_pretty.asInstanceOf[js.Any], from_value = from_value.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], max_pretty = max_pretty.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], min_pretty = min_pretty.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], to_percent = to_percent.asInstanceOf[js.Any], to_pretty = to_pretty.asInstanceOf[js.Any], to_value = to_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRangeSliderEvent]
  }
  @scala.inline
  implicit class IonRangeSliderEventOps[Self <: IonRangeSliderEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom_pretty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom_value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_pretty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin_pretty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlider(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo_pretty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo_value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

