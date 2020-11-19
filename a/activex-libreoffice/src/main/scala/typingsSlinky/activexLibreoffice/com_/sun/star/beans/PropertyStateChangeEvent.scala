package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is delivered whenever the state of a "bound" property is changed.
  *
  * It is sent as an argument to the method of {@link XPropertyStateChangeListener} .
  *
  * Normally these events are accompanied by the name, and the old and new values of the changed property.
  *
  * Void values may be provided for the old and new values if their true values are not known.
  */
@js.native
trait PropertyStateChangeEvent extends EventObject {
  
  /** contains the new value of the property. */
  var NewValue: PropertyState = js.native
  
  /** contains the old value of the property. */
  var OldValue: PropertyState = js.native
  
  /**
    * contains the implementation handle for the property.
    *
    * It may be -1 if the implementation has no handle. You can use this handle to get values from the {@link XFastPropertySet} interface.
    */
  var PropertyHandle: Double = js.native
  
  /**
    * specifies the name of the property which changes its value.
    *
    * This name identifies the property uniquely within an {@link XPropertySet} . Upper and lower case are distinguished.
    */
  var PropertyName: String = js.native
}
object PropertyStateChangeEvent {
  
  @scala.inline
  def apply(
    NewValue: PropertyState,
    OldValue: PropertyState,
    PropertyHandle: Double,
    PropertyName: String,
    Source: XInterface
  ): PropertyStateChangeEvent = {
    val __obj = js.Dynamic.literal(NewValue = NewValue.asInstanceOf[js.Any], OldValue = OldValue.asInstanceOf[js.Any], PropertyHandle = PropertyHandle.asInstanceOf[js.Any], PropertyName = PropertyName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyStateChangeEvent]
  }
  
  @scala.inline
  implicit class PropertyStateChangeEventOps[Self <: PropertyStateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNewValue(value: PropertyState): Self = this.set("NewValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: PropertyState): Self = this.set("OldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyHandle(value: Double): Self = this.set("PropertyHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("PropertyName", value.asInstanceOf[js.Any])
  }
}
