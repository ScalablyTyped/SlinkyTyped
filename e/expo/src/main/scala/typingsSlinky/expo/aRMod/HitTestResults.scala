package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitTestResults extends js.Object {
  var hitTest: js.Array[HitTest]
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHitTestVarargs(value: HitTest*): Self = this.set("hitTest", js.Array(value :_*))
    @scala.inline
    def setHitTest(value: js.Array[HitTest]): Self = this.set("hitTest", value.asInstanceOf[js.Any])
  }
  
}

