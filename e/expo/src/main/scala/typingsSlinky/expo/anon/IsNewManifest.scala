package typingsSlinky.expo.anon

import typingsSlinky.expo.expoBooleans.`true`
import typingsSlinky.expo.updatesMod.UpdateFetchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsNewManifest extends UpdateFetchResult {
  var isNew: `true`
  var manifest: typingsSlinky.expo.updatesMod.Manifest
}

object IsNewManifest {
  @scala.inline
  def apply(isNew: `true`, manifest: typingsSlinky.expo.updatesMod.Manifest): IsNewManifest = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNewManifest]
  }
}

