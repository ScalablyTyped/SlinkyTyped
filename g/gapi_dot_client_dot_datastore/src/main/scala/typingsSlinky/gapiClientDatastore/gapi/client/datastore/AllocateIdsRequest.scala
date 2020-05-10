package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateIdsRequest extends js.Object {
  /**
    * A list of keys with incomplete key paths for which to allocate IDs.
    * No key may be reserved/read-only.
    */
  var keys: js.UndefOr[js.Array[Key]] = js.native
}

object AllocateIdsRequest {
  @scala.inline
  def apply(): AllocateIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateIdsRequest]
  }
  @scala.inline
  implicit class AllocateIdsRequestOps[Self <: AllocateIdsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeys(value: js.Array[Key]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
  }
  
}

