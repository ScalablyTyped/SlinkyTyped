package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.afterAnimate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesAfterAnimateEventObject extends js.Object {
  /**
    * Animated series.
    */
  var target: Series = js.native
  /**
    * Event type.
    */
  var `type`: afterAnimate = js.native
}

object SeriesAfterAnimateEventObject {
  @scala.inline
  def apply(target: Series, `type`: afterAnimate): SeriesAfterAnimateEventObject = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesAfterAnimateEventObject]
  }
  @scala.inline
  implicit class SeriesAfterAnimateEventObjectOps[Self <: SeriesAfterAnimateEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: Series): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: afterAnimate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

