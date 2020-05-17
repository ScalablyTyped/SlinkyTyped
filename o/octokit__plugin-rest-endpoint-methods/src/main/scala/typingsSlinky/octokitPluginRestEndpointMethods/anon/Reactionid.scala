package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reactionid extends js.Object {
  var reaction_id: Required = js.native
}

object Reactionid {
  @scala.inline
  def apply(reaction_id: Required): Reactionid = {
    val __obj = js.Dynamic.literal(reaction_id = reaction_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reactionid]
  }
  @scala.inline
  implicit class ReactionidOps[Self <: Reactionid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReaction_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reaction_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

