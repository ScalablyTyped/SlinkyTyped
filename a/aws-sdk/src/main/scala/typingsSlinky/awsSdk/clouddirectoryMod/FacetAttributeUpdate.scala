package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetAttributeUpdate extends js.Object {
  /**
    * The action to perform when updating the attribute.
    */
  var Action: js.UndefOr[UpdateActionType] = js.native
  /**
    * The attribute to update.
    */
  var Attribute: js.UndefOr[FacetAttribute] = js.native
}

object FacetAttributeUpdate {
  @scala.inline
  def apply(): FacetAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetAttributeUpdate]
  }
  @scala.inline
  implicit class FacetAttributeUpdateOps[Self <: FacetAttributeUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: UpdateActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withAttribute(value: FacetAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(js.undefined)
        ret
    }
  }
  
}

