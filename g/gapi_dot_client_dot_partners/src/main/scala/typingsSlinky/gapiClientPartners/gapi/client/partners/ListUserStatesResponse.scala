package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserStatesResponse extends js.Object {
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.native
  /** User's states. */
  var userStates: js.UndefOr[js.Array[String]] = js.native
}

object ListUserStatesResponse {
  @scala.inline
  def apply(): ListUserStatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserStatesResponse]
  }
  @scala.inline
  implicit class ListUserStatesResponseOps[Self <: ListUserStatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseMetadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStates")(js.undefined)
        ret
    }
  }
  
}

