package typingsSlinky.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateResult extends js.Object {
  var translateResult: String = js.native
}

object TranslateResult {
  @scala.inline
  def apply(translateResult: String): TranslateResult = {
    val __obj = js.Dynamic.literal(translateResult = translateResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateResult]
  }
  @scala.inline
  implicit class TranslateResultOps[Self <: TranslateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslateResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

