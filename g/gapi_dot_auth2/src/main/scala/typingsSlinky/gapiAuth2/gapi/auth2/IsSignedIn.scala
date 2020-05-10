package typingsSlinky.gapiAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsSignedIn extends js.Object {
  /**
    * Returns whether the current user is currently signed in.
    */
  def get(): Boolean = js.native
  /**
    * Listen for changes in the current user's sign-in state.
    */
  def listen(listener: js.Function1[/* signedIn */ Boolean, _]): Unit = js.native
}

object IsSignedIn {
  @scala.inline
  def apply(get: () => Boolean, listen: js.Function1[/* signedIn */ Boolean, _] => Unit): IsSignedIn = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[IsSignedIn]
  }
  @scala.inline
  implicit class IsSignedInOps[Self <: IsSignedIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListen(value: js.Function1[/* signedIn */ Boolean, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

