package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2NewSurfaceValueSpec extends js.Object {
  /**
    * The list of capabilities required from the surface. Eg,
    * [\"actions.capability.SCREEN_OUTPUT\"]
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  /**
    * Context describing the content the user will receive on the new surface.
    * Eg, \"[Sure, I know of 10 that are really popular. The highest-rated one is
    * at Mount Marcy.] Is it okay if I send that to your phone?\"
    */
  var context: js.UndefOr[String] = js.native
  /**
    * Title of the notification which prompts the user to continue on the new
    * surface.
    */
  var notificationTitle: js.UndefOr[String] = js.native
}

object GoogleActionsV2NewSurfaceValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2NewSurfaceValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2NewSurfaceValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2NewSurfaceValueSpecOps[Self <: GoogleActionsV2NewSurfaceValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTitle")(js.undefined)
        ret
    }
  }
  
}

