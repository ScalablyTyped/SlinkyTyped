package typingsSlinky.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends js.Object {
  var `animation-delay`: String = js.native
  var transform: String = js.native
}

object Transform {
  @scala.inline
  def apply(`animation-delay`: String, transform: String): Transform = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  @scala.inline
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAnimation-delay`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

