package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterAttribute extends js.Object {
  /**
    * The field identifier.
    */
  var key: attributeNameString = js.native
  /**
    * The field value, expressed as a String.
    */
  var stringValue: attributeValueString = js.native
}

object ParameterAttribute {
  @scala.inline
  def apply(key: attributeNameString, stringValue: attributeValueString): ParameterAttribute = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterAttribute]
  }
  @scala.inline
  implicit class ParameterAttributeOps[Self <: ParameterAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: attributeNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringValue(value: attributeValueString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

