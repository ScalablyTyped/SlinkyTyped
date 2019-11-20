package typingsSlinky.expo.buildUpdatesUpdatesMod

import typingsSlinky.expo.expoNumbers.`false`
import typingsSlinky.expo.expoNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCheckResult extends js.Object {
  var isAvailable: js.UndefOr[`false` with `true`] = js.undefined
  var manifest: js.UndefOr[Manifest] = js.undefined
}

object UpdateCheckResult {
  @scala.inline
  def apply(isAvailable: `false` with `true` = null, manifest: Manifest = null): UpdateCheckResult = {
    val __obj = js.Dynamic.literal()
    if (isAvailable != null) __obj.updateDynamic("isAvailable")(isAvailable.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCheckResult]
  }
}

