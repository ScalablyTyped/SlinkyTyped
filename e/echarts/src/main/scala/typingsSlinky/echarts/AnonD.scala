package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonD extends js.Object {
  /**
    * Alias of
    * [pathData](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.pathData)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.d
    */
  var d: js.UndefOr[String] = js.native
  /**
    * The height of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.height
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * If
    * [width](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.width)
    * ,
    * [height](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.height)
    * ,
    * [x](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.x)
    * and
    * [y](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.y)
    * specified, `pathData` will be transformed to fit
    * the defined rect.
    *
    * `layout` can be used to specify the transform strategy.
    *
    * Optional value:
    *
    * + `'center'`: Keep aspect ratio, put the path in
    * the center of the rect, expand as far as possible
    * but never overflow.
    * + `'cover'`: Transform the path according to the
    * aspect ratio of the rect, fill the rect and do not
    * overflow.
    *
    *
    * @default
    * "center"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.layout
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * .
    *
    * For example, `'M0,0 L0,-20 L30,-20 C42,-20 38,-1
    * 50,-1 L70,-1 L70,0 Z'`。
    *
    * If
    * [width](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.width)
    * ,
    * [height](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.height)
    * ,
    * [x](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.x)
    * and
    * [y](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.y)
    * specified, `pathData` will be transformed to fit
    * the defined rect.
    * If they are not specified, do not do that.
    *
    * [layout](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.layout)
    * can be used to specify the transform strategy.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.pathData
    */
  var pathData: js.UndefOr[String] = js.native
  /**
    * The width of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.width
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.x
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.y
    */
  var y: js.UndefOr[Double] = js.native
}

object AnonD {
  @scala.inline
  def apply(): AnonD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonD]
  }
  @scala.inline
  implicit class AnonDOps[Self <: AnonD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.undefined)
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
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withPathData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathData")(js.undefined)
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

