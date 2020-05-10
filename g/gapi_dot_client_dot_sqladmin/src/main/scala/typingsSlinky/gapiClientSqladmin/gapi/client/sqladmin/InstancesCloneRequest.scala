package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesCloneRequest extends js.Object {
  /** Contains details about the clone operation. */
  var cloneContext: js.UndefOr[CloneContext] = js.native
}

object InstancesCloneRequest {
  @scala.inline
  def apply(): InstancesCloneRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesCloneRequest]
  }
  @scala.inline
  implicit class InstancesCloneRequestOps[Self <: InstancesCloneRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloneContext(value: CloneContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneContext")(js.undefined)
        ret
    }
  }
  
}

