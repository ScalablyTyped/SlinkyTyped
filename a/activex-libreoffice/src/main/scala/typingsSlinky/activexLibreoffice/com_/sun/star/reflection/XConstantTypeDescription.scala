package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a constant.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::CONSTANT.
  *
  * Constants may be contained in constants groups and modules.
  * @see XModuleTypeDescription
  * @see XConstantsTypeDescription
  * @since OOo 1.1.2
  */
@js.native
trait XConstantTypeDescription extends XTypeDescription {
  
  /** @returns the value of the constant.  Following types are allowed for constants: booleanbyteshortunsigned shortlongunsigned longhyperunsigned hyperfloatdouble */
  val ConstantValue: js.Any = js.native
  
  /** @returns the value of the constant.  Following types are allowed for constants: booleanbyteshortunsigned shortlongunsigned longhyperunsigned hyperfloatdouble */
  def getConstantValue(): js.Any = js.native
}
object XConstantTypeDescription {
  
  @scala.inline
  def apply(
    ConstantValue: js.Any,
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getConstantValue: () => js.Any,
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConstantTypeDescription = {
    val __obj = js.Dynamic.literal(ConstantValue = ConstantValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getConstantValue = js.Any.fromFunction0(getConstantValue), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConstantTypeDescription]
  }
  
  @scala.inline
  implicit class XConstantTypeDescriptionMutableBuilder[Self <: XConstantTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstantValue(value: js.Any): Self = StObject.set(x, "ConstantValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConstantValue(value: () => js.Any): Self = StObject.set(x, "getConstantValue", js.Any.fromFunction0(value))
  }
}
