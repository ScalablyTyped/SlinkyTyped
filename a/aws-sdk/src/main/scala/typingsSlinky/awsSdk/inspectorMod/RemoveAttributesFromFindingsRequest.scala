package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAttributesFromFindingsRequest extends js.Object {
  /**
    * The array of attribute keys that you want to remove from specified findings.
    */
  var attributeKeys: UserAttributeKeyList = js.native
  /**
    * The ARNs that specify the findings that you want to remove attributes from.
    */
  var findingArns: AddRemoveAttributesFindingArnList = js.native
}

object RemoveAttributesFromFindingsRequest {
  @scala.inline
  def apply(attributeKeys: UserAttributeKeyList, findingArns: AddRemoveAttributesFindingArnList): RemoveAttributesFromFindingsRequest = {
    val __obj = js.Dynamic.literal(attributeKeys = attributeKeys.asInstanceOf[js.Any], findingArns = findingArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesFromFindingsRequest]
  }
  @scala.inline
  implicit class RemoveAttributesFromFindingsRequestOps[Self <: RemoveAttributesFromFindingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeKeys(value: UserAttributeKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindingArns(value: AddRemoveAttributesFindingArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingArns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

