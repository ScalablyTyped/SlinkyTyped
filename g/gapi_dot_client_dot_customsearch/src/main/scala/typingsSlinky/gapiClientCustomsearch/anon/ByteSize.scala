package typingsSlinky.gapiClientCustomsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteSize extends js.Object {
  var byteSize: js.UndefOr[Double] = js.native
  var contextLink: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var thumbnailHeight: js.UndefOr[Double] = js.native
  var thumbnailLink: js.UndefOr[String] = js.native
  var thumbnailWidth: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ByteSize {
  @scala.inline
  def apply(): ByteSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteSize]
  }
  @scala.inline
  implicit class ByteSizeOps[Self <: ByteSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteSize")(js.undefined)
        ret
    }
    @scala.inline
    def withContextLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextLink")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailLink")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

