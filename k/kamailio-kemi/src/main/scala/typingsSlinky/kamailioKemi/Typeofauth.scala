package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofauth extends js.Object {
  def auth_challenge(realm: String, flags: Double): Double = js.native
  def consume_credentials(): Double = js.native
  def has_credentials(srealm: String): Double = js.native
  def pv_auth_check(srealm: String, spasswd: String, vflags: Double, vchecks: Double): Double = js.native
}

object Typeofauth {
  @scala.inline
  def apply(
    auth_challenge: (String, Double) => Double,
    consume_credentials: () => Double,
    has_credentials: String => Double,
    pv_auth_check: (String, String, Double, Double) => Double
  ): Typeofauth = {
    val __obj = js.Dynamic.literal(auth_challenge = js.Any.fromFunction2(auth_challenge), consume_credentials = js.Any.fromFunction0(consume_credentials), has_credentials = js.Any.fromFunction1(has_credentials), pv_auth_check = js.Any.fromFunction4(pv_auth_check))
    __obj.asInstanceOf[Typeofauth]
  }
  @scala.inline
  implicit class TypeofauthOps[Self <: Typeofauth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth_challenge(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_challenge")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConsume_credentials(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consume_credentials")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHas_credentials(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_credentials")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPv_auth_check(value: (String, String, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pv_auth_check")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

