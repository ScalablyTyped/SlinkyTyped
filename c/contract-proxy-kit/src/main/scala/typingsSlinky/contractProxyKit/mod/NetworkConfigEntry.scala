package typingsSlinky.contractProxyKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConfigEntry extends js.Object {
  var fallbackHandlerAddress: String = js.native
  var masterCopyAddress: String = js.native
  var multiSendAddress: String = js.native
  var proxyFactoryAddress: String = js.native
}

object NetworkConfigEntry {
  @scala.inline
  def apply(
    fallbackHandlerAddress: String,
    masterCopyAddress: String,
    multiSendAddress: String,
    proxyFactoryAddress: String
  ): NetworkConfigEntry = {
    val __obj = js.Dynamic.literal(fallbackHandlerAddress = fallbackHandlerAddress.asInstanceOf[js.Any], masterCopyAddress = masterCopyAddress.asInstanceOf[js.Any], multiSendAddress = multiSendAddress.asInstanceOf[js.Any], proxyFactoryAddress = proxyFactoryAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConfigEntry]
  }
  @scala.inline
  implicit class NetworkConfigEntryOps[Self <: NetworkConfigEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallbackHandlerAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackHandlerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasterCopyAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterCopyAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiSendAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSendAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyFactoryAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyFactoryAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

