package typingsSlinky.reactFromDom.mod

import org.scalajs.dom.raw.Node
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAction extends js.Object {
  var post: js.UndefOr[js.Function3[/* node */ Node, /* key */ String, /* level */ Double, TagMod[Any]]] = js.native
  var pre: js.UndefOr[js.Function3[/* node */ Node, /* key */ String, /* level */ Double, Node]] = js.native
  def condition(node: Node, key: String, level: Double): Boolean = js.native
}

object IAction {
  @scala.inline
  def apply(condition: (Node, String, Double) => Boolean): IAction = {
    val __obj = js.Dynamic.literal(condition = js.Any.fromFunction3(condition))
    __obj.asInstanceOf[IAction]
  }
  @scala.inline
  implicit class IActionOps[Self <: IAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: (Node, String, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPost(value: (/* node */ Node, /* key */ String, /* level */ Double) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPre(value: (/* node */ Node, /* key */ String, /* level */ Double) => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.undefined)
        ret
    }
  }
  
}

