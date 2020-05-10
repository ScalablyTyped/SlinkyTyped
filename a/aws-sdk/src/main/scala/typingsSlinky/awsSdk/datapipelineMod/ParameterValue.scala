package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterValue extends js.Object {
  /**
    * The ID of the parameter value.
    */
  var id: fieldNameString = js.native
  /**
    * The field value, expressed as a String.
    */
  var stringValue: fieldStringValue = js.native
}

object ParameterValue {
  @scala.inline
  def apply(id: fieldNameString, stringValue: fieldStringValue): ParameterValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterValue]
  }
  @scala.inline
  implicit class ParameterValueOps[Self <: ParameterValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: fieldNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringValue(value: fieldStringValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

