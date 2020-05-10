package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkAttributeAction extends js.Object {
  /**
    * A type that can be either UPDATE_OR_CREATE or DELETE.
    */
  var AttributeActionType: js.UndefOr[UpdateActionType] = js.native
  /**
    * The value that you want to update to.
    */
  var AttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.native
}

object LinkAttributeAction {
  @scala.inline
  def apply(): LinkAttributeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAttributeAction]
  }
  @scala.inline
  implicit class LinkAttributeActionOps[Self <: LinkAttributeAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeActionType(value: UpdateActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeActionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeActionType")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeUpdateValue(value: TypedAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeUpdateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeUpdateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeUpdateValue")(js.undefined)
        ret
    }
  }
  
}

