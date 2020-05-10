package typingsSlinky.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactionMixin extends js.Object {
  val reactions: js.Array[Reaction] = js.native
}

object ReactionMixin {
  @scala.inline
  def apply(reactions: js.Array[Reaction]): ReactionMixin = {
    val __obj = js.Dynamic.literal(reactions = reactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionMixin]
  }
  @scala.inline
  implicit class ReactionMixinOps[Self <: ReactionMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReactions(value: js.Array[Reaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

