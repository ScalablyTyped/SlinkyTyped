package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the numbering types that are supported by a component.
  *
  * To be able to store unknown numbering types in a file format the numbering types correspond to an identifier.
  * @author Oliver Specht
  * @see com.sun.star.text.NumberingRules
  * @see com.sun.star.style.NumberingType
  * @version 1.0
  */
@js.native
trait XNumberingTypeInfo extends XInterface {
  
  /**
    * returns the numbering type values that are supported by the component.
    * @see
    */
  val SupportedNumberingTypes: SafeArray[Double] = js.native
  
  /** returns the corresponding identifier to a numbering type. */
  def getNumberingIdentifier(NumberingType: Double): String = js.native
  
  /** returns the corresponding numbering type to an identifier. */
  def getNumberingType(NumberingIdentifier: String): Double = js.native
  
  /**
    * returns the numbering type values that are supported by the component.
    * @see
    */
  def getSupportedNumberingTypes(): SafeArray[Double] = js.native
  
  /** determines whether an identifier is supported. */
  def hasNumberingType(NumberingIdentifier: String): Boolean = js.native
}
object XNumberingTypeInfo {
  
  @scala.inline
  def apply(
    SupportedNumberingTypes: SafeArray[Double],
    acquire: () => Unit,
    getNumberingIdentifier: Double => String,
    getNumberingType: String => Double,
    getSupportedNumberingTypes: () => SafeArray[Double],
    hasNumberingType: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumberingTypeInfo = {
    val __obj = js.Dynamic.literal(SupportedNumberingTypes = SupportedNumberingTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getNumberingIdentifier = js.Any.fromFunction1(getNumberingIdentifier), getNumberingType = js.Any.fromFunction1(getNumberingType), getSupportedNumberingTypes = js.Any.fromFunction0(getSupportedNumberingTypes), hasNumberingType = js.Any.fromFunction1(hasNumberingType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberingTypeInfo]
  }
  
  @scala.inline
  implicit class XNumberingTypeInfoMutableBuilder[Self <: XNumberingTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNumberingIdentifier(value: Double => String): Self = StObject.set(x, "getNumberingIdentifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumberingType(value: String => Double): Self = StObject.set(x, "getNumberingType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSupportedNumberingTypes(value: () => SafeArray[Double]): Self = StObject.set(x, "getSupportedNumberingTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasNumberingType(value: String => Boolean): Self = StObject.set(x, "hasNumberingType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSupportedNumberingTypes(value: SafeArray[Double]): Self = StObject.set(x, "SupportedNumberingTypes", value.asInstanceOf[js.Any])
  }
}
