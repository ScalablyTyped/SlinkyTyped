package typingsSlinky.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object containing information about the current browser. */
@js.native
trait BrowserInfo extends js.Object {
  /** The browser's build ID/date, for example '20160101'. */
  var buildID: String = js.native
  /** The name of the browser, for example 'Firefox'. */
  var name: String = js.native
  /** The name of the browser vendor, for example 'Mozilla'. */
  var vendor: String = js.native
  /** The browser's version, for example '42.0.0' or '0.8.1pre'. */
  var version: String = js.native
}

object BrowserInfo {
  @scala.inline
  def apply(buildID: String, name: String, vendor: String, version: String): BrowserInfo = {
    val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserInfo]
  }
  @scala.inline
  implicit class BrowserInfoOps[Self <: BrowserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

