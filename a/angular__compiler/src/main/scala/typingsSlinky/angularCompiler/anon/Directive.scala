package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.r3AstMod.Element
import typingsSlinky.angularCompiler.r3AstMod.Template
import typingsSlinky.angularCompiler.t2ApiMod.DirectiveMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directive[DirectiveT /* <: DirectiveMeta */] extends js.Object {
  var directive: DirectiveT
  var node: Element | Template
}

object Directive {
  @scala.inline
  def apply[DirectiveT](directive: DirectiveT, node: Element | Template): Directive[DirectiveT] = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive[DirectiveT]]
  }
}

