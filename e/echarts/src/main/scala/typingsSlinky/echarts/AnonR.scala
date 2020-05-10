package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonR extends js.Object {
  /**
    * The height of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.height
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Specify border radius of the rectangular here.
    * Generally, `r` should be `[topLeftRadius, topRightRadius,
    * BottomRightRadius, bottomLeftRadius]`, where each
    * item is a number.
    *
    * Abbreviation is enabled, for example:
    *
    * + `r`: `1` means `[1, 1, 1, 1]`
    * + `r`: `[1]` means `[1, 1, 1, 1]`
    * + `r`: `[1, 2]` means `[1, 2, 1, 2]`
    * + `r`: `[1, 2, 3]` means `[1, 2, 3, 2]`
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.r
    */
  var r: js.UndefOr[js.Array[_]] = js.native
  /**
    * The width of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.width
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.x
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.y
    */
  var y: js.UndefOr[Double] = js.native
}

object AnonR {
  @scala.inline
  def apply(): AnonR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonR]
  }
  @scala.inline
  implicit class AnonROps[Self <: AnonR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withR(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(js.undefined)
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
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

