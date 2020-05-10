package typingsSlinky.createEmotion.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmotionBaseContext extends js.Object {
  var __SECRET_EMOTION__ : js.UndefOr[Emotion] = js.native
}

object EmotionBaseContext {
  @scala.inline
  def apply(): EmotionBaseContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionBaseContext]
  }
  @scala.inline
  implicit class EmotionBaseContextOps[Self <: EmotionBaseContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__SECRET_EMOTION__(value: Emotion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__SECRET_EMOTION__")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__SECRET_EMOTION__ : Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__SECRET_EMOTION__")(js.undefined)
        ret
    }
  }
  
}

