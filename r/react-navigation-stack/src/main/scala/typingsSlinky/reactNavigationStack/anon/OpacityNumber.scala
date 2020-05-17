package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpacityNumber extends js.Object {
  var opacity: Double = js.native
  var transform: js.Array[TranslateY | TranslateXTranslateY] = js.native
}

object OpacityNumber {
  @scala.inline
  def apply(opacity: Double, transform: js.Array[TranslateY | TranslateXTranslateY]): OpacityNumber = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityNumber]
  }
  @scala.inline
  implicit class OpacityNumberOps[Self <: OpacityNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: js.Array[TranslateY | TranslateXTranslateY]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

