package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofauthRadius extends js.Object {
  def proxy_authorize(srealm: String): Double = js.native
  def proxy_authorize_user(srealm: String, suser: String): Double = js.native
  def www_authorize(srealm: String): Double = js.native
  def www_authorize_user(srealm: String, suser: String): Double = js.native
}

object TypeofauthRadius {
  @scala.inline
  def apply(
    proxy_authorize: String => Double,
    proxy_authorize_user: (String, String) => Double,
    www_authorize: String => Double,
    www_authorize_user: (String, String) => Double
  ): TypeofauthRadius = {
    val __obj = js.Dynamic.literal(proxy_authorize = js.Any.fromFunction1(proxy_authorize), proxy_authorize_user = js.Any.fromFunction2(proxy_authorize_user), www_authorize = js.Any.fromFunction1(www_authorize), www_authorize_user = js.Any.fromFunction2(www_authorize_user))
    __obj.asInstanceOf[TypeofauthRadius]
  }
  @scala.inline
  implicit class TypeofauthRadiusOps[Self <: TypeofauthRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProxy_authorize(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy_authorize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProxy_authorize_user(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy_authorize_user")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWww_authorize(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("www_authorize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWww_authorize_user(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("www_authorize_user")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

