package typingsSlinky.firebaseRemoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOriginalErrorMessageString extends js.Object {
  var originalErrorMessage: String = js.native
}

object AnonOriginalErrorMessageString {
  @scala.inline
  def apply(originalErrorMessage: String): AnonOriginalErrorMessageString = {
    val __obj = js.Dynamic.literal(originalErrorMessage = originalErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOriginalErrorMessageString]
  }
  @scala.inline
  implicit class AnonOriginalErrorMessageStringOps[Self <: AnonOriginalErrorMessageString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

