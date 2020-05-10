package typingsSlinky.ionicCliFramework.executorMod

import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.json
import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseExecutorFormatHelpOptions extends js.Object {
  var format: js.UndefOr[terminal | json] = js.native
}

object BaseExecutorFormatHelpOptions {
  @scala.inline
  def apply(): BaseExecutorFormatHelpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseExecutorFormatHelpOptions]
  }
  @scala.inline
  implicit class BaseExecutorFormatHelpOptionsOps[Self <: BaseExecutorFormatHelpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: terminal | json): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

