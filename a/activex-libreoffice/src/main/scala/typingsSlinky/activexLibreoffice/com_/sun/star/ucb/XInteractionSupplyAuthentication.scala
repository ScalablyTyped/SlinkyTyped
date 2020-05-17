package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation handing back some authentication data.
  *
  * This continuation is typically used in conjunction with {@link AuthenticationRequest} .
  */
@js.native
trait XInteractionSupplyAuthentication extends XInteractionContinuation {
  /** Specifies if an "account" value can be handed back. */
  def canSetAccount(): Boolean = js.native
  /** Specifies if a "password" value can be handed back. */
  def canSetPassword(): Boolean = js.native
  /** Specifies if a new "realm" value can be handed back. */
  def canSetRealm(): Boolean = js.native
  /** Specifies if a "user name" value can be handed back. */
  def canSetUserName(): Boolean = js.native
  /**
    * Specifies the available modes of how long to remember the account.
    * @param Default Returns the default mode (to be initially displayed to the user).
    * @returns A sequence of available modes to hand back. Each individual mode should appear at most once in the sequence. If the sequence is empty, a new mode
    */
  def getRememberAccountModes(Default: js.Array[RememberAuthentication]): SafeArray[RememberAuthentication] = js.native
  /**
    * Specifies the available modes of how long to remember the password.
    * @param Default Returns the default mode (to be initially displayed to the user).
    * @returns A sequence of available modes to hand back. Each individual mode should appear at most once in the sequence. If the sequence is empty, a new mode
    */
  def getRememberPasswordModes(Default: js.Array[RememberAuthentication]): SafeArray[RememberAuthentication] = js.native
  /**
    * Set a new "account" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetAccount()} returned `TRUE` .
    */
  def setAccount(Account: String): Unit = js.native
  /**
    * Set a new "password" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetPassword()} returned `TRUE` .
    */
  def setPassword(Password: String): Unit = js.native
  /**
    * Set a new "realm" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetRealm()} returned `TRUE` .
    */
  def setRealm(Realm: String): Unit = js.native
  /**
    * Set a new mode of how long to remember the account.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.setAccount()} is also called.
    * @param Remember The mode to hand back, should be contained in the sequence returned by {@link XInteractionSupplyAuthentication.getRememberAccountModes()} .
    */
  def setRememberAccount(Remember: RememberAuthentication): Unit = js.native
  /**
    * Set a new mode of how long to remember the password.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.setPassword()} is also called.
    * @param Remember The mode to hand back, should be contained in the sequence returned by {@link XInteractionSupplyAuthentication.getRememberPasswordModes()} .
    */
  def setRememberPassword(Remember: RememberAuthentication): Unit = js.native
  /**
    * Set a new "user name" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetUserName()} returned `TRUE` .
    */
  def setUserName(UserName: String): Unit = js.native
}

object XInteractionSupplyAuthentication {
  @scala.inline
  def apply(
    acquire: () => Unit,
    canSetAccount: () => Boolean,
    canSetPassword: () => Boolean,
    canSetRealm: () => Boolean,
    canSetUserName: () => Boolean,
    getRememberAccountModes: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication],
    getRememberPasswordModes: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setAccount: String => Unit,
    setPassword: String => Unit,
    setRealm: String => Unit,
    setRememberAccount: RememberAuthentication => Unit,
    setRememberPassword: RememberAuthentication => Unit,
    setUserName: String => Unit
  ): XInteractionSupplyAuthentication = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), canSetAccount = js.Any.fromFunction0(canSetAccount), canSetPassword = js.Any.fromFunction0(canSetPassword), canSetRealm = js.Any.fromFunction0(canSetRealm), canSetUserName = js.Any.fromFunction0(canSetUserName), getRememberAccountModes = js.Any.fromFunction1(getRememberAccountModes), getRememberPasswordModes = js.Any.fromFunction1(getRememberPasswordModes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setAccount = js.Any.fromFunction1(setAccount), setPassword = js.Any.fromFunction1(setPassword), setRealm = js.Any.fromFunction1(setRealm), setRememberAccount = js.Any.fromFunction1(setRememberAccount), setRememberPassword = js.Any.fromFunction1(setRememberPassword), setUserName = js.Any.fromFunction1(setUserName))
    __obj.asInstanceOf[XInteractionSupplyAuthentication]
  }
  @scala.inline
  implicit class XInteractionSupplyAuthenticationOps[Self <: XInteractionSupplyAuthentication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanSetAccount(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSetAccount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanSetPassword(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSetPassword")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanSetRealm(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSetRealm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanSetUserName(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSetUserName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRememberAccountModes(value: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRememberAccountModes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRememberPasswordModes(value: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRememberPasswordModes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAccount(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPassword(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPassword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRealm(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRealm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRememberAccount(value: RememberAuthentication => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRememberAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRememberPassword(value: RememberAuthentication => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRememberPassword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUserName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUserName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

