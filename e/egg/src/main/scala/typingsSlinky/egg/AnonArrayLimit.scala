package typingsSlinky.egg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArrayLimit extends js.Object {
  var arrayLimit: Double = js.native
  var depth: Double = js.native
  var parameterLimit: Double = js.native
}

object AnonArrayLimit {
  @scala.inline
  def apply(arrayLimit: Double, depth: Double, parameterLimit: Double): AnonArrayLimit = {
    val __obj = js.Dynamic.literal(arrayLimit = arrayLimit.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], parameterLimit = parameterLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrayLimit]
  }
  @scala.inline
  implicit class AnonArrayLimitOps[Self <: AnonArrayLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterLimit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

