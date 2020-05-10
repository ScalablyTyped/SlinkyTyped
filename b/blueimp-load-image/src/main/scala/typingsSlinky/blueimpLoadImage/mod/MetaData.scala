package typingsSlinky.blueimpLoadImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaData extends ImageHead {
  var exif: js.UndefOr[Exif] = js.native
  var iptc: js.UndefOr[Iptc] = js.native
  var originalHeight: js.UndefOr[Double] = js.native
  var originalWidth: js.UndefOr[Double] = js.native
}

object MetaData {
  @scala.inline
  def apply(): MetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaData]
  }
  @scala.inline
  implicit class MetaDataOps[Self <: MetaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExif(value: Exif): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExif: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exif")(js.undefined)
        ret
    }
    @scala.inline
    def withIptc(value: Iptc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iptc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIptc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iptc")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalWidth")(js.undefined)
        ret
    }
  }
  
}

