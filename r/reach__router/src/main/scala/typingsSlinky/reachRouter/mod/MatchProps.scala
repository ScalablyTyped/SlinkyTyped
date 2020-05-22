package typingsSlinky.reachRouter.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchProps[TParams] extends js.Object {
  var children: MatchRenderFn[TParams]
  var path: String
}

object MatchProps {
  @scala.inline
  def apply[TParams](children: /* props */ MatchRenderProps[TParams] => TagMod[Any], path: String): MatchProps[TParams] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchProps[TParams]]
  }
}

