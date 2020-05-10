package typingsSlinky.reactNativeShare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenReturn extends js.Object {
  var app: js.UndefOr[String] = js.native
  var dismissedAction: js.UndefOr[Boolean] = js.native
}

object OpenReturn {
  @scala.inline
  def apply(): OpenReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenReturn]
  }
  @scala.inline
  implicit class OpenReturnOps[Self <: OpenReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissedAction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissedAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissedAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissedAction")(js.undefined)
        ret
    }
  }
  
}

