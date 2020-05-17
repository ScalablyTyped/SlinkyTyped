package typingsSlinky.firebaseRemoteConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginalErrorMessage extends js.Object {
  var originalErrorMessage: js.UndefOr[String] = js.native
}

object OriginalErrorMessage {
  @scala.inline
  def apply(): OriginalErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginalErrorMessage]
  }
  @scala.inline
  implicit class OriginalErrorMessageOps[Self <: OriginalErrorMessage] (val x: Self) extends AnyVal {
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

