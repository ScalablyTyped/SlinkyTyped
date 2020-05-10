package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofauthDb extends js.Object {
  def auth_check(srealm: String, stable: String, iflags: Double): Double = js.native
  def is_subscriber(suri: String, stable: String, iflags: Double): Double = js.native
}

object TypeofauthDb {
  @scala.inline
  def apply(auth_check: (String, String, Double) => Double, is_subscriber: (String, String, Double) => Double): TypeofauthDb = {
    val __obj = js.Dynamic.literal(auth_check = js.Any.fromFunction3(auth_check), is_subscriber = js.Any.fromFunction3(is_subscriber))
    __obj.asInstanceOf[TypeofauthDb]
  }
  @scala.inline
  implicit class TypeofauthDbOps[Self <: TypeofauthDb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth_check(value: (String, String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_check")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIs_subscriber(value: (String, String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_subscriber")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

