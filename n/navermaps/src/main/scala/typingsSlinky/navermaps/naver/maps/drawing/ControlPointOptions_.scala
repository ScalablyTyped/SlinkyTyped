package typingsSlinky.navermaps.naver.maps.drawing

import typingsSlinky.navermaps.naver.maps.CircleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlPointOptions_ extends js.Object {
  var anchorPointOptions: CircleOptions = js.native
  var midPointOptions: CircleOptions = js.native
}

object ControlPointOptions_ {
  @scala.inline
  def apply(anchorPointOptions: CircleOptions, midPointOptions: CircleOptions): ControlPointOptions_ = {
    val __obj = js.Dynamic.literal(anchorPointOptions = anchorPointOptions.asInstanceOf[js.Any], midPointOptions = midPointOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlPointOptions_]
  }
  @scala.inline
  implicit class ControlPointOptions_Ops[Self <: ControlPointOptions_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorPointOptions(value: CircleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPointOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMidPointOptions(value: CircleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midPointOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

