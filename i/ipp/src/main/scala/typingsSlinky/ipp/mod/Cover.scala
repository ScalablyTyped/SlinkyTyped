package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cover extends js.Object {
  var `cover-type`: js.UndefOr[CoverType] = js.native
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[js.Array[MediaInterface]] = js.native
}

object Cover {
  @scala.inline
  def apply(): Cover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cover]
  }
  @scala.inline
  implicit class CoverOps[Self <: Cover] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCover-type`(value: CoverType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCover-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover-type")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: Media): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-col`(value: js.Array[MediaInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-col")(js.undefined)
        ret
    }
  }
  
}

