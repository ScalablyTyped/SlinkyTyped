package typingsSlinky.apolloUtilities.anon

import typingsSlinky.graphql.astMod.ArgumentNode
import typingsSlinky.graphql.astMod.DirectiveNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Directive extends js.Object {
  var directive: DirectiveNode = js.native
  var ifArgument: ArgumentNode = js.native
}

object Directive {
  @scala.inline
  def apply(directive: DirectiveNode, ifArgument: ArgumentNode): Directive = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], ifArgument = ifArgument.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
  @scala.inline
  implicit class DirectiveOps[Self <: Directive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirective(value: DirectiveNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfArgument(value: ArgumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifArgument")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

