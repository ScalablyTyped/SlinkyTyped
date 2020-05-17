package typingsSlinky.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPatternRestricted
  - typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPatternUnestricted
  - typingsSlinky.firefoxWebextBrowser.browser.manifest._MatchPattern
*/
trait MatchPattern
  extends OptionalPermissionOrOrigin
     with PermissionOrOrigin

object MatchPattern {
  @scala.inline
  implicit def apply(value: MatchPatternRestricted | MatchPatternUnestricted): MatchPattern = value.asInstanceOf[MatchPattern]
  @scala.inline
  implicit def apply(value: _MatchPattern): MatchPattern = value.asInstanceOf[MatchPattern]
}

