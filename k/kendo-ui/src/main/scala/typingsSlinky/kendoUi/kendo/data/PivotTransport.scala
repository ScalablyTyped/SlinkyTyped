package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotTransport extends js.Object {
  var discover: js.UndefOr[js.Any] = js.native
  var read: js.UndefOr[js.Any] = js.native
}

object PivotTransport {
  @scala.inline
  def apply(): PivotTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTransport]
  }
  @scala.inline
  implicit class PivotTransportOps[Self <: PivotTransport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscover(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discover")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
  }
  
}

