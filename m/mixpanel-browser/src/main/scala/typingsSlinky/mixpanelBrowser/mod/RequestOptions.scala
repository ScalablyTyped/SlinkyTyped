package typingsSlinky.mixpanelBrowser.mod

import typingsSlinky.mixpanelBrowser.mixpanelBrowserStrings.sendBeacon
import typingsSlinky.mixpanelBrowser.mixpanelBrowserStrings.xhr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var transport: js.UndefOr[xhr | sendBeacon] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(transport: xhr | sendBeacon = null): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

