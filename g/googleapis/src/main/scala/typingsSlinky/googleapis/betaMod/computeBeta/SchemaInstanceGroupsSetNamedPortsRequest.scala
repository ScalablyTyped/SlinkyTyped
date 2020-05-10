package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupsSetNamedPortsRequest extends js.Object {
  /**
    * The fingerprint of the named ports information for this instance group.
    * Use this optional property to prevent conflicts when multiple users
    * change the named ports settings concurrently. Obtain the fingerprint with
    * the instanceGroups.get method. Then, include the fingerprint in your
    * request to ensure that you do not overwrite changes that were applied
    * from another concurrent request. A request with an incorrect fingerprint
    * will fail with error 412 conditionNotMet.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The list of named ports to set for this instance group.
    */
  var namedPorts: js.UndefOr[js.Array[SchemaNamedPort]] = js.native
}

object SchemaInstanceGroupsSetNamedPortsRequest {
  @scala.inline
  def apply(): SchemaInstanceGroupsSetNamedPortsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupsSetNamedPortsRequest]
  }
  @scala.inline
  implicit class SchemaInstanceGroupsSetNamedPortsRequestOps[Self <: SchemaInstanceGroupsSetNamedPortsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedPorts(value: js.Array[SchemaNamedPort]): Self = {
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
  }
  
}

