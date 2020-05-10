package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupRequest extends js.Object {
  /** Keys of entities to look up. */
  var keys: js.UndefOr[js.Array[Key]] = js.native
  /** The options for this lookup request. */
  var readOptions: js.UndefOr[ReadOptions] = js.native
}

object LookupRequest {
  @scala.inline
  def apply(): LookupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupRequest]
  }
  @scala.inline
  implicit class LookupRequestOps[Self <: LookupRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withReadOptions(value: ReadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOptions")(js.undefined)
        ret
    }
  }
  
}

