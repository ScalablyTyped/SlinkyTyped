package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a constants group.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::CONSTANTS.
  * @since OOo 1.1.2
  */
@js.native
trait XConstantsTypeDescription extends XTypeDescription {
  
  /**
    * Returns the contstants defined for this constants group.
    * @returns a sequence containing constants descriptions.
    */
  val Constants: SafeArray[XConstantTypeDescription] = js.native
  
  /**
    * Returns the contstants defined for this constants group.
    * @returns a sequence containing constants descriptions.
    */
  def getConstants(): SafeArray[XConstantTypeDescription] = js.native
}
object XConstantsTypeDescription {
  
  @scala.inline
  def apply(
    Constants: SafeArray[XConstantTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getConstants: () => SafeArray[XConstantTypeDescription],
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConstantsTypeDescription = {
    val __obj = js.Dynamic.literal(Constants = Constants.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getConstants = js.Any.fromFunction0(getConstants), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConstantsTypeDescription]
  }
  
  @scala.inline
  implicit class XConstantsTypeDescriptionMutableBuilder[Self <: XConstantsTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstants(value: SafeArray[XConstantTypeDescription]): Self = StObject.set(x, "Constants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConstants(value: () => SafeArray[XConstantTypeDescription]): Self = StObject.set(x, "getConstants", js.Any.fromFunction0(value))
  }
}
