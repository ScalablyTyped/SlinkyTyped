package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.r3AstMod.Element
import typingsSlinky.angularCompiler.r3AstMod.Template
import typingsSlinky.angularCompiler.t2ApiMod.DirectiveMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirective[DirectiveT /* <: DirectiveMeta */] extends js.Object {
  var directive: DirectiveT
  var node: Element | Template
}

object AnonDirective {
  @scala.inline
  def apply[DirectiveT /* <: DirectiveMeta */](directive: DirectiveT, node: Element | Template): AnonDirective[DirectiveT] = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirective[DirectiveT]]
  }
}

