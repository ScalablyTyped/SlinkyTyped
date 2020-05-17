package typingsSlinky.expo.anon

import typingsSlinky.expo.expoStrings.downloadFinished
import typingsSlinky.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestType extends UpdateEvent {
  var manifest: typingsSlinky.expo.updatesMod.Manifest = js.native
  var `type`: downloadFinished = js.native
}

object ManifestType {
  @scala.inline
  def apply(manifest: typingsSlinky.expo.updatesMod.Manifest, `type`: downloadFinished): ManifestType = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestType]
  }
  @scala.inline
  implicit class ManifestTypeOps[Self <: ManifestType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifest(value: typingsSlinky.expo.updatesMod.Manifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: downloadFinished): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

