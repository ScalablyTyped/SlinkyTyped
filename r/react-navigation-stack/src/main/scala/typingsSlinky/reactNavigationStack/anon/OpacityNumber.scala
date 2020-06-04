package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacityNumber extends js.Object {
  var opacity: Double
  var transform: js.Array[TranslateY | TranslateXTranslateY]
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransform(value: js.Array[TranslateY | TranslateXTranslateY]): Self = this.set("transform", value.asInstanceOf[js.Any])
  }
  
}

