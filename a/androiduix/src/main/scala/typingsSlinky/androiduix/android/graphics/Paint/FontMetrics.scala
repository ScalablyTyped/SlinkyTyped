package typingsSlinky.androiduix.android.graphics.Paint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontMetrics extends js.Object {
  var ascent: Double = js.native
  var bottom: Double = js.native
  var descent: Double = js.native
  var leading: Double = js.native
  var top: Double = js.native
}

object FontMetrics {
  @scala.inline
  def apply(ascent: Double, bottom: Double, descent: Double, leading: Double, top: Double): FontMetrics = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontMetrics]
  }
  @scala.inline
  implicit class FontMetricsOps[Self <: FontMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

