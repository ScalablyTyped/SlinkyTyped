package typingsSlinky.activexLibreoffice.com_.sun.star.sdbc

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the driver properties for making a connection.
  *
  * The {@link DriverPropertyInfo} is of interest only to advanced programmers who need to interact with a driver to discover and supply properties for
  * connections.
  */
@js.native
trait DriverPropertyInfo extends js.Object {
  /**
    * contains a sequence of possible values if the value for the field `DriverPropertyInfo.value` may be selected from a particular set of values;
    * otherwise empty.
    */
  var Choices: SafeArray[String] = js.native
  /** is a brief description of the property, which may be null. */
  var Description: String = js.native
  /** is `TRUE` if a value must be supplied for this property during `Driver.connect` and `FALSE` otherwise. */
  var IsRequired: Boolean = js.native
  /** is the name of the property. */
  var Name: String = js.native
  /** specifies the current value of the property, based on the driver-supplied default values. This field may be empty if no value is known. */
  var Value: String = js.native
}

object DriverPropertyInfo {
  @scala.inline
  def apply(Choices: SafeArray[String], Description: String, IsRequired: Boolean, Name: String, Value: String): DriverPropertyInfo = {
    val __obj = js.Dynamic.literal(Choices = Choices.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], IsRequired = IsRequired.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriverPropertyInfo]
  }
  @scala.inline
  implicit class DriverPropertyInfoOps[Self <: DriverPropertyInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChoices(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

