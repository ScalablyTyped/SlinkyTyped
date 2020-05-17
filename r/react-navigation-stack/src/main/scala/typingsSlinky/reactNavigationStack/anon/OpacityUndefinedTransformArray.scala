package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpacityUndefinedTransformArray extends js.Object {
  var opacity: js.UndefOr[scala.Nothing] = js.native
  var transform: js.Array[TranslateYAnimatedInterpolation] = js.native
}

object OpacityUndefinedTransformArray {
  @scala.inline
  def apply(transform: js.Array[TranslateYAnimatedInterpolation]): OpacityUndefinedTransformArray = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityUndefinedTransformArray]
  }
  @scala.inline
  implicit class OpacityUndefinedTransformArrayOps[Self <: OpacityUndefinedTransformArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransform(value: js.Array[TranslateYAnimatedInterpolation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

