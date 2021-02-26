package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A persistent property set, which can be saved in and restored from a {@link XPropertySetRegistry} .
  * @author Kai Sommerfeld
  * @version 1.0
  */
@js.native
trait XPersistentPropertySet extends XPropertySet {
  
  /**
    * returns the key used to address the set in the property set registry.
    * @returns The key.
    */
  val Key: String = js.native
  
  /**
    * returns the registry used to store the property set.
    * @returns The registry.
    */
  val Registry: XPropertySetRegistry = js.native
  
  /**
    * returns the key used to address the set in the property set registry.
    * @returns The key.
    */
  def getKey(): String = js.native
  
  /**
    * returns the registry used to store the property set.
    * @returns The registry.
    */
  def getRegistry(): XPropertySetRegistry = js.native
}
object XPersistentPropertySet {
  
  @scala.inline
  def apply(
    Key: String,
    PropertySetInfo: XPropertySetInfo,
    Registry: XPropertySetRegistry,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getKey: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRegistry: () => XPropertySetRegistry,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XPersistentPropertySet = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Registry = Registry.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getKey = js.Any.fromFunction0(getKey), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRegistry = js.Any.fromFunction0(getRegistry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XPersistentPropertySet]
  }
  
  @scala.inline
  implicit class XPersistentPropertySetMutableBuilder[Self <: XPersistentPropertySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetKey(value: () => String): Self = StObject.set(x, "getKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRegistry(value: () => XPropertySetRegistry): Self = StObject.set(x, "getRegistry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistry(value: XPropertySetRegistry): Self = StObject.set(x, "Registry", value.asInstanceOf[js.Any])
  }
}
