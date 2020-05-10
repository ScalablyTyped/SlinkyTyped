package typingsSlinky.instagramPrivateApi.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedPost extends js.Object {
  var ig_sig_key_version: String = js.native
  var signed_body: String = js.native
}

object SignedPost {
  @scala.inline
  def apply(ig_sig_key_version: String, signed_body: String): SignedPost = {
    val __obj = js.Dynamic.literal(ig_sig_key_version = ig_sig_key_version.asInstanceOf[js.Any], signed_body = signed_body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedPost]
  }
  @scala.inline
  implicit class SignedPostOps[Self <: SignedPost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIg_sig_key_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ig_sig_key_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigned_body(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed_body")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

