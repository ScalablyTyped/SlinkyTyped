package typingsSlinky.gulpIstanbul

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoverageVariable extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.native
}

object AnonCoverageVariable {
  @scala.inline
  def apply(): AnonCoverageVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCoverageVariable]
  }
  @scala.inline
  implicit class AnonCoverageVariableOps[Self <: AnonCoverageVariable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverageVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageVariable")(js.undefined)
        ret
    }
  }
  
}

