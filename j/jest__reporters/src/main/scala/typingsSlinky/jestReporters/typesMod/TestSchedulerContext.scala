package typingsSlinky.jestReporters.typesMod

import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSchedulerContext extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.native
  var firstRun: Boolean = js.native
  var previousSuccess: Boolean = js.native
}

object TestSchedulerContext {
  @scala.inline
  def apply(firstRun: Boolean, previousSuccess: Boolean): TestSchedulerContext = {
    val __obj = js.Dynamic.literal(firstRun = firstRun.asInstanceOf[js.Any], previousSuccess = previousSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSchedulerContext]
  }
  @scala.inline
  implicit class TestSchedulerContextOps[Self <: TestSchedulerContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedFiles(value: Set[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedFiles")(js.undefined)
        ret
    }
  }
  
}

