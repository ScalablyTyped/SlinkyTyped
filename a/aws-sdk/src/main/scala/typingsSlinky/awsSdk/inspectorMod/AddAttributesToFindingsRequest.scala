package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAttributesToFindingsRequest extends js.Object {
  /**
    * The array of attributes that you want to assign to specified findings.
    */
  var attributes: UserAttributeList = js.native
  /**
    * The ARNs that specify the findings that you want to assign attributes to.
    */
  var findingArns: AddRemoveAttributesFindingArnList = js.native
}

object AddAttributesToFindingsRequest {
  @scala.inline
  def apply(attributes: UserAttributeList, findingArns: AddRemoveAttributesFindingArnList): AddAttributesToFindingsRequest = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], findingArns = findingArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAttributesToFindingsRequest]
  }
  @scala.inline
  implicit class AddAttributesToFindingsRequestOps[Self <: AddAttributesToFindingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: UserAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
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

