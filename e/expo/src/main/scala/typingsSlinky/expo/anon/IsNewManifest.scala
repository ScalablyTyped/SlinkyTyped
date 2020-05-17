package typingsSlinky.expo.anon

import typingsSlinky.expo.expoBooleans.`true`
import typingsSlinky.expo.updatesMod.UpdateFetchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsNewManifest extends UpdateFetchResult {
  var isNew: `true` = js.native
  var manifest: typingsSlinky.expo.updatesMod.Manifest = js.native
}

object IsNewManifest {
  @scala.inline
  def apply(isNew: `true`, manifest: typingsSlinky.expo.updatesMod.Manifest): IsNewManifest = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNewManifest]
  }
  @scala.inline
  implicit class IsNewManifestOps[Self <: IsNewManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsNew(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNew")(value.asInstanceOf[js.Any])
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

