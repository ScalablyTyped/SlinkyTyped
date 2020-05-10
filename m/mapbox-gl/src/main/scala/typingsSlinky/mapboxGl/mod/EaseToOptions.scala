package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EaseToOptions
  extends AnimationOptions
     with CameraOptions {
  var delayEndEvents: js.UndefOr[Double] = js.native
}

object EaseToOptions {
  @scala.inline
  def apply(): EaseToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EaseToOptions]
  }
  @scala.inline
  implicit class EaseToOptionsOps[Self <: EaseToOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayEndEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayEndEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayEndEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayEndEvents")(js.undefined)
        ret
    }
  }
  
}

