package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceRequest extends js.Object {
  /**
    * Required. The instance to create.  The name may be omitted, but if
    * specified must be `<parent>/instances/<instance_id>`.
    */
  var instance: js.UndefOr[Instance] = js.native
  /**
    * Required. The ID of the instance to create.  Valid identifiers are of the
    * form `a-z&#42;[a-z0-9]` and must be between 6 and 30 characters in
    * length.
    */
  var instanceId: js.UndefOr[String] = js.native
}

object CreateInstanceRequest {
  @scala.inline
  def apply(): CreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceRequest]
  }
  @scala.inline
  implicit class CreateInstanceRequestOps[Self <: CreateInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: Instance): Self = {
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
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
  }
  
}

