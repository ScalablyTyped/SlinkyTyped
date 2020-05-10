package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action executed during setup.
  */
@js.native
trait SchemaSetupAction extends js.Object {
  /**
    * Description of this action.
    */
  var description: js.UndefOr[SchemaUserFacingMessage] = js.native
  /**
    * An action to launch an app.
    */
  var launchApp: js.UndefOr[SchemaLaunchAppAction] = js.native
  /**
    * Title of this action.
    */
  var title: js.UndefOr[SchemaUserFacingMessage] = js.native
}

object SchemaSetupAction {
  @scala.inline
  def apply(): SchemaSetupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetupAction]
  }
  @scala.inline
  implicit class SchemaSetupActionOps[Self <: SchemaSetupAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: SchemaUserFacingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchApp(value: SchemaLaunchAppAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchApp")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: SchemaUserFacingMessage): Self = {
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
  }
  
}

