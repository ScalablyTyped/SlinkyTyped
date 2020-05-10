package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsControlPointStyleOptions extends js.Object {
  var fill: js.UndefOr[String] = js.native
  var stroke: js.UndefOr[String] = js.native
  var `stroke-width`: js.UndefOr[Double] = js.native
}

object AnnotationsControlPointStyleOptions {
  @scala.inline
  def apply(): AnnotationsControlPointStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsControlPointStyleOptions]
  }
  @scala.inline
  implicit class AnnotationsControlPointStyleOptionsOps[Self <: AnnotationsControlPointStyleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-width`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-width")(js.undefined)
        ret
    }
  }
  
}

