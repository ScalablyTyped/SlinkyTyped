package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateX extends js.Object {
  var translateX: Double = js.native
}

object TranslateX {
  @scala.inline
  def apply(translateX: Double): TranslateX = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateX]
  }
  @scala.inline
  implicit class TranslateXOps[Self <: TranslateX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslateX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

