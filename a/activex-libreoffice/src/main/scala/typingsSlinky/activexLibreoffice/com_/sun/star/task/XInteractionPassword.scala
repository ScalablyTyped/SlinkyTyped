package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A continuation to get a password from interaction helper.
  * @since OOo 1.1.2
  */
@js.native
trait XInteractionPassword extends XInteractionContinuation {
  /**
    * Get result password from the continuation.
    * @returns the stored password.
    */
  var Password: String = js.native
  /**
    * Get result password from the continuation.
    * @returns the stored password.
    */
  def getPassword(): String = js.native
  /**
    * Store result password to the continuation.
    * @param aPasswd the result password.
    */
  def setPassword(aPasswd: String): Unit = js.native
}

object XInteractionPassword {
  @scala.inline
  def apply(
    Password: String,
    acquire: () => Unit,
    getPassword: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setPassword: String => Unit
  ): XInteractionPassword = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPassword = js.Any.fromFunction0(getPassword), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setPassword = js.Any.fromFunction1(setPassword))
    __obj.asInstanceOf[XInteractionPassword]
  }
  @scala.inline
  implicit class XInteractionPasswordOps[Self <: XInteractionPassword] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPassword(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPassword")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPassword(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPassword")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

