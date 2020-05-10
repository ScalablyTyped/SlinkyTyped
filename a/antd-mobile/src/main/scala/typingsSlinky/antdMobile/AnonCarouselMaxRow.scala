package typingsSlinky.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCarouselMaxRow extends js.Object {
  var carouselMaxRow: Double = js.native
  var columnNum: Double = js.native
  var data: js.Array[scala.Nothing] = js.native
  var hasLine: Boolean = js.native
  var isCarousel: Boolean = js.native
  var prefixCls: String = js.native
  var square: Boolean = js.native
}

object AnonCarouselMaxRow {
  @scala.inline
  def apply(
    carouselMaxRow: Double,
    columnNum: Double,
    data: js.Array[scala.Nothing],
    hasLine: Boolean,
    isCarousel: Boolean,
    prefixCls: String,
    square: Boolean
  ): AnonCarouselMaxRow = {
    val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hasLine = hasLine.asInstanceOf[js.Any], isCarousel = isCarousel.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], square = square.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCarouselMaxRow]
  }
  @scala.inline
  implicit class AnonCarouselMaxRowOps[Self <: AnonCarouselMaxRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarouselMaxRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselMaxRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCarousel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCarousel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSquare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("square")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

