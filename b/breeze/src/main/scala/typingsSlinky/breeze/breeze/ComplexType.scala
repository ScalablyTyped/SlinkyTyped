package typingsSlinky.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplexType extends IStructuralType {
  
  def addProperty(dataProperty: DataProperty): ComplexType = js.native
  
  def getProperties(): js.Array[DataProperty] = js.native
}
object ComplexType {
  
  @scala.inline
  def apply(
    addProperty: DataProperty => ComplexType,
    complexProperties: js.Array[DataProperty],
    dataProperties: js.Array[DataProperty],
    getProperties: () => js.Array[DataProperty],
    name: String,
    namespace: String,
    shortName: String,
    unmappedProperties: js.Array[DataProperty],
    validators: js.Array[Validator]
  ): ComplexType = {
    val __obj = js.Dynamic.literal(addProperty = js.Any.fromFunction1(addProperty), complexProperties = complexProperties.asInstanceOf[js.Any], dataProperties = dataProperties.asInstanceOf[js.Any], getProperties = js.Any.fromFunction0(getProperties), name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], unmappedProperties = unmappedProperties.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexType]
  }
  
  @scala.inline
  implicit class ComplexTypeMutableBuilder[Self <: ComplexType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddProperty(value: DataProperty => ComplexType): Self = StObject.set(x, "addProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProperties(value: () => js.Array[DataProperty]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
  }
}
