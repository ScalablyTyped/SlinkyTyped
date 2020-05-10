package typingsSlinky.firebaseFirestore.apiCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialsProvider extends js.Object {
  /** Requests a token for the current user. */
  def getToken(): js.Promise[Token | Null] = js.native
  /**
    * Marks the last retrieved token as invalid, making the next GetToken request
    * force-refresh the token.
    */
  def invalidateToken(): Unit = js.native
  /** Removes the previously-set change listener. */
  def removeChangeListener(): Unit = js.native
  /**
    * Specifies a listener to be notified of credential changes
    * (sign-in / sign-out, token changes). It is immediately called once with the
    * initial user.
    */
  def setChangeListener(changeListener: CredentialChangeListener): Unit = js.native
}

object CredentialsProvider {
  @scala.inline
  def apply(
    getToken: () => js.Promise[Token | Null],
    invalidateToken: () => Unit,
    removeChangeListener: () => Unit,
    setChangeListener: CredentialChangeListener => Unit
  ): CredentialsProvider = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction0(getToken), invalidateToken = js.Any.fromFunction0(invalidateToken), removeChangeListener = js.Any.fromFunction0(removeChangeListener), setChangeListener = js.Any.fromFunction1(setChangeListener))
    __obj.asInstanceOf[CredentialsProvider]
  }
  @scala.inline
  implicit class CredentialsProviderOps[Self <: CredentialsProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetToken(value: () => js.Promise[Token | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInvalidateToken(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveChangeListener(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChangeListener")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetChangeListener(value: CredentialChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChangeListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

