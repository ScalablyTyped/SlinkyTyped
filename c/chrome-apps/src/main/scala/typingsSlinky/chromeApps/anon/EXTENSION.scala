package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.extension
import typingsSlinky.chromeApps.chromeAppsStrings.hosted_app
import typingsSlinky.chromeApps.chromeAppsStrings.legacy_packaged_app
import typingsSlinky.chromeApps.chromeAppsStrings.packaged_app
import typingsSlinky.chromeApps.chromeAppsStrings.theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EXTENSION extends js.Object {
  var EXTENSION: extension = js.native
  var HOSTED_APP: hosted_app = js.native
  var LEGACY_PACKAGED_APP: legacy_packaged_app = js.native
  var PACKAGED_APP: packaged_app = js.native
  var THEME: theme = js.native
}

object EXTENSION {
  @scala.inline
  def apply(
    EXTENSION: extension,
    HOSTED_APP: hosted_app,
    LEGACY_PACKAGED_APP: legacy_packaged_app,
    PACKAGED_APP: packaged_app,
    THEME: theme
  ): EXTENSION = {
    val __obj = js.Dynamic.literal(EXTENSION = EXTENSION.asInstanceOf[js.Any], HOSTED_APP = HOSTED_APP.asInstanceOf[js.Any], LEGACY_PACKAGED_APP = LEGACY_PACKAGED_APP.asInstanceOf[js.Any], PACKAGED_APP = PACKAGED_APP.asInstanceOf[js.Any], THEME = THEME.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTENSION]
  }
  @scala.inline
  implicit class EXTENSIONOps[Self <: EXTENSION] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEXTENSION(value: extension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXTENSION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHOSTED_APP(value: hosted_app): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOSTED_APP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEGACY_PACKAGED_APP(value: legacy_packaged_app): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEGACY_PACKAGED_APP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPACKAGED_APP(value: packaged_app): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PACKAGED_APP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHEME(value: theme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THEME")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

