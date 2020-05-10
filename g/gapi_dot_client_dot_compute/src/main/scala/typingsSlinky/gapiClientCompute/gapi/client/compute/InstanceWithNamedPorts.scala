package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceWithNamedPorts extends js.Object {
  /** [Output Only] The URL of the instance. */
  var instance: js.UndefOr[String] = js.native
  /** [Output Only] The named ports that belong to this instance group. */
  var namedPorts: js.UndefOr[js.Array[NamedPort]] = js.native
  /** [Output Only] The status of the instance. */
  var status: js.UndefOr[String] = js.native
}

object InstanceWithNamedPorts {
  @scala.inline
  def apply(): InstanceWithNamedPorts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceWithNamedPorts]
  }
  @scala.inline
  implicit class InstanceWithNamedPortsOps[Self <: InstanceWithNamedPorts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedPorts(value: js.Array[NamedPort]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedPorts")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

