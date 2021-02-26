package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to add and remove properties to or from an object.
  *
  * Some scripting engines cannot access properties directly when the property set is changed. Please use {@link XPropertySet.getPropertyValue()} etc. in
  * this case.
  */
@js.native
trait XPropertyContainer extends XInterface {
  
  /**
    * adds a property to the object.
    * @param Name specifies the name of the new property.
    * @param Attributes specifies the property attributes, see {@link PropertyAttribute} .
    * @param DefaultValue specifies the type of the new property and a potential default value.
    * @throws PropertyExistException if a property with the same name already exists.
    * @throws IllegalTypeException if the specified type is not allowed.
    */
  def addProperty(Name: String, Attributes: Double, DefaultValue: js.Any): Unit = js.native
  
  /**
    * removes a property from the object.
    * @param Name specified the name of the property.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def removeProperty(Name: String): Unit = js.native
}
object XPropertyContainer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addProperty: (String, Double, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeProperty: String => Unit
  ): XPropertyContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addProperty = js.Any.fromFunction3(addProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeProperty = js.Any.fromFunction1(removeProperty))
    __obj.asInstanceOf[XPropertyContainer]
  }
  
  @scala.inline
  implicit class XPropertyContainerMutableBuilder[Self <: XPropertyContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddProperty(value: (String, Double, js.Any) => Unit): Self = StObject.set(x, "addProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveProperty(value: String => Unit): Self = StObject.set(x, "removeProperty", js.Any.fromFunction1(value))
  }
}
