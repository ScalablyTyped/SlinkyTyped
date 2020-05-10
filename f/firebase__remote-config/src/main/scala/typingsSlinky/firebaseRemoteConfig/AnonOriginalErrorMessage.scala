package typingsSlinky.firebaseRemoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOriginalErrorMessage extends js.Object {
  var originalErrorMessage: js.UndefOr[String] = js.native
}

object AnonOriginalErrorMessage {
  @scala.inline
  def apply(): AnonOriginalErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOriginalErrorMessage]
  }
  @scala.inline
  implicit class AnonOriginalErrorMessageOps[Self <: AnonOriginalErrorMessage] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutOriginalErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalErrorMessage")(js.undefined)
        ret
    }
  }
  
}

