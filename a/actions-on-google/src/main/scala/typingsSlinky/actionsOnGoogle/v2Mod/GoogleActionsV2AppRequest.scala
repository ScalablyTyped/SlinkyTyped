package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2AppRequest extends js.Object {
  /**
    * Surfaces available for cross surface handoff.
    */
  var availableSurfaces: js.UndefOr[js.Array[GoogleActionsV2Surface]] = js.native
  /**
    * Holds session data like the conversation ID and conversation token.
    */
  var conversation: js.UndefOr[GoogleActionsV2Conversation] = js.native
  /**
    * Information about the device the user is using to interact with the Action.
    */
  var device: js.UndefOr[GoogleActionsV2Device] = js.native
  /**
    * List of inputs corresponding to the expected inputs specified by the
    * Action. For the initial conversation trigger, the input contains
    * information on how the user triggered the conversation.
    */
  var inputs: js.UndefOr[js.Array[GoogleActionsV2Input]] = js.native
  /**
    * Indicates whether the request should be handled in sandbox mode.
    */
  var isInSandbox: js.UndefOr[Boolean] = js.native
  /**
    * Information about the surface the user is interacting with, e.g. whether it
    * can output audio or has a screen.
    */
  var surface: js.UndefOr[GoogleActionsV2Surface] = js.native
  /**
    * User who initiated the conversation.
    */
  var user: js.UndefOr[GoogleActionsV2User] = js.native
}

object GoogleActionsV2AppRequest {
  @scala.inline
  def apply(): GoogleActionsV2AppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2AppRequest]
  }
  @scala.inline
  implicit class GoogleActionsV2AppRequestOps[Self <: GoogleActionsV2AppRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableSurfaces(value: js.Array[GoogleActionsV2Surface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableSurfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableSurfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableSurfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withConversation(value: GoogleActionsV2Conversation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversation")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: GoogleActionsV2Device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[GoogleActionsV2Input]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInSandbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInSandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInSandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withSurface(value: GoogleActionsV2Surface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: GoogleActionsV2User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

