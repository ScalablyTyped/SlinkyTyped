package typingsSlinky.gapiAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentUser extends js.Object {
  /**
    * Returns a GoogleUser object that represents the current user. Note that in a newly-initialized
    * GoogleAuth instance, the current user has not been set. Use the currentUser.listen() method or the
    * GoogleAuth.then() to get an initialized GoogleAuth instance.
    */
  def get(): GoogleUser = js.native
  /**
    * Listen for changes in currentUser.
    */
  def listen(listener: js.Function1[/* user */ GoogleUser, _]): Unit = js.native
}

object CurrentUser {
  @scala.inline
  def apply(get: () => GoogleUser, listen: js.Function1[/* user */ GoogleUser, _] => Unit): CurrentUser = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[CurrentUser]
  }
  @scala.inline
  implicit class CurrentUserOps[Self <: CurrentUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: () => GoogleUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListen(value: js.Function1[/* user */ GoogleUser, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

