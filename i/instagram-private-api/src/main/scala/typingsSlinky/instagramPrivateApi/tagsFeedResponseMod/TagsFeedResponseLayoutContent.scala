package typingsSlinky.instagramPrivateApi.tagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsFeedResponseLayoutContent extends js.Object {
  var medias: js.Array[TagsFeedResponseMediasItem] = js.native
}

object TagsFeedResponseLayoutContent {
  @scala.inline
  def apply(medias: js.Array[TagsFeedResponseMediasItem]): TagsFeedResponseLayoutContent = {
    val __obj = js.Dynamic.literal(medias = medias.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseLayoutContent]
  }
  @scala.inline
  implicit class TagsFeedResponseLayoutContentOps[Self <: TagsFeedResponseLayoutContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedias(value: js.Array[TagsFeedResponseMediasItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medias")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

