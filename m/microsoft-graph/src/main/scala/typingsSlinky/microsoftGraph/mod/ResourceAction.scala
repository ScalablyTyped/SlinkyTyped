package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAction extends js.Object {
  // Allowed Actions
  var allowedResourceActions: js.UndefOr[js.Array[String]] = js.native
  // Not Allowed Actions
  var notAllowedResourceActions: js.UndefOr[js.Array[String]] = js.native
}

object ResourceAction {
  @scala.inline
  def apply(): ResourceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAction]
  }
  @scala.inline
  implicit class ResourceActionOps[Self <: ResourceAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedResourceActions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedResourceActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedResourceActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedResourceActions")(js.undefined)
        ret
    }
    @scala.inline
    def withNotAllowedResourceActions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAllowedResourceActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotAllowedResourceActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAllowedResourceActions")(js.undefined)
        ret
    }
  }
  
}

