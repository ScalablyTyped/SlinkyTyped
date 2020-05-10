package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationInput extends js.Object {
  /**
    * The current name of the application you want to change.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * The new name to give the application.
    */
  var newApplicationName: js.UndefOr[ApplicationName] = js.native
}

object UpdateApplicationInput {
  @scala.inline
  def apply(): UpdateApplicationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationInput]
  }
  @scala.inline
  implicit class UpdateApplicationInputOps[Self <: UpdateApplicationInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withNewApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newApplicationName")(js.undefined)
        ret
    }
  }
  
}

