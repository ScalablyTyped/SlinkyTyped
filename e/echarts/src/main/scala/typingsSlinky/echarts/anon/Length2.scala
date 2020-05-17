package typingsSlinky.echarts.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Length2
  extends /**
  * Some properties like "normal" or "emphasis" are not documented.
  * Please, write description for them
  */
/* unknownProperty */ StringDictionary[js.Any] {
  /**
    * The style of visual guide line in emphasis status.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine.emphasis
    */
  var emphasis: js.UndefOr[Show] = js.native
  /**
    * The length of the first segment of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine.length
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The length of the second segment of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine.length2
    */
  var length2: js.UndefOr[Double] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.native
  /**
    * Whether to show the visual guide ine.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine.show
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * Whether to smooth the visual guide line.
    * It defaults to be `false` and can be set as `true` or the
    * values from 0 to 1 which indicating the smoothness.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine.smooth
    */
  var smooth: js.UndefOr[Boolean | Double] = js.native
}

object Length2 {
  @scala.inline
  def apply(): Length2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Length2]
  }
  @scala.inline
  implicit class Length2Ops[Self <: Length2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmphasis(value: Show): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmphasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withLength2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length2")(js.undefined)
        ret
    }
    @scala.inline
    def withLineStyle(value: ShadowBlur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withSmooth(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(js.undefined)
        ret
    }
  }
  
}

