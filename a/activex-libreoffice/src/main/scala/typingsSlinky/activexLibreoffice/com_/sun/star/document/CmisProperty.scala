package typingsSlinky.activexLibreoffice.com_.sun.star.document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a CMIS property. */
@js.native
trait CmisProperty extends js.Object {
  /** specifies the possible choices of the values. */
  var Choices: js.Any = js.native
  /** unique ID of the Cmis property */
  var Id: String = js.native
  /** specifies if the property has multiple value */
  var MultiValued: Boolean = js.native
  /** specifies the display name of the CMIS property. */
  var Name: String = js.native
  /** specifies if the property value can be freely set or is restricted from a list of choices. */
  var OpenChoice: Boolean = js.native
  /** specifies if the property is required and can not be empty. */
  var Required: Boolean = js.native
  /** type of the property */
  var Type: String = js.native
  /** specifies if the property is updatable. */
  var Updatable: Boolean = js.native
  /** specifies value of the property */
  var Value: js.Any = js.native
}

object CmisProperty {
  @scala.inline
  def apply(
    Choices: js.Any,
    Id: String,
    MultiValued: Boolean,
    Name: String,
    OpenChoice: Boolean,
    Required: Boolean,
    Type: String,
    Updatable: Boolean,
    Value: js.Any
  ): CmisProperty = {
    val __obj = js.Dynamic.literal(Choices = Choices.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MultiValued = MultiValued.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OpenChoice = OpenChoice.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Updatable = Updatable.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmisProperty]
  }
  @scala.inline
  implicit class CmisPropertyOps[Self <: CmisProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChoices(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValued(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenChoice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenChoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Updatable")(value.asInstanceOf[js.Any])
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

