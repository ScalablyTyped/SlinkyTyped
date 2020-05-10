package typingsSlinky.jsmediatags.xhrFileReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentRangeType extends js.Object {
  var firstBytePosition: js.UndefOr[Double] = js.native
  var instanceLength: js.UndefOr[Double] = js.native
  var lastBytePosition: js.UndefOr[Double] = js.native
}

object ContentRangeType {
  @scala.inline
  def apply(): ContentRangeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentRangeType]
  }
  @scala.inline
  implicit class ContentRangeTypeOps[Self <: ContentRangeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstBytePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBytePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstBytePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBytePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceLength")(js.undefined)
        ret
    }
    @scala.inline
    def withLastBytePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastBytePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastBytePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastBytePosition")(js.undefined)
        ret
    }
  }
  
}

