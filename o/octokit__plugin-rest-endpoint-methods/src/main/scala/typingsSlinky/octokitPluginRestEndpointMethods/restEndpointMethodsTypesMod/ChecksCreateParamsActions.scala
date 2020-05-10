package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksCreateParamsActions extends js.Object {
  /**
    * A short explanation of what this action would do. The maximum size is 40 characters.
    */
  var description: String = js.native
  /**
    * A reference for the action on the integrator's system. The maximum size is 20 characters.
    */
  var identifier: String = js.native
  /**
    * The text to be displayed on a button in the web UI. The maximum size is 20 characters.
    */
  var label: String = js.native
}

object ChecksCreateParamsActions {
  @scala.inline
  def apply(description: String, identifier: String, label: String): ChecksCreateParamsActions = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateParamsActions]
  }
  @scala.inline
  implicit class ChecksCreateParamsActionsOps[Self <: ChecksCreateParamsActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

