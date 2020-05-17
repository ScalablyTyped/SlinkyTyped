package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class XPersistentPropertySetOps[Self <: XPersistentPropertySet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistry(value: XPropertySetRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRegistry(value: () => XPropertySetRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegistry")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

