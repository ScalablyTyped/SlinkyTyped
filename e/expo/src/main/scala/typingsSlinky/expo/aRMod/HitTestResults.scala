package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HitTestResults extends js.Object {
  var hitTest: js.Array[HitTest] = js.native
}

object HitTestResults {
  @scala.inline
  def apply(hitTest: js.Array[HitTest]): HitTestResults = {
    val __obj = js.Dynamic.literal(hitTest = hitTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitTestResults]
  }
  @scala.inline
  implicit class HitTestResultsOps[Self <: HitTestResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHitTest(value: js.Array[HitTest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitTest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

