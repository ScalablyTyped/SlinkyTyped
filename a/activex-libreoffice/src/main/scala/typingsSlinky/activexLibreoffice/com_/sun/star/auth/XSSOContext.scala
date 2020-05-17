package typingsSlinky.activexLibreoffice.com_.sun.star.auth

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base SSO security context representation
  * @since OOo 1.1.2
  */
@js.native
trait XSSOContext extends XInterface {
  /**
    * retrieves the mechanism associated with the context.
    * @returns the mechanism name
    */
  val Mechanism: String = js.native
  /**
    * retrieves whether or not the context supports mutual authentication
    * @returns `TRUE` if mutual authentication is supported, `FALSE` otherwise.
    */
  val Mutual: Boolean = js.native
  /**
    * retrieves the principal name of the source/initiator of the context.
    *
    * In the case of an acceptor side security context, the source principal name is available only after the initiator has been authenticated.
    * @returns the source principal name
    */
  val Source: String = js.native
  /**
    * retrieves the principal name of the target/acceptor of the context.
    * @returns the target principal name
    */
  val Target: String = js.native
  /**
    * retrieves the mechanism associated with the context.
    * @returns the mechanism name
    */
  def getMechanism(): String = js.native
  /**
    * retrieves whether or not the context supports mutual authentication
    * @returns `TRUE` if mutual authentication is supported, `FALSE` otherwise.
    */
  def getMutual(): Boolean = js.native
  /**
    * retrieves the principal name of the source/initiator of the context.
    *
    * In the case of an acceptor side security context, the source principal name is available only after the initiator has been authenticated.
    * @returns the source principal name
    */
  def getSource(): String = js.native
  /**
    * retrieves the principal name of the target/acceptor of the context.
    * @returns the target principal name
    */
  def getTarget(): String = js.native
}

object XSSOContext {
  @scala.inline
  def apply(
    Mechanism: String,
    Mutual: Boolean,
    Source: String,
    Target: String,
    acquire: () => Unit,
    getMechanism: () => String,
    getMutual: () => Boolean,
    getSource: () => String,
    getTarget: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSSOContext = {
    val __obj = js.Dynamic.literal(Mechanism = Mechanism.asInstanceOf[js.Any], Mutual = Mutual.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMechanism = js.Any.fromFunction0(getMechanism), getMutual = js.Any.fromFunction0(getMutual), getSource = js.Any.fromFunction0(getSource), getTarget = js.Any.fromFunction0(getTarget), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSSOContext]
  }
  @scala.inline
  implicit class XSSOContextOps[Self <: XSSOContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMechanism(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mechanism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMutual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mutual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMechanism(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMechanism")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMutual(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMutual")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSource(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTarget(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

