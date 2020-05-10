package typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typingsSlinky.instagramPrivateApi.AnonWebUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryCta extends js.Object {
  var links: js.Array[AnonWebUri] = js.native
}

object StoryCta {
  @scala.inline
  def apply(links: js.Array[AnonWebUri]): StoryCta = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryCta]
  }
  @scala.inline
  implicit class StoryCtaOps[Self <: StoryCta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinks(value: js.Array[AnonWebUri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

