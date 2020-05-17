package typingsSlinky.firebaseFirestore.credentialsMod

import typingsSlinky.firebaseFirestore.anon.GetAuthHeaderValueForFirstParty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gapi extends js.Object {
  var auth: GetAuthHeaderValueForFirstParty = js.native
}

object Gapi {
  @scala.inline
  def apply(auth: GetAuthHeaderValueForFirstParty): Gapi = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gapi]
  }
  @scala.inline
  implicit class GapiOps[Self <: Gapi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: GetAuthHeaderValueForFirstParty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

