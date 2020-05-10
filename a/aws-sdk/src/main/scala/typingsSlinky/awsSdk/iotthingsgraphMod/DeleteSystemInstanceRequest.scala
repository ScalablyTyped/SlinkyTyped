package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSystemInstanceRequest extends js.Object {
  /**
    * The ID of the system instance to be deleted.
    */
  var id: js.UndefOr[Urn] = js.native
}

object DeleteSystemInstanceRequest {
  @scala.inline
  def apply(): DeleteSystemInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSystemInstanceRequest]
  }
  @scala.inline
  implicit class DeleteSystemInstanceRequestOps[Self <: DeleteSystemInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Urn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

