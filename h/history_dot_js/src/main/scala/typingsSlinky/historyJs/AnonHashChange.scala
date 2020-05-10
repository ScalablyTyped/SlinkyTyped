package typingsSlinky.historyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHashChange extends js.Object {
  var hashChange: js.UndefOr[js.Any] = js.native
  var pushState: js.UndefOr[js.Any] = js.native
}

object AnonHashChange {
  @scala.inline
  def apply(): AnonHashChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHashChange]
  }
  @scala.inline
  implicit class AnonHashChangeOps[Self <: AnonHashChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashChange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPushState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushState")(js.undefined)
        ret
    }
  }
  
}

