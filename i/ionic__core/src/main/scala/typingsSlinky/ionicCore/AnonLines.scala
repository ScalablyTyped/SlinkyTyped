package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLines extends js.Object {
  var dur: Double = js.native
  var lines: Double = js.native
  def fn(dur: Double, index: Double, total: Double): AnonY1 = js.native
}

object AnonLines {
  @scala.inline
  def apply(dur: Double, fn: (Double, Double, Double) => AnonY1, lines: Double): AnonLines = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn), lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLines]
  }
  @scala.inline
  implicit class AnonLinesOps[Self <: AnonLines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFn(value: (Double, Double, Double) => AnonY1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

