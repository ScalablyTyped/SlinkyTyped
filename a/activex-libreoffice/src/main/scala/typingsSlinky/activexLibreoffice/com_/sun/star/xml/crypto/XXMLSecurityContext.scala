package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultSecurityEnvironmentIndex(value: Double): Self = this.set("DefaultSecurityEnvironmentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityEnvironment(value: XSecurityEnvironment): Self = this.set("SecurityEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityEnvironmentNumber(value: Double): Self = this.set("SecurityEnvironmentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSecurityEnvironment(value: XSecurityEnvironment => Double): Self = this.set("addSecurityEnvironment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefaultSecurityEnvironmentIndex(value: () => Double): Self = this.set("getDefaultSecurityEnvironmentIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSecurityEnvironment(value: () => XSecurityEnvironment): Self = this.set("getSecurityEnvironment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSecurityEnvironmentByIndex(value: Double => XSecurityEnvironment): Self = this.set("getSecurityEnvironmentByIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSecurityEnvironmentNumber(value: () => Double): Self = this.set("getSecurityEnvironmentNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDefaultSecurityEnvironmentIndex(value: Double => Unit): Self = this.set("setDefaultSecurityEnvironmentIndex", js.Any.fromFunction1(value))
  }
}
