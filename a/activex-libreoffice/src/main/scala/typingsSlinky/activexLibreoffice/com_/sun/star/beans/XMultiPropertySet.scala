package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to multiple properties with a single call. */
@js.native
trait XMultiPropertySet extends XInterface {
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  val PropertySetInfo: XPropertySetInfo = js.native
  /**
    * adds an {@link XPropertiesChangeListener} to the specified property with the specified names.
    *
    * The implementation can ignore the names of the properties and fire the event on all properties.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @param aPropertyNames specifies the names of the properties.
    * @param xListener contains the listener for the property change events.
    * @see removePropertiesChangeListener
    */
  def addPropertiesChangeListener(aPropertyNames: SeqEquiv[String], xListener: XPropertiesChangeListener): Unit = js.native
  /**
    * fires a sequence of PropertyChangeEvents to the specified listener.
    * @param aPropertyNames specifies the sorted names of the properties.
    * @param xListener contains the listener for the property change events.
    */
  def firePropertiesChangeEvent(aPropertyNames: SeqEquiv[String], xListener: XPropertiesChangeListener): Unit = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  def getPropertySetInfo(): XPropertySetInfo = js.native
  /**
    * @param aPropertyNames specifies the names of the properties. This sequence must be alphabetically sorted.
    * @returns a sequence of all values of the properties which are specified by their names.  The order of the values in the returned sequence will be the same
    */
  def getPropertyValues(aPropertyNames: SeqEquiv[String]): SafeArray[_] = js.native
  /**
    * removes an {@link XPropertiesChangeListener} from the listener list.
    *
    * It is a "noop" if the listener is not registered.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @param xListener contains the listener to be removed.
    * @see addPropertiesChangeListener
    */
  def removePropertiesChangeListener(xListener: XPropertiesChangeListener): Unit = js.native
  /**
    * sets the values to the properties with the specified names.
    *
    * The values of the properties must change before the bound events are fired. The values of the constrained properties should change after the vetoable
    * events are fired and only if no exception occurred. Unknown properties are ignored.
    * @param aPropertyNames specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @param aValues contains the new values of the properties. The order is the same as in **aPropertyNames** .
    * @throws IllegalArgumentException if one of the new values cannot be converted to the type of the underlying property by an identity or widening conversion.
    * @throws com::sun::star::lang:WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception i
    */
  def setPropertyValues(aPropertyNames: SeqEquiv[String], aValues: SeqEquiv[_]): Unit = js.native
}

object XMultiPropertySet {
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit
  ): XMultiPropertySet = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValues = js.Any.fromFunction1(getPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
    __obj.asInstanceOf[XMultiPropertySet]
  }
  @scala.inline
  implicit class XMultiPropertySetOps[Self <: XMultiPropertySet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertySetInfo(value: XPropertySetInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertySetInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddPropertiesChangeListener(value: (SeqEquiv[String], XPropertiesChangeListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPropertiesChangeListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFirePropertiesChangeEvent(value: (SeqEquiv[String], XPropertiesChangeListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firePropertiesChangeEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPropertySetInfo(value: () => XPropertySetInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertySetInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPropertyValues(value: SeqEquiv[String] => SafeArray[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertyValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovePropertiesChangeListener(value: XPropertiesChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePropertiesChangeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPropertyValues(value: (SeqEquiv[String], SeqEquiv[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPropertyValues")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

