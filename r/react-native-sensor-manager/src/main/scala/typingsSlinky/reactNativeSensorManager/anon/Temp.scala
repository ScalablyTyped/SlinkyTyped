package typingsSlinky.reactNativeSensorManager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Temp extends js.Object {
  var temp: Double = js.native
}

object Temp {
  @scala.inline
  def apply(temp: Double): Temp = {
    val __obj = js.Dynamic.literal(temp = temp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Temp]
  }
  @scala.inline
  implicit class TempOps[Self <: Temp] (val x: Self) extends AnyVal {
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

