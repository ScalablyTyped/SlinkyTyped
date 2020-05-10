package typingsSlinky.emotionSerialize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentSelector
  extends _CSSInterpolation
     with _Interpolation[js.Any] {
  var __emotion_styles: js.Any = js.native
}

object ComponentSelector {
  @scala.inline
  def apply(__emotion_styles: js.Any): ComponentSelector = {
    val __obj = js.Dynamic.literal(__emotion_styles = __emotion_styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentSelector]
  }
  @scala.inline
  implicit class ComponentSelectorOps[Self <: ComponentSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__emotion_styles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__emotion_styles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

