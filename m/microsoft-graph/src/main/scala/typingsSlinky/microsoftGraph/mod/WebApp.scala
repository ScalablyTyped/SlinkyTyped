package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebApp extends MobileApp {
  // The web app URL.
  var appUrl: js.UndefOr[String] = js.native
  // Whether or not to use managed browser. This property is only applicable for Android and IOS.
  var useManagedBrowser: js.UndefOr[Boolean] = js.native
}

object WebApp {
  @scala.inline
  def apply(): WebApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebApp]
  }
  @scala.inline
  implicit class WebAppOps[Self <: WebApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUseManagedBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useManagedBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseManagedBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useManagedBrowser")(js.undefined)
        ret
    }
  }
  
}

