package typingsSlinky.actioncable

import typingsSlinky.actioncable.ActionCable.Cable
import typingsSlinky.actioncable.ActionCable.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppInterface extends js.Object {
  var cable: js.UndefOr[Cable] = js.native
  var network: js.UndefOr[Channel] = js.native
}

object AppInterface {
  @scala.inline
  def apply(): AppInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInterface]
  }
  @scala.inline
  implicit class AppInterfaceOps[Self <: AppInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCable(value: Cable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cable")(js.undefined)
        ret
    }
    @scala.inline
    def withNetwork(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
  }
  
}

