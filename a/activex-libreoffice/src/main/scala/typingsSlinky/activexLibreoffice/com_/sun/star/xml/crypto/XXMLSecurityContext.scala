package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of XML security context
  *
  * This interface specifies a certain signature context. By signature context, the signer or verifier retrieves key specification.
  */
@js.native
trait XXMLSecurityContext extends XInterface {
  /** Get the ID of the internal security environment */
  var DefaultSecurityEnvironmentIndex: Double = js.native
  /** An handy method to get the first personal security environment. In XMLSec/NSS, the first personal security environment should be the "internal slot" */
  val SecurityEnvironment: XSecurityEnvironment = js.native
  /** Get the number of security environments */
  val SecurityEnvironmentNumber: Double = js.native
  /** Add personal security environment , and return the index of the added environment. */
  def addSecurityEnvironment(aSecurityEnvironment: XSecurityEnvironment): Double = js.native
  /** Get the ID of the internal security environment */
  def getDefaultSecurityEnvironmentIndex(): Double = js.native
  /** An handy method to get the first personal security environment. In XMLSec/NSS, the first personal security environment should be the "internal slot" */
  def getSecurityEnvironment(): XSecurityEnvironment = js.native
  /** Get personal security environment */
  def getSecurityEnvironmentByIndex(index: Double): XSecurityEnvironment = js.native
  /** Get the number of security environments */
  def getSecurityEnvironmentNumber(): Double = js.native
  /** set the ID of the internal security environment */
  def setDefaultSecurityEnvironmentIndex(index: Double): Unit = js.native
}

object XXMLSecurityContext {
  @scala.inline
  def apply(
    DefaultSecurityEnvironmentIndex: Double,
    SecurityEnvironment: XSecurityEnvironment,
    SecurityEnvironmentNumber: Double,
    acquire: () => Unit,
    addSecurityEnvironment: XSecurityEnvironment => Double,
    getDefaultSecurityEnvironmentIndex: () => Double,
    getSecurityEnvironment: () => XSecurityEnvironment,
    getSecurityEnvironmentByIndex: Double => XSecurityEnvironment,
    getSecurityEnvironmentNumber: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDefaultSecurityEnvironmentIndex: Double => Unit
  ): XXMLSecurityContext = {
    val __obj = js.Dynamic.literal(DefaultSecurityEnvironmentIndex = DefaultSecurityEnvironmentIndex.asInstanceOf[js.Any], SecurityEnvironment = SecurityEnvironment.asInstanceOf[js.Any], SecurityEnvironmentNumber = SecurityEnvironmentNumber.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addSecurityEnvironment = js.Any.fromFunction1(addSecurityEnvironment), getDefaultSecurityEnvironmentIndex = js.Any.fromFunction0(getDefaultSecurityEnvironmentIndex), getSecurityEnvironment = js.Any.fromFunction0(getSecurityEnvironment), getSecurityEnvironmentByIndex = js.Any.fromFunction1(getSecurityEnvironmentByIndex), getSecurityEnvironmentNumber = js.Any.fromFunction0(getSecurityEnvironmentNumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultSecurityEnvironmentIndex = js.Any.fromFunction1(setDefaultSecurityEnvironmentIndex))
    __obj.asInstanceOf[XXMLSecurityContext]
  }
  @scala.inline
  implicit class XXMLSecurityContextOps[Self <: XXMLSecurityContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSecurityEnvironmentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSecurityEnvironmentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityEnvironment(value: XSecurityEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityEnvironmentNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityEnvironmentNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddSecurityEnvironment(value: XSecurityEnvironment => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSecurityEnvironment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDefaultSecurityEnvironmentIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultSecurityEnvironmentIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSecurityEnvironment(value: () => XSecurityEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecurityEnvironment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSecurityEnvironmentByIndex(value: Double => XSecurityEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecurityEnvironmentByIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSecurityEnvironmentNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecurityEnvironmentNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDefaultSecurityEnvironmentIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultSecurityEnvironmentIndex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

