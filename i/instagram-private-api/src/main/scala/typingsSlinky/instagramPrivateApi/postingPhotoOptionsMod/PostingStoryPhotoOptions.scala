package typingsSlinky.instagramPrivateApi.postingPhotoOptionsMod

import typingsSlinky.instagramPrivateApi.postingOptionsMod.PostingStoryOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostingStoryPhotoOptions extends PostingStoryOptions {
  var file: Buffer = js.native
}

object PostingStoryPhotoOptions {
  @scala.inline
  def apply(file: Buffer): PostingStoryPhotoOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingStoryPhotoOptions]
  }
  @scala.inline
  implicit class PostingStoryPhotoOptionsOps[Self <: PostingStoryPhotoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

