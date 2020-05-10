package typingsSlinky.issueParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var actions: Actions = js.native
  var allRefs: js.Array[Reference | Action] = js.native
  var mentions: js.Array[Mention] = js.native
  var refs: js.Array[Reference] = js.native
}

object Result {
  @scala.inline
  def apply(
    actions: Actions,
    allRefs: js.Array[Reference | Action],
    mentions: js.Array[Mention],
    refs: js.Array[Reference]
  ): Result = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], allRefs = allRefs.asInstanceOf[js.Any], mentions = mentions.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: Actions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllRefs(value: js.Array[Reference | Action]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMentions(value: js.Array[Mention]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefs(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

