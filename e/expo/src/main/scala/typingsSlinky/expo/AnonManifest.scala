package typingsSlinky.expo

import typingsSlinky.expo.expoBooleans.`true`
import typingsSlinky.expo.updatesMod.Manifest
import typingsSlinky.expo.updatesMod.UpdateCheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonManifest extends UpdateCheckResult {
  var isAvailable: `true`
  var manifest: Manifest
}

object AnonManifest {
  @scala.inline
  def apply(isAvailable: `true`, manifest: Manifest): AnonManifest = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonManifest]
  }
}

