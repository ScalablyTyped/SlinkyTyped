package typingsSlinky.androiduix.android.text.TextDirectionHeuristics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyStrong extends TextDirectionAlgorithm {
  var mLookForRtl: js.Any = js.native
}

object AnyStrong {
  @scala.inline
  def apply(checkRtl: (String, Double, Double) => Double, mLookForRtl: js.Any): AnyStrong = {
    val __obj = js.Dynamic.literal(checkRtl = js.Any.fromFunction3(checkRtl), mLookForRtl = mLookForRtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyStrong]
  }
  @scala.inline
  implicit class AnyStrongOps[Self <: AnyStrong] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMLookForRtl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mLookForRtl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

