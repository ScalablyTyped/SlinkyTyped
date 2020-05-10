package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublisherProfilesByAccountIdResponse extends js.Object {
  /** Profiles for the requested publisher */
  var profiles: js.UndefOr[js.Array[PublisherProfileApiProto]] = js.native
}

object GetPublisherProfilesByAccountIdResponse {
  @scala.inline
  def apply(): GetPublisherProfilesByAccountIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublisherProfilesByAccountIdResponse]
  }
  @scala.inline
  implicit class GetPublisherProfilesByAccountIdResponseOps[Self <: GetPublisherProfilesByAccountIdResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfiles(value: js.Array[PublisherProfileApiProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(js.undefined)
        ret
    }
  }
  
}

