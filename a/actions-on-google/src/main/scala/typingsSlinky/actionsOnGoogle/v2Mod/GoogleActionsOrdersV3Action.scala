package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3Action extends js.Object {
  /**
    * Metadata associated with an action.
    */
  var actionMetadata: js.UndefOr[GoogleActionsOrdersV3ActionActionMetadata] = js.native
  /**
    * Action to take.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.native
  /**
    * Title or label of the action, displayed to the user.
    * Max allowed length is 100 chars.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Required: Type of action.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3ActionType] = js.native
}

object GoogleActionsOrdersV3Action {
  @scala.inline
  def apply(): GoogleActionsOrdersV3Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Action]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3ActionOps[Self <: GoogleActionsOrdersV3Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionMetadata(value: GoogleActionsOrdersV3ActionActionMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUrlAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenUrlAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUrlAction")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsOrdersV3ActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

