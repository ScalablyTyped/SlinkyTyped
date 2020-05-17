package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.privacy.Network
import typingsSlinky.chrome.chrome.privacy.Services
import typingsSlinky.chrome.chrome.privacy.Websites
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofprivacy extends js.Object {
  var network: Network = js.native
  var services: Services = js.native
  var websites: Websites = js.native
}

object Typeofprivacy {
  @scala.inline
  def apply(network: Network, services: Services, websites: Websites): Typeofprivacy = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], websites = websites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofprivacy]
  }
  @scala.inline
  implicit class TypeofprivacyOps[Self <: Typeofprivacy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetwork(value: Network): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServices(value: Services): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebsites(value: Websites): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websites")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

