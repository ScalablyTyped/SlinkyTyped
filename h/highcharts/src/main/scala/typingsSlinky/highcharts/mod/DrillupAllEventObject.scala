package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.drillupall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrillupAllEventObject extends js.Object {
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function = js.native
  /**
    * The event target.
    */
  var target: Chart_ = js.native
  /**
    * The event type.
    */
  var `type`: drillupall = js.native
}

object DrillupAllEventObject {
  @scala.inline
  def apply(preventDefault: js.Function, target: Chart_, `type`: drillupall): DrillupAllEventObject = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrillupAllEventObject]
  }
  @scala.inline
  implicit class DrillupAllEventObjectOps[Self <: DrillupAllEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreventDefault(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Chart_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: drillupall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

