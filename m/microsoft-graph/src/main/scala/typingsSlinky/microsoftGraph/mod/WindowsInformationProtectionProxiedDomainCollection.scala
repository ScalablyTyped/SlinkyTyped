package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsInformationProtectionProxiedDomainCollection extends js.Object {
  // Display name
  var displayName: js.UndefOr[String] = js.native
  // Collection of proxied domains
  var proxiedDomains: js.UndefOr[js.Array[ProxiedDomain]] = js.native
}

object WindowsInformationProtectionProxiedDomainCollection {
  @scala.inline
  def apply(): WindowsInformationProtectionProxiedDomainCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionProxiedDomainCollection]
  }
  @scala.inline
  implicit class WindowsInformationProtectionProxiedDomainCollectionOps[Self <: WindowsInformationProtectionProxiedDomainCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withProxiedDomains(value: js.Array[ProxiedDomain]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxiedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxiedDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxiedDomains")(js.undefined)
        ret
    }
  }
  
}

