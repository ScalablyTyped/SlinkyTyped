package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure describes a property.
  *
  * There are three types of properties: bound propertiesconstrained propertiesfree properties
  */
@js.native
trait Property extends js.Object {
  /** This field may contain zero or more constants of the {@link PropertyAttribute} constants group. */
  var Attributes: Double = js.native
  /**
    * contains an implementation-specific handle for the property.
    *
    * It may be -1 if the implementation has no handle. You can use this handle to get values from the {@link XFastPropertySet} .
    */
  var Handle: Double = js.native
  /**
    * specifies the name of the property.
    *
    * The name is unique within an {@link XPropertySet} . Upper and lower case are distinguished.
    */
  var Name: String = js.native
  /**
    * contains an object that identifies the declared type for the property.
    *
    * If the property has multiple types or the type is not known, **but not an any** , then void must be returned.
    */
  var Type: `type` = js.native
}

object Property {
  @scala.inline
  def apply(Attributes: Double, Handle: Double, Name: String, Type: `type`): Property = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  @scala.inline
  implicit class PropertyOps[Self <: Property] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withType(value: `type`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

