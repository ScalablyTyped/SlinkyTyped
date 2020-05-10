package typingsSlinky.i18nextSprintfPostprocessor

import typingsSlinky.i18nextSprintfPostprocessor.i18nextSprintfPostprocessorStrings.sprintf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPostProcess extends js.Object {
  var postProcess: sprintf = js.native
  var sprintf: js.Array[String] = js.native
}

object AnonPostProcess {
  @scala.inline
  def apply(postProcess: sprintf, sprintf: js.Array[String]): AnonPostProcess = {
    val __obj = js.Dynamic.literal(postProcess = postProcess.asInstanceOf[js.Any], sprintf = sprintf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPostProcess]
  }
  @scala.inline
  implicit class AnonPostProcessOps[Self <: AnonPostProcess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostProcess(value: sprintf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSprintf(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprintf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

