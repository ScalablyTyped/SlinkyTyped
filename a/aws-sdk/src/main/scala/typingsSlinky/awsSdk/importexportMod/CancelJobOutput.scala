package typingsSlinky.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelJobOutput extends js.Object {
  var Success: js.UndefOr[typingsSlinky.awsSdk.importexportMod.Success] = js.native
}

object CancelJobOutput {
  @scala.inline
  def apply(): CancelJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelJobOutput]
  }
  @scala.inline
  implicit class CancelJobOutputOps[Self <: CancelJobOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: Success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Success")(js.undefined)
        ret
    }
  }
  
}

