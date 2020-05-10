package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalResultAttribute extends js.Object {
  /**
    * 
    */
  var Key: String = js.native
  /**
    * 
    */
  var Value: AdditionalResultAttributeValue = js.native
  /**
    * 
    */
  var ValueType: AdditionalResultAttributeValueType = js.native
}

object AdditionalResultAttribute {
  @scala.inline
  def apply(Key: String, Value: AdditionalResultAttributeValue, ValueType: AdditionalResultAttributeValueType): AdditionalResultAttribute = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalResultAttribute]
  }
  @scala.inline
  implicit class AdditionalResultAttributeOps[Self <: AdditionalResultAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: AdditionalResultAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueType(value: AdditionalResultAttributeValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

