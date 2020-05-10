package typingsSlinky.cypressImageSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCounter extends js.Object {
  var counter: Double = js.native
  var currentTestName: String = js.native
  var defaultIdentifier: String = js.native
  var testPath: String = js.native
}

object AnonCounter {
  @scala.inline
  def apply(counter: Double, currentTestName: String, defaultIdentifier: String, testPath: String): AnonCounter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], currentTestName = currentTestName.asInstanceOf[js.Any], defaultIdentifier = defaultIdentifier.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCounter]
  }
  @scala.inline
  implicit class AnonCounterOps[Self <: AnonCounter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTestName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTestName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

