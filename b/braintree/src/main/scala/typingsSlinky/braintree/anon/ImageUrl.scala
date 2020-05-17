package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageUrl extends js.Object {
  var imageUrl: String = js.native
  var sourceDescription: String = js.native
  var token: String = js.native
  var username: String = js.native
  var venmoUserId: String = js.native
}

object ImageUrl {
  @scala.inline
  def apply(imageUrl: String, sourceDescription: String, token: String, username: String, venmoUserId: String): ImageUrl = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], venmoUserId = venmoUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl]
  }
  @scala.inline
  implicit class ImageUrlOps[Self <: ImageUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVenmoUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("venmoUserId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

