package typingsSlinky.dialogflowFulfillment.anon

import typingsSlinky.dialogflowFulfillment.mod.Platforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageUrl extends js.Object {
  var imageUrl: String = js.native
  var platform: Platforms = js.native
}

object ImageUrl {
  @scala.inline
  def apply(imageUrl: String, platform: Platforms): ImageUrl = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl]
  }
  @scala.inline
  implicit class ImageUrlOps[Self <: ImageUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: Platforms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

