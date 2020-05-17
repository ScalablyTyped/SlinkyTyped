package typingsSlinky.gapiClientOauth2.gapi.client.oauth2

import typingsSlinky.gapiClientOauth2.anon.Alg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jwk extends js.Object {
  var keys: js.UndefOr[js.Array[Alg]] = js.native
}

object Jwk {
  @scala.inline
  def apply(): Jwk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jwk]
  }
  @scala.inline
  implicit class JwkOps[Self <: Jwk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeys(value: js.Array[Alg]): Self = {
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

