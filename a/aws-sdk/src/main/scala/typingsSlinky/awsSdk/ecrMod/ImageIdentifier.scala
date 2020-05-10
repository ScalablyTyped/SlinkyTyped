package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageIdentifier extends js.Object {
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.native
  /**
    * The tag used for the image.
    */
  var imageTag: js.UndefOr[ImageTag] = js.native
}

object ImageIdentifier {
  @scala.inline
  def apply(): ImageIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageIdentifier]
  }
  @scala.inline
  implicit class ImageIdentifierOps[Self <: ImageIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageDigest(value: ImageDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTag(value: ImageTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTag")(js.undefined)
        ret
    }
  }
  
}

