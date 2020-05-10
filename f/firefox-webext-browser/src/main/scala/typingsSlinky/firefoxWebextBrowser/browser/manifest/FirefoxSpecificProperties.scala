package typingsSlinky.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirefoxSpecificProperties extends js.Object {
  var id: js.UndefOr[ExtensionID] = js.native
  var strict_max_version: js.UndefOr[String] = js.native
  var strict_min_version: js.UndefOr[String] = js.native
  var update_url: js.UndefOr[String] = js.native
}

object FirefoxSpecificProperties {
  @scala.inline
  def apply(): FirefoxSpecificProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirefoxSpecificProperties]
  }
  @scala.inline
  implicit class FirefoxSpecificPropertiesOps[Self <: FirefoxSpecificProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: ExtensionID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict_max_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict_max_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict_max_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict_max_version")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict_min_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict_min_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict_min_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict_min_version")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_url")(js.undefined)
        ret
    }
  }
  
}

