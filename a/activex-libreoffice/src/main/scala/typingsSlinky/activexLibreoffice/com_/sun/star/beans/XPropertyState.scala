package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to query information about the state of one or more properties.
  *
  * The state contains the information if:
  *
  * a value is available or voidthe value is stored in the object itself, or if a default value is to be usedand if the value cannot be determined, due to
  * ambiguity (multi selection with multiple values).
  */
@js.native
trait XPropertyState extends XInterface {
  /**
    * @param aPropertyName specifies the name of the property.
    * @returns the default value of the property with the name PropertyName.  If no default exists, is not known or is void, then the return type is `void` .
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getPropertyDefault(aPropertyName: String): js.Any = js.native
  /**
    * @param PropertyName specifies the name of the property.
    * @returns the state of the property.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def getPropertyState(PropertyName: String): PropertyState = js.native
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState] = js.native
  /**
    * Sets the property to default value.
    *
    * The value depends on the implementation of this interface. If it is a bound property, you must change the value before the change events are fired. If
    * it is a constrained property, you must fire the vetoable event before you change the property value.
    * @param PropertyName specifies the name of the property.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def setPropertyToDefault(PropertyName: String): Unit = js.native
}

object XPropertyState {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getPropertyDefault: String => js.Any,
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPropertyToDefault: String => Unit
  ): XPropertyState = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault))
    __obj.asInstanceOf[XPropertyState]
  }
  @scala.inline
  implicit class XPropertyStateOps[Self <: XPropertyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPropertyDefault(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertyDefault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPropertyState(value: String => PropertyState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertyState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPropertyStates(value: SeqEquiv[String] => SafeArray[PropertyState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertyStates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPropertyToDefault(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPropertyToDefault")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

