package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProjectidAnonRequired extends js.Object {
  var project_id: AnonRequired = js.native
}

object AnonProjectidAnonRequired {
  @scala.inline
  def apply(project_id: AnonRequired): AnonProjectidAnonRequired = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjectidAnonRequired]
  }
  @scala.inline
  implicit class AnonProjectidAnonRequiredOps[Self <: AnonProjectidAnonRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProject_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

