package typingsSlinky.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteAttributesRequest extends js.Object {
  /**
    * The name of the domain in which the attributes are being deleted.
    */
  var DomainName: String = js.native
  /**
    * A list of items on which to perform the operation.
    */
  var Items: DeletableItemList = js.native
}

object BatchDeleteAttributesRequest {
  @scala.inline
  def apply(DomainName: String, Items: DeletableItemList): BatchDeleteAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteAttributesRequest]
  }
  @scala.inline
  implicit class BatchDeleteAttributesRequestOps[Self <: BatchDeleteAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: DeletableItemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

