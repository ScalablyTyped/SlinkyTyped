package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttributeDescription extends js.Object {
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[typingsSlinky.awsSdk.elbMod.AttributeName] = js.native
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[typingsSlinky.awsSdk.elbMod.AttributeValue] = js.native
}

object PolicyAttributeDescription {
  @scala.inline
  def apply(): PolicyAttributeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAttributeDescription]
  }
  @scala.inline
  implicit class PolicyAttributeDescriptionOps[Self <: PolicyAttributeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: AttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeValue(value: AttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValue")(js.undefined)
        ret
    }
  }
  
}

