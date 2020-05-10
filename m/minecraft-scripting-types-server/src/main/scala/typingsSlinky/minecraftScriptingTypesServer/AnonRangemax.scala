package typingsSlinky.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRangemax extends js.Object {
  /**
    * The maximum amount of damage the entity will deal
    * @default 0.0
    */
  var range_max: Double = js.native
  /**
    * The minimum amount of damage the entity will deal
    * @default 0.0
    */
  var range_min: Double = js.native
}

object AnonRangemax {
  @scala.inline
  def apply(range_max: Double, range_min: Double): AnonRangemax = {
    val __obj = js.Dynamic.literal(range_max = range_max.asInstanceOf[js.Any], range_min = range_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRangemax]
  }
  @scala.inline
  implicit class AnonRangemaxOps[Self <: AnonRangemax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange_max(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange_min(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range_min")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

