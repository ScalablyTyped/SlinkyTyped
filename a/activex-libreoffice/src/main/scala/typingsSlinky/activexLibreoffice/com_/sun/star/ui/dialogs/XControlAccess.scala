package typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic control access interface.
  *
  * Use this interface to access user interface controls supported by the implementing service. The supported controls, control properties and the
  * appropriate values are documented in the description of the implementing service.
  * @see com.sun.star.ui.dialogs.FilePicker
  * @see com.sun.star.ui.dialogs.FilePicker
  * @since OOo 1.1.2
  */
@js.native
trait XControlAccess extends XInterface {
  
  /**
    * Query for a control property.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @param aControlProperty The requested control property. Common control properties are for instance "Label" or "State".
    * @returns the requested value.
    * @throws com::sun::star::lang::IllegalArgumentException when the control is not supported or the control property is invalid.
    */
  def getControlProperty(aControlName: String, aControlProperty: String): js.Any = js.native
  
  /**
    * Change a control property.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @param aControlProperty The control property to manipulate. Common control properties are for instance "Label" or "State".
    * @param aValue A value appropriated for the property.
    * @throws com::sun::star::lang::IllegalArgumentException when the control is not supported, the control property is invalid or the value fits not the contr
    */
  def setControlProperty(aControlName: String, aControlProperty: String, aValue: js.Any): Unit = js.native
}
object XControlAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getControlProperty: (String, String) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setControlProperty: (String, String, js.Any) => Unit
  ): XControlAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getControlProperty = js.Any.fromFunction2(getControlProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setControlProperty = js.Any.fromFunction3(setControlProperty))
    __obj.asInstanceOf[XControlAccess]
  }
  
  @scala.inline
  implicit class XControlAccessMutableBuilder[Self <: XControlAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetControlProperty(value: (String, String) => js.Any): Self = StObject.set(x, "getControlProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetControlProperty(value: (String, String, js.Any) => Unit): Self = StObject.set(x, "setControlProperty", js.Any.fromFunction3(value))
  }
}
