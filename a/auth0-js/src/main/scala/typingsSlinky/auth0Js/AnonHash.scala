package typingsSlinky.auth0Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHash extends js.Object {
  /**
    * makes parseHash perform or skip `id_token` verification.
    * We **strongly** recommend validating the `id_token` yourself if you disable the verification.
    */
  var _idTokenVerification: js.UndefOr[String] = js.native
  /**
    * the url hash.
    * @default window.location.hash
    */
  var hash: String = js.native
  /** value originally sent in `nonce` parameter to {@link authorize} to prevent replay attacks */
  var nonce: js.UndefOr[String] = js.native
  /** value originally sent in `state` parameter to {@link authorize} to mitigate XSRF */
  var state: js.UndefOr[String] = js.native
}

object AnonHash {
  @scala.inline
  def apply(hash: String): AnonHash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHash]
  }
  @scala.inline
  implicit class AnonHashOps[Self <: AnonHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_idTokenVerification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_idTokenVerification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_idTokenVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_idTokenVerification")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

