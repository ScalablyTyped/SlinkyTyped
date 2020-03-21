package typingsSlinky.expo

import typingsSlinky.expo.expoBooleans.`true`
import typingsSlinky.expo.updatesMod.Manifest
import typingsSlinky.expo.updatesMod.UpdateFetchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsNewManifest extends UpdateFetchResult {
  var isNew: `true`
  var manifest: Manifest
}

object AnonIsNewManifest {
  @scala.inline
  def apply(isNew: `true`, manifest: Manifest): AnonIsNewManifest = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsNewManifest]
  }
}

