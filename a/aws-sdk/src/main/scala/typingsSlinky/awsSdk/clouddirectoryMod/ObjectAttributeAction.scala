package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectAttributeAction extends js.Object {
  /**
    * A type that can be either Update or Delete.
    */
  var ObjectAttributeActionType: js.UndefOr[UpdateActionType] = js.native
  /**
    * The value that you want to update to.
    */
  var ObjectAttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.native
}

object ObjectAttributeAction {
  @scala.inline
  def apply(): ObjectAttributeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectAttributeAction]
  }
  @scala.inline
  implicit class ObjectAttributeActionOps[Self <: ObjectAttributeAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectAttributeActionType(value: UpdateActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectAttributeActionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectAttributeActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectAttributeActionType")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectAttributeUpdateValue(value: TypedAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectAttributeUpdateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectAttributeUpdateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectAttributeUpdateValue")(js.undefined)
        ret
    }
  }
  
}

