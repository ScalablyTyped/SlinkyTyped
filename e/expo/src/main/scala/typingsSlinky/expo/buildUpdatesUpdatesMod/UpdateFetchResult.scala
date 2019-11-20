package typingsSlinky.expo.buildUpdatesUpdatesMod

import typingsSlinky.expo.expoNumbers.`false`
import typingsSlinky.expo.expoNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFetchResult extends js.Object {
  var isNew: js.UndefOr[`false` with `true`] = js.undefined
  var manifest: js.UndefOr[Manifest] = js.undefined
}

object UpdateFetchResult {
  @scala.inline
  def apply(isNew: `false` with `true` = null, manifest: Manifest = null): UpdateFetchResult = {
    val __obj = js.Dynamic.literal()
    if (isNew != null) __obj.updateDynamic("isNew")(isNew.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFetchResult]
  }
}

