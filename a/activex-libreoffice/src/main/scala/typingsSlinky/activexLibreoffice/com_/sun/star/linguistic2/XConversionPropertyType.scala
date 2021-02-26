package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows set and retrieve the property type of an entry in a conversion dictionary
  *
  * The property type must be one of {@link com.sun.star.linguistic2.ConversionPropertyType}
  * @see com.sun.star.linguistic2.XConversionDictionary
  * @see com.sun.star.linguistic2.ConversionPropertyType
  * @since OOo 2.0
  */
@js.native
trait XConversionPropertyType extends XInterface {
  
  /**
    * returns the property type for the specified entry.
    *
    * The conversion entry is specified by the pair ( aLeftText, aRightText ).
    * @param aLeftText the left text of the dictionary entry.
    * @param aRightText the right text of the dictionary entry.
    * @returns returns the property type for the entry with the specified left text.
    */
  def getPropertyType(aLeftText: String, aRightText: String): Double = js.native
  
  /**
    * sets the property type for the specified entry.
    *
    * The conversion entry is specified by the pair ( aLeftText, aRightText ).
    * @param aLeftText the left text of the dictionary entry.
    * @param aRightText the right text of the dictionary entry.
    * @param nPropertyType the property type to be set for the entry
    */
  def setPropertyType(aLeftText: String, aRightText: String, nPropertyType: Double): Unit = js.native
}
object XConversionPropertyType {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getPropertyType: (String, String) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPropertyType: (String, String, Double) => Unit
  ): XConversionPropertyType = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getPropertyType = js.Any.fromFunction2(getPropertyType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPropertyType = js.Any.fromFunction3(setPropertyType))
    __obj.asInstanceOf[XConversionPropertyType]
  }
  
  @scala.inline
  implicit class XConversionPropertyTypeMutableBuilder[Self <: XConversionPropertyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPropertyType(value: (String, String) => Double): Self = StObject.set(x, "getPropertyType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPropertyType(value: (String, String, Double) => Unit): Self = StObject.set(x, "setPropertyType", js.Any.fromFunction3(value))
  }
}
