package typingsSlinky.reactFromDom.mod

import org.scalajs.dom.raw.Node
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAction extends js.Object {
  var post: js.UndefOr[js.Function3[/* node */ Node, /* key */ String, /* level */ Double, TagMod[Any]]] = js.undefined
  var pre: js.UndefOr[js.Function3[/* node */ Node, /* key */ String, /* level */ Double, Node]] = js.undefined
  def condition(node: Node, key: String, level: Double): Boolean
}

object IAction {
  @scala.inline
  def apply(
    condition: (Node, String, Double) => Boolean,
    post: (/* node */ Node, /* key */ String, /* level */ Double) => TagMod[Any] = null,
    pre: (/* node */ Node, /* key */ String, /* level */ Double) => Node = null
  ): IAction = {
    val __obj = js.Dynamic.literal(condition = js.Any.fromFunction3(condition))
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction3(post))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction3(pre))
    __obj.asInstanceOf[IAction]
  }
}

