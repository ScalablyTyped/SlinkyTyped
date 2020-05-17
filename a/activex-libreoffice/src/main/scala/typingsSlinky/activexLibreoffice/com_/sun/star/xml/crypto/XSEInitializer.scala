package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to manipulate Security Environment */
@js.native
trait XSEInitializer extends XInterface {
  /**
    * Creates a security context.
    * @param aString reserved for internal use.
    * @returns the security context created
    */
  def createSecurityContext(aString: String): XXMLSecurityContext = js.native
  /**
    * Frees a security context.
    * @param securityContext the security context to be freed
    */
  def freeSecurityContext(securityContext: XXMLSecurityContext): Unit = js.native
}

object XSEInitializer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createSecurityContext: String => XXMLSecurityContext,
    freeSecurityContext: XXMLSecurityContext => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSEInitializer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSecurityContext = js.Any.fromFunction1(createSecurityContext), freeSecurityContext = js.Any.fromFunction1(freeSecurityContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSEInitializer]
  }
  @scala.inline
  implicit class XSEInitializerOps[Self <: XSEInitializer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateSecurityContext(value: String => XXMLSecurityContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSecurityContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFreeSecurityContext(value: XXMLSecurityContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeSecurityContext")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

