package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.CAROUSEL
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.PHOTO
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.VIDEO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMediaId extends js.Object {
  var mediaId: String = js.native
  var mediaType: js.UndefOr[PHOTO | VIDEO | CAROUSEL] = js.native
}

object AnonMediaId {
  @scala.inline
  def apply(mediaId: String): AnonMediaId = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMediaId]
  }
  @scala.inline
  implicit class AnonMediaIdOps[Self <: AnonMediaId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaType(value: PHOTO | VIDEO | CAROUSEL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
  }
  
}

