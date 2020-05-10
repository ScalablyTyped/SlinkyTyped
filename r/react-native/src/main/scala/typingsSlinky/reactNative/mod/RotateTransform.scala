package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateTransform extends js.Object {
  var rotate: String = js.native
}

object RotateTransform {
  @scala.inline
  def apply(rotate: String): RotateTransform = {
    val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateTransform]
  }
  @scala.inline
  implicit class RotateTransformOps[Self <: RotateTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRotate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

