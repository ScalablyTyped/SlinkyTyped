package typingsSlinky.oracleOraclejet.anon

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsInitial extends js.Object {
  var isInitial: Boolean = js.native
  var newViewModel: js.Object = js.native
  var node: Node = js.native
  var oldViewModel: js.Object = js.native
}

object IsInitial {
  @scala.inline
  def apply(isInitial: Boolean, newViewModel: js.Object, node: Node, oldViewModel: js.Object): IsInitial = {
    val __obj = js.Dynamic.literal(isInitial = isInitial.asInstanceOf[js.Any], newViewModel = newViewModel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldViewModel = oldViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInitial]
  }
  @scala.inline
  implicit class IsInitialOps[Self <: IsInitial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsInitial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewViewModel(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newViewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldViewModel(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldViewModel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

