package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkGroupOutput extends js.Object {
  /**
    * Information about the workgroup.
    */
  var WorkGroup: js.UndefOr[typingsSlinky.awsSdk.athenaMod.WorkGroup] = js.native
}

object GetWorkGroupOutput {
  @scala.inline
  def apply(): GetWorkGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkGroupOutput]
  }
  @scala.inline
  implicit class GetWorkGroupOutputOps[Self <: GetWorkGroupOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkGroup(value: WorkGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroup")(js.undefined)
        ret
    }
  }
  
}

