package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateTagOptionFromResourceInput extends js.Object {
  /**
    * The resource identifier.
    */
  var ResourceId: typingsSlinky.awsSdk.servicecatalogMod.ResourceId = js.native
  /**
    * The TagOption identifier.
    */
  var TagOptionId: typingsSlinky.awsSdk.servicecatalogMod.TagOptionId = js.native
}

object DisassociateTagOptionFromResourceInput {
  @scala.inline
  def apply(ResourceId: ResourceId, TagOptionId: TagOptionId): DisassociateTagOptionFromResourceInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagOptionId = TagOptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTagOptionFromResourceInput]
  }
  @scala.inline
  implicit class DisassociateTagOptionFromResourceInputOps[Self <: DisassociateTagOptionFromResourceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagOptionId(value: TagOptionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagOptionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

