package typingsSlinky.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTranslateResult extends js.Object {
  var translateResult: String = js.native
}

object AnonTranslateResult {
  @scala.inline
  def apply(translateResult: String): AnonTranslateResult = {
    val __obj = js.Dynamic.literal(translateResult = translateResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranslateResult]
  }
  @scala.inline
  implicit class AnonTranslateResultOps[Self <: AnonTranslateResult] (val x: Self) extends AnyVal {
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

