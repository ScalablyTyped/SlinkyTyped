package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolExitCode extends js.Object {
  /**
    * Tool execution exit code. A value of 0 means that the execution was successful.
    *
    * - In response: always set - In create/update request: always set
    */
  var number: js.UndefOr[Double] = js.native
}

object ToolExitCode {
  @scala.inline
  def apply(): ToolExitCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolExitCode]
  }
  @scala.inline
  implicit class ToolExitCodeOps[Self <: ToolExitCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
  }
  
}

