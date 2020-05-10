package typingsSlinky.chrome

import typingsSlinky.chrome.chrome.privacy.Network_
import typingsSlinky.chrome.chrome.privacy.Services_
import typingsSlinky.chrome.chrome.privacy.Websites_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofprivacy extends js.Object {
  var network: Network_ = js.native
  var services: Services_ = js.native
  var websites: Websites_ = js.native
}

object Typeofprivacy {
  @scala.inline
  def apply(network: Network_, services: Services_, websites: Websites_): Typeofprivacy = {
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
    def withNetwork(value: Network_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServices(value: Services_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebsites(value: Websites_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websites")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

