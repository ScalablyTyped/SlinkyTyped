package typingsSlinky.ionicDiscover.publisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interface extends js.Object {
  var address: String = js.native
  var broadcast: String = js.native
}

object Interface {
  @scala.inline
  def apply(address: String, broadcast: String): Interface = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interface]
  }
  @scala.inline
  implicit class InterfaceOps[Self <: Interface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroadcast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

