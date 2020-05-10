package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLengthShow extends js.Object {
  /**
    * The length of pointer which could be absolute value and also
    * the percentage relative to
    * [radius](https://echarts.apache.org/en/option.html#series-gauge.radius)
    * .
    *
    *
    * @default
    * '80%'
    * @see https://echarts.apache.org/en/option.html#series-gauge.pointer.length
    */
  var length: js.UndefOr[Double | String] = js.native
  /**
    * Whether to show the pointer.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.pointer.show
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * The width of pointer.
    *
    *
    * @default
    * 8
    * @see https://echarts.apache.org/en/option.html#series-gauge.pointer.width
    */
  var width: js.UndefOr[Double] = js.native
}

object AnonLengthShow {
  @scala.inline
  def apply(): AnonLengthShow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLengthShow]
  }
  @scala.inline
  implicit class AnonLengthShowOps[Self <: AnonLengthShow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double | String): Self = {
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

