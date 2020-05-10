package typingsSlinky.androiduix.android.text.TextDirectionHeuristics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDirectionAlgorithm extends js.Object {
  def checkRtl(cs: String, start: Double, count: Double): Double = js.native
}

object TextDirectionAlgorithm {
  @scala.inline
  def apply(checkRtl: (String, Double, Double) => Double): TextDirectionAlgorithm = {
    val __obj = js.Dynamic.literal(checkRtl = js.Any.fromFunction3(checkRtl))
    __obj.asInstanceOf[TextDirectionAlgorithm]
  }
  @scala.inline
  implicit class TextDirectionAlgorithmOps[Self <: TextDirectionAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckRtl(value: (String, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkRtl")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

