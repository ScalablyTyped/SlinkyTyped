package typingsSlinky.activexLibreoffice.com_.sun.star.auth

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Factory for creating an SSO Manager supporting the user's configured security mechanism
  * @since OOo 1.1.2
  */
@js.native
trait XSSOManagerFactory extends XInterface {
  /**
    * provides a {@link XSSOManager} to be used in subsequent security context creation.
    * @returns the relevant {@link XSSOManager} instance
    */
  val SSOManager: XSSOManager = js.native
  /**
    * provides a {@link XSSOManager} to be used in subsequent security context creation.
    * @returns the relevant {@link XSSOManager} instance
    */
  def getSSOManager(): XSSOManager = js.native
}

object XSSOManagerFactory {
  @scala.inline
  def apply(
    SSOManager: XSSOManager,
    acquire: () => Unit,
    getSSOManager: () => XSSOManager,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSSOManagerFactory = {
    val __obj = js.Dynamic.literal(SSOManager = SSOManager.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSSOManager = js.Any.fromFunction0(getSSOManager), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSSOManagerFactory]
  }
  @scala.inline
  implicit class XSSOManagerFactoryOps[Self <: XSSOManagerFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSSOManager(value: XSSOManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSOManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSSOManager(value: () => XSSOManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSSOManager")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

