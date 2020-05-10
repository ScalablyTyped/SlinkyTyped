package typingsSlinky.reactNativeSensorManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTemp extends js.Object {
  var temp: Double = js.native
}

object AnonTemp {
  @scala.inline
  def apply(temp: Double): AnonTemp = {
    val __obj = js.Dynamic.literal(temp = temp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTemp]
  }
  @scala.inline
  implicit class AnonTempOps[Self <: AnonTemp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

