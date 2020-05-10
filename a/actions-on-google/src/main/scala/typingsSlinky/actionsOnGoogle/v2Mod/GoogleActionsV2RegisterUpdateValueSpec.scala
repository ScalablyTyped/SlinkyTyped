package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2RegisterUpdateValueSpec extends js.Object {
  /**
    * The list of arguments to necessary to fulfill an update.
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.native
  /**
    * The intent that the user wants to get updates from.
    */
  var intent: js.UndefOr[String] = js.native
  /**
    * The trigger context that defines how the update will be triggered.
    * This may modify the dialog in order to narrow down the user's preferences
    * for getting his or her updates.
    */
  var triggerContext: js.UndefOr[GoogleActionsV2TriggerContext] = js.native
}

object GoogleActionsV2RegisterUpdateValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2RegisterUpdateValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RegisterUpdateValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2RegisterUpdateValueSpecOps[Self <: GoogleActionsV2RegisterUpdateValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: js.Array[GoogleActionsV2Argument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerContext(value: GoogleActionsV2TriggerContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerContext")(js.undefined)
        ret
    }
  }
  
}

