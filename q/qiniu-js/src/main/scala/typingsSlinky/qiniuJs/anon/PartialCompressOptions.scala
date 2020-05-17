package typingsSlinky.qiniuJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<qiniu-js.qiniu-js.CompressOptions> */
@js.native
trait PartialCompressOptions extends js.Object {
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidh: js.UndefOr[Double] = js.native
  var noCompressIfLarger: js.UndefOr[Boolean] = js.native
  var quality: js.UndefOr[Double] = js.native
}

object PartialCompressOptions {
  @scala.inline
  def apply(): PartialCompressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCompressOptions]
  }
  @scala.inline
  implicit class PartialCompressOptionsOps[Self <: PartialCompressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidh")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCompressIfLarger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCompressIfLarger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCompressIfLarger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCompressIfLarger")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
  }
  
}

