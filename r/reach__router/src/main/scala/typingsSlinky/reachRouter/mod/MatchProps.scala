package typingsSlinky.reachRouter.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchProps[TParams] extends js.Object {
  var children: MatchRenderFn[TParams] = js.native
  var path: String = js.native
}

object MatchProps {
  @scala.inline
  def apply[TParams](children: /* props */ MatchRenderProps[TParams] => TagMod[Any], path: String): MatchProps[TParams] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchProps[TParams]]
  }
  @scala.inline
  implicit class MatchPropsOps[Self[tparams] <: MatchProps[tparams], TParams] (val x: Self[TParams]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TParams] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TParams]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TParams] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TParams] with Other]
    @scala.inline
    def withChildren(value: /* props */ MatchRenderProps[TParams] => TagMod[Any]): Self[TParams] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self[TParams] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

