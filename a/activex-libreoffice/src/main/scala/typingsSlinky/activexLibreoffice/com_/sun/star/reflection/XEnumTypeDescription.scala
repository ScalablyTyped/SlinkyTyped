package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reflects an enum type. */
@js.native
trait XEnumTypeDescription extends XTypeDescription {
  
  /**
    * Returns the default enum value.
    * @returns default enum value
    */
  val DefaultEnumValue: Double = js.native
  
  /**
    * Returns the enum member values.
    * @returns enum member values
    */
  val EnumNames: SafeArray[String] = js.native
  
  /**
    * Returns the enum member names.
    * @returns enum member names
    */
  val EnumValues: SafeArray[Double] = js.native
  
  /**
    * Returns the default enum value.
    * @returns default enum value
    */
  def getDefaultEnumValue(): Double = js.native
  
  /**
    * Returns the enum member values.
    * @returns enum member values
    */
  def getEnumNames(): SafeArray[String] = js.native
  
  /**
    * Returns the enum member names.
    * @returns enum member names
    */
  def getEnumValues(): SafeArray[Double] = js.native
}
object XEnumTypeDescription {
  
  @scala.inline
  def apply(
    DefaultEnumValue: Double,
    EnumNames: SafeArray[String],
    EnumValues: SafeArray[Double],
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getDefaultEnumValue: () => Double,
    getEnumNames: () => SafeArray[String],
    getEnumValues: () => SafeArray[Double],
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEnumTypeDescription = {
    val __obj = js.Dynamic.literal(DefaultEnumValue = DefaultEnumValue.asInstanceOf[js.Any], EnumNames = EnumNames.asInstanceOf[js.Any], EnumValues = EnumValues.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultEnumValue = js.Any.fromFunction0(getDefaultEnumValue), getEnumNames = js.Any.fromFunction0(getEnumNames), getEnumValues = js.Any.fromFunction0(getEnumValues), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEnumTypeDescription]
  }
  
  @scala.inline
  implicit class XEnumTypeDescriptionMutableBuilder[Self <: XEnumTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultEnumValue(value: Double): Self = StObject.set(x, "DefaultEnumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumNames(value: SafeArray[String]): Self = StObject.set(x, "EnumNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumValues(value: SafeArray[Double]): Self = StObject.set(x, "EnumValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultEnumValue(value: () => Double): Self = StObject.set(x, "getDefaultEnumValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnumNames(value: () => SafeArray[String]): Self = StObject.set(x, "getEnumNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnumValues(value: () => SafeArray[Double]): Self = StObject.set(x, "getEnumValues", js.Any.fromFunction0(value))
  }
}
