package typingsSlinky.ionicCliFramework.tasksMod

import typingsSlinky.ionicCliFramework.anon.PartialTaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskChainOptions extends js.Object {
  val taskOptions: js.UndefOr[PartialTaskOptions] = js.native
}

object TaskChainOptions {
  @scala.inline
  def apply(): TaskChainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskChainOptions]
  }
  @scala.inline
  implicit class TaskChainOptionsOps[Self <: TaskChainOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskOptions(value: PartialTaskOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskOptions")(js.undefined)
        ret
    }
  }
  
}

