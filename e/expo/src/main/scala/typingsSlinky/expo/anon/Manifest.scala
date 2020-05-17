package typingsSlinky.expo.anon

import typingsSlinky.expo.expoBooleans.`true`
import typingsSlinky.expo.updatesMod.UpdateCheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Manifest extends UpdateCheckResult {
  var isAvailable: `true` = js.native
  var manifest: typingsSlinky.expo.updatesMod.Manifest = js.native
}

object Manifest {
  @scala.inline
  def apply(isAvailable: `true`, manifest: typingsSlinky.expo.updatesMod.Manifest): Manifest = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  @scala.inline
  implicit class ManifestOps[Self <: Manifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAvailable(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifest(value: typingsSlinky.expo.updatesMod.Manifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

