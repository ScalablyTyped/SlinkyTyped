package typingsSlinky.androiduix.androidui.AndroidUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIClient extends js.Object {
  var shouldShowAppClosed: js.UndefOr[js.Function1[/* androidUI */ typingsSlinky.androiduix.androidui.AndroidUI, _]] = js.native
}

object UIClient {
  @scala.inline
  def apply(): UIClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIClient]
  }
  @scala.inline
  implicit class UIClientOps[Self <: UIClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShouldShowAppClosed(value: /* androidUI */ typingsSlinky.androiduix.androidui.AndroidUI => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldShowAppClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldShowAppClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldShowAppClosed")(js.undefined)
        ret
    }
  }
  
}

