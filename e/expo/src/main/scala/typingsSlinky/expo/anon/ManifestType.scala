package typingsSlinky.expo.anon

import typingsSlinky.expo.expoStrings.downloadFinished
import typingsSlinky.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestType extends UpdateEvent {
  var manifest: typingsSlinky.expo.updatesMod.Manifest
  var `type`: downloadFinished
}

object ManifestType {
  @scala.inline
  def apply(manifest: typingsSlinky.expo.updatesMod.Manifest, `type`: downloadFinished): ManifestType = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestType]
  }
}

