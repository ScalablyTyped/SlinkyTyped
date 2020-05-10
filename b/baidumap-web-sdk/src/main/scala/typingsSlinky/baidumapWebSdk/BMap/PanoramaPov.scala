package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoramaPov extends js.Object {
  var heading: Double = js.native
  var pitch: Double = js.native
}

object PanoramaPov {
  @scala.inline
  def apply(heading: Double, pitch: Double): PanoramaPov = {
    val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaPov]
  }
  @scala.inline
  implicit class PanoramaPovOps[Self <: PanoramaPov] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

