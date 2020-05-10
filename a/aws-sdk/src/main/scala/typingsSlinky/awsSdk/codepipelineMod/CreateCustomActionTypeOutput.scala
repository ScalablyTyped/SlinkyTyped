package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomActionTypeOutput extends js.Object {
  /**
    * Returns information about the details of an action type.
    */
  var actionType: ActionType = js.native
  /**
    * Specifies the tags applied to the custom action.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateCustomActionTypeOutput {
  @scala.inline
  def apply(actionType: ActionType): CreateCustomActionTypeOutput = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomActionTypeOutput]
  }
  @scala.inline
  implicit class CreateCustomActionTypeOutputOps[Self <: CreateCustomActionTypeOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: ActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

