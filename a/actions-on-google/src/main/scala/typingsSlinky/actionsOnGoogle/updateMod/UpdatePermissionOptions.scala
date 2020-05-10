package typingsSlinky.actionsOnGoogle.updateMod

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2Argument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePermissionOptions extends js.Object {
  /**
    * The necessary arguments to fulfill the intent triggered on update.
    * These can be retrieved using {@link Arguments#get|conv.arguments.get}.
    * @public
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.native
  /**
    * The Dialogflow/Actions SDK intent name to be triggered when the update is received.
    * @public
    */
  var intent: String = js.native
}

object UpdatePermissionOptions {
  @scala.inline
  def apply(intent: String): UpdatePermissionOptions = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePermissionOptions]
  }
  @scala.inline
  implicit class UpdatePermissionOptionsOps[Self <: UpdatePermissionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

