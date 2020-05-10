package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndeploySystemInstanceResponse extends js.Object {
  /**
    * An object that contains summary information about the system instance that was removed from its target.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.native
}

object UndeploySystemInstanceResponse {
  @scala.inline
  def apply(): UndeploySystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeploySystemInstanceResponse]
  }
  @scala.inline
  implicit class UndeploySystemInstanceResponseOps[Self <: UndeploySystemInstanceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSummary(value: SystemInstanceSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
  }
  
}

