package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactionsDeleteParams extends js.Object {
  var reaction_id: Double = js.native
}

object ReactionsDeleteParams {
  @scala.inline
  def apply(reaction_id: Double): ReactionsDeleteParams = {
    val __obj = js.Dynamic.literal(reaction_id = reaction_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteParams]
  }
  @scala.inline
  implicit class ReactionsDeleteParamsOps[Self <: ReactionsDeleteParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReaction_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reaction_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

