package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrushType extends js.Object {
  /**
    * The brush type for ripples.
    * options: `'stroke'` and `'fill'`.
    *
    *
    * @default
    * "fill"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect.brushType
    */
  var brushType: js.UndefOr[String] = js.native
  /**
    * The period duration of animation, in seconds.
    *
    *
    * @default
    * 4
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect.period
    */
  var period: js.UndefOr[Double] = js.native
  /**
    * The maximum zooming scale of ripples in animation.
    *
    *
    * @default
    * 2.5
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect.scale
    */
  var scale: js.UndefOr[Double] = js.native
}

object AnonBrushType {
  @scala.inline
  def apply(): AnonBrushType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBrushType]
  }
  @scala.inline
  implicit class AnonBrushTypeOps[Self <: AnonBrushType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrushType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrushType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushType")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
  }
  
}

