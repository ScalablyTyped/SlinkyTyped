package typingsSlinky.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAttributesRequest extends js.Object {
  /**
    * The list of attributes.
    */
  var Attributes: ReplaceableAttributeList = js.native
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String = js.native
  /**
    * The update condition which, if specified, determines whether the specified attributes will be updated or not. The update condition must be satisfied in order for this request to be processed and the attributes to be updated.
    */
  var Expected: js.UndefOr[UpdateCondition] = js.native
  /**
    * The name of the item.
    */
  var ItemName: String = js.native
}

object PutAttributesRequest {
  @scala.inline
  def apply(Attributes: ReplaceableAttributeList, DomainName: String, ItemName: String): PutAttributesRequest = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAttributesRequest]
  }
  @scala.inline
  implicit class PutAttributesRequestOps[Self <: PutAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: ReplaceableAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpected(value: UpdateCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expected")(js.undefined)
        ret
    }
  }
  
}

