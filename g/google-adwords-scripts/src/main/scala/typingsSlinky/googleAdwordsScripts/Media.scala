package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Media extends js.Object {
  def getDimensions(): MediaDimensions = js.native
  def getFileSize(): Double = js.native
  def getId(): Double = js.native
  def getMimeType(): String = js.native
  def getName(): String = js.native
  def getReferenceId(): String = js.native
  def getSourceUrl(): String = js.native
  def getType(): MediaType = js.native
  def getUrls(): MediaUrls = js.native
  def getYouTubeVideoId(): String | Unit = js.native
}

object Media {
  @scala.inline
  def apply(
    getDimensions: () => MediaDimensions,
    getFileSize: () => Double,
    getId: () => Double,
    getMimeType: () => String,
    getName: () => String,
    getReferenceId: () => String,
    getSourceUrl: () => String,
    getType: () => MediaType,
    getUrls: () => MediaUrls,
    getYouTubeVideoId: () => String | Unit
  ): Media = {
    val __obj = js.Dynamic.literal(getDimensions = js.Any.fromFunction0(getDimensions), getFileSize = js.Any.fromFunction0(getFileSize), getId = js.Any.fromFunction0(getId), getMimeType = js.Any.fromFunction0(getMimeType), getName = js.Any.fromFunction0(getName), getReferenceId = js.Any.fromFunction0(getReferenceId), getSourceUrl = js.Any.fromFunction0(getSourceUrl), getType = js.Any.fromFunction0(getType), getUrls = js.Any.fromFunction0(getUrls), getYouTubeVideoId = js.Any.fromFunction0(getYouTubeVideoId))
    __obj.asInstanceOf[Media]
  }
  @scala.inline
  implicit class MediaOps[Self <: Media] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDimensions(value: () => MediaDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFileSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMimeType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMimeType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetReferenceId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReferenceId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSourceUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => MediaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUrls(value: () => MediaUrls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetYouTubeVideoId(value: () => String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYouTubeVideoId")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

