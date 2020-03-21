package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.extension
import typingsSlinky.chromeApps.chromeAppsStrings.hosted_app
import typingsSlinky.chromeApps.chromeAppsStrings.legacy_packaged_app
import typingsSlinky.chromeApps.chromeAppsStrings.packaged_app
import typingsSlinky.chromeApps.chromeAppsStrings.theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEXTENSION extends js.Object {
  var EXTENSION: extension
  var HOSTED_APP: hosted_app
  var LEGACY_PACKAGED_APP: legacy_packaged_app
  var PACKAGED_APP: packaged_app
  var THEME: theme
}

object AnonEXTENSION {
  @scala.inline
  def apply(
    EXTENSION: extension,
    HOSTED_APP: hosted_app,
    LEGACY_PACKAGED_APP: legacy_packaged_app,
    PACKAGED_APP: packaged_app,
    THEME: theme
  ): AnonEXTENSION = {
    val __obj = js.Dynamic.literal(EXTENSION = EXTENSION.asInstanceOf[js.Any], HOSTED_APP = HOSTED_APP.asInstanceOf[js.Any], LEGACY_PACKAGED_APP = LEGACY_PACKAGED_APP.asInstanceOf[js.Any], PACKAGED_APP = PACKAGED_APP.asInstanceOf[js.Any], THEME = THEME.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEXTENSION]
  }
}

