package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupAttribute extends js.Object {
  /**
    * Specifies an attribute on which to filter the events returned.
    */
  var AttributeKey: LookupAttributeKey = js.native
  /**
    * Specifies a value for the specified AttributeKey.
    */
  var AttributeValue: String = js.native
}

object LookupAttribute {
  @scala.inline
  def apply(AttributeKey: LookupAttributeKey, AttributeValue: String): LookupAttribute = {
    val __obj = js.Dynamic.literal(AttributeKey = AttributeKey.asInstanceOf[js.Any], AttributeValue = AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupAttribute]
  }
  @scala.inline
  implicit class LookupAttributeOps[Self <: LookupAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeKey(value: LookupAttributeKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

