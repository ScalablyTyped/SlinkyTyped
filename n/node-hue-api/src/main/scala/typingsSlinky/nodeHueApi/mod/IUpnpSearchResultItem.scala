package typingsSlinky.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUpnpSearchResultItem extends js.Object {
  var id: String = js.native
  var ipaddress: String = js.native
}

object IUpnpSearchResultItem {
  @scala.inline
  def apply(id: String, ipaddress: String): IUpnpSearchResultItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ipaddress = ipaddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpnpSearchResultItem]
  }
  @scala.inline
  implicit class IUpnpSearchResultItemOps[Self <: IUpnpSearchResultItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpaddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipaddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

