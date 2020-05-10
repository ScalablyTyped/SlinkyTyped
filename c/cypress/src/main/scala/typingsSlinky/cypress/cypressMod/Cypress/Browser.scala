package typingsSlinky.cypress.cypressMod.Cypress

import typingsSlinky.cypress.cypressStrings.Canary
import typingsSlinky.cypress.cypressStrings.Chrome
import typingsSlinky.cypress.cypressStrings.Chromium
import typingsSlinky.cypress.cypressStrings.Electron
import typingsSlinky.cypress.cypressStrings.FireFox
import typingsSlinky.cypress.cypressStrings.canary_
import typingsSlinky.cypress.cypressStrings.chrome_
import typingsSlinky.cypress.cypressStrings.chromium_
import typingsSlinky.cypress.cypressStrings.electron_
import typingsSlinky.cypress.cypressStrings.firefox_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a browser Cypress can control
  */
@js.native
trait Browser extends js.Object {
  var displayName: Electron | Chrome | Canary | Chromium | FireFox = js.native
  var isHeaded: Boolean = js.native
  var isHeadless: Boolean = js.native
  var majorVersion: Double = js.native
  var name: electron_ | chrome_ | canary_ | chromium_ | firefox_ = js.native
  var path: String = js.native
  var version: String = js.native
}

object Browser {
  @scala.inline
  def apply(
    displayName: Electron | Chrome | Canary | Chromium | FireFox,
    isHeaded: Boolean,
    isHeadless: Boolean,
    majorVersion: Double,
    name: electron_ | chrome_ | canary_ | chromium_ | firefox_,
    path: String,
    version: String
  ): Browser = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isHeaded = isHeaded.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  @scala.inline
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: Electron | Chrome | Canary | Chromium | FireFox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHeaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeadless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: electron_ | chrome_ | canary_ | chromium_ | firefox_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
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

