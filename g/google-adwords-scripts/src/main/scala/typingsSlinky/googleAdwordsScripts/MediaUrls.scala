package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaUrls extends js.Object {
  def getFullMediaUrl(): String = js.native
  def getPreviewMediaUrl(): String = js.native
  def getShrunkenMediaUrl(): String = js.native
  def getVideoThumbnailMediaUrl(): String = js.native
}

object MediaUrls {
  @scala.inline
  def apply(
    getFullMediaUrl: () => String,
    getPreviewMediaUrl: () => String,
    getShrunkenMediaUrl: () => String,
    getVideoThumbnailMediaUrl: () => String
  ): MediaUrls = {
    val __obj = js.Dynamic.literal(getFullMediaUrl = js.Any.fromFunction0(getFullMediaUrl), getPreviewMediaUrl = js.Any.fromFunction0(getPreviewMediaUrl), getShrunkenMediaUrl = js.Any.fromFunction0(getShrunkenMediaUrl), getVideoThumbnailMediaUrl = js.Any.fromFunction0(getVideoThumbnailMediaUrl))
    __obj.asInstanceOf[MediaUrls]
  }
  @scala.inline
  implicit class MediaUrlsOps[Self <: MediaUrls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFullMediaUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFullMediaUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPreviewMediaUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreviewMediaUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetShrunkenMediaUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShrunkenMediaUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVideoThumbnailMediaUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVideoThumbnailMediaUrl")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

