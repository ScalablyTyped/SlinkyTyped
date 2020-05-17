package typingsSlinky.auth0.anon

import typingsSlinky.auth0.auth0Strings.HS256
import typingsSlinky.auth0.auth0Strings.RS256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alg extends js.Object {
  // The algorithm used to sign the JsonWebToken
  var alg: js.UndefOr[HS256 | RS256] = js.native
  // The amount of time (in seconds) that the token will be valid after being issued
  var lifetime_in_seconds: js.UndefOr[Double] = js.native
  var scopes: js.UndefOr[js.Object] = js.native
}

object Alg {
  @scala.inline
  def apply(): Alg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alg]
  }
  @scala.inline
  implicit class AlgOps[Self <: Alg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlg(value: HS256 | RS256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(js.undefined)
        ret
    }
    @scala.inline
    def withLifetime_in_seconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetime_in_seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifetime_in_seconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetime_in_seconds")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
  }
  
}

