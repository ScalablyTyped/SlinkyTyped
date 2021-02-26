package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about and access to the a hierarchy of properties from an implementation.
  *
  * Usually an object that implements this interface also implements {@link XPropertySet} and at least some of the properties have subproperties.
  *
  * This interface allows direct access to subsubproperties, ... up to an arbitrary nesting depth. Often the intermediate elements of the hierarchy
  * implement {@link XProperty} .
  *
  * Each implementation specifies how the hierarchical property names, that are used to access the elements of the hierarchy, are formed.
  *
  * Commonly a notation similar to filesystem paths (separated by '/' slashes) or nested module names (separated by dots '.' or '::') is used.
  */
@js.native
trait XHierarchicalPropertySet extends XInterface {
  
  /**
    * retrieve information about the hierarchy of properties
    * @returns the {@link XHierarchicalPropertySetInfo} interface, which describes the property hierarchy of the object which supplies this interface.
    * @returns `NULL` if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XHierarchicalPropertySet
    */
  val HierarchicalPropertySetInfo: XHierarchicalPropertySetInfo = js.native
  
  /**
    * retrieve information about the hierarchy of properties
    * @returns the {@link XHierarchicalPropertySetInfo} interface, which describes the property hierarchy of the object which supplies this interface.
    * @returns `NULL` if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XHierarchicalPropertySet
    */
  def getHierarchicalPropertySetInfo(): XHierarchicalPropertySetInfo = js.native
  
  /**
    * @param aHierarchicalPropertyName This parameter specifies the name of the property.
    * @returns the value of the property with the specified nested name.
    * @see XPropertySet.getPropertyValue
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::uno::lang::IllegalArgumentException if **aHierarchicalPropertyName** is not a well-formed nested name for this hierarchy. An impl
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getHierarchicalPropertyValue(aHierarchicalPropertyName: String): js.Any = js.native
  
  /**
    * sets the value of the property with the specified nested name.
    * @param aHierarchicalPropertyName This parameter specifies the name of the property.
    * @param aValue This parameter specifies the new value for the property.
    * @see XPropertySet.setPropertyValue
    * @throws UnknownPropertyException if the property does not exist.
    * @throws PropertyVetoException if the property is constrained and the change is vetoed by a {@link XVetoableChangeListener} .
    * @throws com::sun::star::uno::lang::IllegalArgumentException if **aValue** is not a legal value for this property or if **aHierarchicalPropertyName** is n
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def setHierarchicalPropertyValue(aHierarchicalPropertyName: String, aValue: js.Any): Unit = js.native
}
object XHierarchicalPropertySet {
  
  @scala.inline
  def apply(
    HierarchicalPropertySetInfo: XHierarchicalPropertySetInfo,
    acquire: () => Unit,
    getHierarchicalPropertySetInfo: () => XHierarchicalPropertySetInfo,
    getHierarchicalPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setHierarchicalPropertyValue: (String, js.Any) => Unit
  ): XHierarchicalPropertySet = {
    val __obj = js.Dynamic.literal(HierarchicalPropertySetInfo = HierarchicalPropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getHierarchicalPropertySetInfo = js.Any.fromFunction0(getHierarchicalPropertySetInfo), getHierarchicalPropertyValue = js.Any.fromFunction1(getHierarchicalPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHierarchicalPropertyValue = js.Any.fromFunction2(setHierarchicalPropertyValue))
    __obj.asInstanceOf[XHierarchicalPropertySet]
  }
  
  @scala.inline
  implicit class XHierarchicalPropertySetMutableBuilder[Self <: XHierarchicalPropertySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetHierarchicalPropertySetInfo(value: () => XHierarchicalPropertySetInfo): Self = StObject.set(x, "getHierarchicalPropertySetInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHierarchicalPropertyValue(value: String => js.Any): Self = StObject.set(x, "getHierarchicalPropertyValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHierarchicalPropertySetInfo(value: XHierarchicalPropertySetInfo): Self = StObject.set(x, "HierarchicalPropertySetInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHierarchicalPropertyValue(value: (String, js.Any) => Unit): Self = StObject.set(x, "setHierarchicalPropertyValue", js.Any.fromFunction2(value))
  }
}
