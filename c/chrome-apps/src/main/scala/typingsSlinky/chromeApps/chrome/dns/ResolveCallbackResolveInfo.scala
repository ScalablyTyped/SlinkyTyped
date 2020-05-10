package typingsSlinky.chromeApps.chrome.dns

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveCallbackResolveInfo extends js.Object {
  /**
    * A string representing the IP address literal.
    * Supplied only if resultCode indicates success.
    * Note that we presently return only IPv4 addresses.
    */
  var address: js.UndefOr[String] = js.native
  /** The result code. Zero indicates success. */
  var resultCode: integer = js.native
}

object ResolveCallbackResolveInfo {
  @scala.inline
  def apply(resultCode: integer): ResolveCallbackResolveInfo = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveCallbackResolveInfo]
  }
  @scala.inline
  implicit class ResolveCallbackResolveInfoOps[Self <: ResolveCallbackResolveInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResultCode(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
  }
  
}

