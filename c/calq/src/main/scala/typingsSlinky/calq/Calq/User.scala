package typingsSlinky.calq.Calq

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  def clear(): Unit = js.native
  def identify(userId: String): Unit = js.native
  def profile(params: StringDictionary[js.Any]): Unit = js.native
}

object User {
  @scala.inline
  def apply(clear: () => Unit, identify: String => Unit, profile: StringDictionary[js.Any] => Unit): User = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), identify = js.Any.fromFunction1(identify), profile = js.Any.fromFunction1(profile))
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIdentify(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProfile(value: StringDictionary[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

