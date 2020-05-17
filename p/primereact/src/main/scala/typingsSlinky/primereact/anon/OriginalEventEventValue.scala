package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginalEventEventValue extends js.Object {
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  var value: Double | (js.Tuple2[Double, Double]) = js.native
}

object OriginalEventEventValue {
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, value: Double | (js.Tuple2[Double, Double])): OriginalEventEventValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventEventValue]
  }
  @scala.inline
  implicit class OriginalEventEventValueOps[Self <: OriginalEventEventValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalEvent(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double | (js.Tuple2[Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

