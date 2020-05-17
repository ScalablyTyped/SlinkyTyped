package typingsSlinky.phonegapPluginPush.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationServerKey extends js.Object {
  /**
  			 * Your GCM API key if you are using VAPID keys.
  			 */
  var applicationServerKey: js.UndefOr[String] = js.native
  /**
  			 * URL for the push server you want to use. Default is 'http://push.api.phonegap.com/v1/push'.
  			 */
  var pushServiceURL: js.UndefOr[String] = js.native
}

object ApplicationServerKey {
  @scala.inline
  def apply(): ApplicationServerKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationServerKey]
  }
  @scala.inline
  implicit class ApplicationServerKeyOps[Self <: ApplicationServerKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationServerKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationServerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationServerKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationServerKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPushServiceURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushServiceURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushServiceURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushServiceURL")(js.undefined)
        ret
    }
  }
  
}

