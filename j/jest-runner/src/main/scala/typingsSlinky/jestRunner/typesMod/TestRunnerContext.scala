package typingsSlinky.jestRunner.typesMod

import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRunnerContext extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.native
}

object TestRunnerContext {
  @scala.inline
  def apply(): TestRunnerContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRunnerContext]
  }
  @scala.inline
  implicit class TestRunnerContextOps[Self <: TestRunnerContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

