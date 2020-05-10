package typingsSlinky.overlayscrollbars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionChangedArgs extends js.Object {
  var dir: String = js.native
  var isRTL: Double = js.native
}

object DirectionChangedArgs {
  @scala.inline
  def apply(dir: String, isRTL: Double): DirectionChangedArgs = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionChangedArgs]
  }
  @scala.inline
  implicit class DirectionChangedArgsOps[Self <: DirectionChangedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRTL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

