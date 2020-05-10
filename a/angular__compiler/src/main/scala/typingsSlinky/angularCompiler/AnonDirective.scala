package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.r3AstMod.Element
import typingsSlinky.angularCompiler.r3AstMod.Template
import typingsSlinky.angularCompiler.t2ApiMod.DirectiveMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirective[DirectiveT /* <: DirectiveMeta */] extends js.Object {
  var directive: DirectiveT = js.native
  var node: Element | Template = js.native
}

object AnonDirective {
  @scala.inline
  def apply[DirectiveT](directive: DirectiveT, node: Element | Template): AnonDirective[DirectiveT] = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirective[DirectiveT]]
  }
  @scala.inline
  implicit class AnonDirectiveOps[Self[directivet] <: AnonDirective[directivet], DirectiveT] (val x: Self[DirectiveT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DirectiveT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DirectiveT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DirectiveT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DirectiveT] with Other]
    @scala.inline
    def withDirective(value: DirectiveT): Self[DirectiveT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Element | Template): Self[DirectiveT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

