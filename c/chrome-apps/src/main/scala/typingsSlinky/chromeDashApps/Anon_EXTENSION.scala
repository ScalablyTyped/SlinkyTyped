package typingsSlinky.chromeDashApps

import typingsSlinky.chromeDashApps.chromeDashAppsStrings.extension
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.hosted_app
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.legacy_packaged_app
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.packaged_app
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EXTENSION extends js.Object {
  var EXTENSION: extension
  var HOSTED_APP: hosted_app
  var LEGACY_PACKAGED_APP: legacy_packaged_app
  var PACKAGED_APP: packaged_app
  var THEME: theme
}

object Anon_EXTENSION {
  @scala.inline
  def apply(
    EXTENSION: extension,
    HOSTED_APP: hosted_app,
    LEGACY_PACKAGED_APP: legacy_packaged_app,
    PACKAGED_APP: packaged_app,
    THEME: theme
  ): Anon_EXTENSION = {
    val __obj = js.Dynamic.literal(EXTENSION = EXTENSION.asInstanceOf[js.Any], HOSTED_APP = HOSTED_APP.asInstanceOf[js.Any], LEGACY_PACKAGED_APP = LEGACY_PACKAGED_APP.asInstanceOf[js.Any], PACKAGED_APP = PACKAGED_APP.asInstanceOf[js.Any], THEME = THEME.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EXTENSION]
  }
}

