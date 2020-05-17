package typingsSlinky.cassandraDriver.anon

import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureConnectBundle extends js.Object {
  var secureConnectBundle: String | URL_ = js.native
}

object SecureConnectBundle {
  @scala.inline
  def apply(secureConnectBundle: String | URL_): SecureConnectBundle = {
    val __obj = js.Dynamic.literal(secureConnectBundle = secureConnectBundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureConnectBundle]
  }
  @scala.inline
  implicit class SecureConnectBundleOps[Self <: SecureConnectBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecureConnectBundle(value: String | URL_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureConnectBundle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

