package typingsSlinky.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Triggers the webviewWebRequest.*OnMessageEvent* event which are used in webviews.
  */
@js.native
trait SendMessageToExtension extends OnRequestActions {
  val instanceType: String = js.native
  val typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.SendMessageToExtension = js.native
}

object SendMessageToExtension {
  @scala.inline
  def apply(instanceType: String, typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.SendMessageToExtension): SendMessageToExtension = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageToExtension]
  }
  @scala.inline
  implicit class SendMessageToExtensionOps[Self <: SendMessageToExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeGuard(value: typingsSlinky.chromeApps.chromeAppsStrings.SendMessageToExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeGuard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

