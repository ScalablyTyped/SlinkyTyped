package typingsSlinky.expoWebBrowser.webBrowserTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTabsBrowsersResults extends js.Object {
  var browserPackages: js.Array[String] = js.native
  var defaultBrowserPackage: js.UndefOr[String] = js.native
  var preferredBrowserPackage: js.UndefOr[String] = js.native
  var servicePackages: js.Array[String] = js.native
}

object CustomTabsBrowsersResults {
  @scala.inline
  def apply(browserPackages: js.Array[String], servicePackages: js.Array[String]): CustomTabsBrowsersResults = {
    val __obj = js.Dynamic.literal(browserPackages = browserPackages.asInstanceOf[js.Any], servicePackages = servicePackages.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTabsBrowsersResults]
  }
  @scala.inline
  implicit class CustomTabsBrowsersResultsOps[Self <: CustomTabsBrowsersResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserPackages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserPackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServicePackages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultBrowserPackage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBrowserPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBrowserPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBrowserPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredBrowserPackage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredBrowserPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredBrowserPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredBrowserPackage")(js.undefined)
        ret
    }
  }
  
}

