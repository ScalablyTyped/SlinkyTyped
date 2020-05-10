package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateIdsResponse extends js.Object {
  /**
    * The keys specified in the request (in the same order), each with
    * its key path completed with a newly allocated ID.
    */
  var keys: js.UndefOr[js.Array[Key]] = js.native
}

object AllocateIdsResponse {
  @scala.inline
  def apply(): AllocateIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateIdsResponse]
  }
  @scala.inline
  implicit class AllocateIdsResponseOps[Self <: AllocateIdsResponse] (val x: Self) extends AnyVal {
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

