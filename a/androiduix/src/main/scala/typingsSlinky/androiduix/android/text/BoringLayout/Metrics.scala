package typingsSlinky.androiduix.android.text.BoringLayout

import typingsSlinky.androiduix.android.graphics.Paint.FontMetricsInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends FontMetricsInt {
  var width: Double = js.native
}

object Metrics {
  @scala.inline
  def apply(ascent: Double, bottom: Double, descent: Double, leading: Double, top: Double, width: Double): Metrics = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

