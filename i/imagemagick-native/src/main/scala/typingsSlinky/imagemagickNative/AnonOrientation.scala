package typingsSlinky.imagemagickNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOrientation extends js.Object {
  var orientation: Double = js.native
}

object AnonOrientation {
  @scala.inline
  def apply(orientation: Double): AnonOrientation = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrientation]
  }
  @scala.inline
  implicit class AnonOrientationOps[Self <: AnonOrientation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

