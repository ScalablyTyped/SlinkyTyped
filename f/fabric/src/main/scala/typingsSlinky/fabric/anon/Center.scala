package typingsSlinky.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Center extends js.Object {
  var center: js.Any = js.native
  var farthest: js.Any = js.native
  var nearest: js.Any = js.native
}

object Center {
  @scala.inline
  def apply(center: js.Any, farthest: js.Any, nearest: js.Any): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], farthest = farthest.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  @scala.inline
  implicit class CenterOps[Self <: Center] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFarthest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("farthest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNearest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

