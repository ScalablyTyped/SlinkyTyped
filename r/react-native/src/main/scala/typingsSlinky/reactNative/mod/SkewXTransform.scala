package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkewXTransform extends js.Object {
  var skewX: String = js.native
}

object SkewXTransform {
  @scala.inline
  def apply(skewX: String): SkewXTransform = {
    val __obj = js.Dynamic.literal(skewX = skewX.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkewXTransform]
  }
  @scala.inline
  implicit class SkewXTransformOps[Self <: SkewXTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkewX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewX")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

