package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a property value. */
@js.native
trait PropertyValue extends js.Object {
  /**
    * contains an implementation-specific handle for the property.
    *
    * It may be -1 if the implementation has no handle. If available it can be used for fast lookups.
    */
  var Handle: Double = js.native
  /**
    * specifies the name of the property.
    *
    * The name is unique within a sequence of PropertyValues. Upper and lower case are distinguished.
    */
  var Name: String = js.native
  /** determines if the value comes from the object itself or from a default and if the value cannot be determined exactly. */
  var State: PropertyState = js.native
  /** contains the value of the property or `VOID` , if no value is available. */
  var Value: js.Any = js.native
}

object PropertyValue {
  @scala.inline
  def apply(Handle: Double, Name: String, State: PropertyState, Value: js.Any): PropertyValue = {
    val __obj = js.Dynamic.literal(Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyValue]
  }
  @scala.inline
  implicit class PropertyValueOps[Self <: PropertyValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: PropertyState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

