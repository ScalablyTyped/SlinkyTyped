package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreInfo extends js.Object {
  var options: StringDictionary[js.Any] = js.native
  var taskExecutionMode: TaskExecutionMode = js.native
}

object RestoreInfo {
  @scala.inline
  def apply(options: StringDictionary[js.Any], taskExecutionMode: TaskExecutionMode): RestoreInfo = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], taskExecutionMode = taskExecutionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreInfo]
  }
  @scala.inline
  implicit class RestoreInfoOps[Self <: RestoreInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskExecutionMode(value: TaskExecutionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskExecutionMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

