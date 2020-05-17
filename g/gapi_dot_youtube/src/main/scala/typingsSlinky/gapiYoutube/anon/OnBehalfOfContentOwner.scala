package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBehalfOfContentOwner extends js.Object {
  /**
    * HTTP Request Body
    */
  var RequestBody: String = js.native
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: String = js.native
}

object OnBehalfOfContentOwner {
  @scala.inline
  def apply(RequestBody: String, onBehalfOfContentOwner: String): OnBehalfOfContentOwner = {
    val __obj = js.Dynamic.literal(RequestBody = RequestBody.asInstanceOf[js.Any], onBehalfOfContentOwner = onBehalfOfContentOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBehalfOfContentOwner]
  }
  @scala.inline
  implicit class OnBehalfOfContentOwnerOps[Self <: OnBehalfOfContentOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBehalfOfContentOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfContentOwner")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

