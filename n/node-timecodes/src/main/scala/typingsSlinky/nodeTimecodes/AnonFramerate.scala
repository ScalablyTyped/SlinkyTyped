package typingsSlinky.nodeTimecodes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFramerate extends js.Object {
  var framerate: Double = js.native
}

object AnonFramerate {
  @scala.inline
  def apply(framerate: Double): AnonFramerate = {
    val __obj = js.Dynamic.literal(framerate = framerate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFramerate]
  }
  @scala.inline
  implicit class AnonFramerateOps[Self <: AnonFramerate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFramerate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framerate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

