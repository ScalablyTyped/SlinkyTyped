package typingsSlinky.jestRunner.typesMod

import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRunnerSerializedContext extends js.Object {
  var changedFiles: js.UndefOr[js.Array[Path]] = js.native
}

object TestRunnerSerializedContext {
  @scala.inline
  def apply(): TestRunnerSerializedContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRunnerSerializedContext]
  }
  @scala.inline
  implicit class TestRunnerSerializedContextOps[Self <: TestRunnerSerializedContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedFiles(value: js.Array[Path]): Self = {
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

