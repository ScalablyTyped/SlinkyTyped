package typingsSlinky.expo.anon

import typingsSlinky.expo.expoBooleans.`true`
import typingsSlinky.expo.updatesMod.UpdateCheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest extends UpdateCheckResult {
  var isAvailable: `true`
  var manifest: typingsSlinky.expo.updatesMod.Manifest
}

object Manifest {
  @scala.inline
  def apply(isAvailable: `true`, manifest: typingsSlinky.expo.updatesMod.Manifest): Manifest = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
}

