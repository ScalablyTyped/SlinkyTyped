package typingsSlinky.apolloUtilities

import typingsSlinky.graphql.astMod.ArgumentNode
import typingsSlinky.graphql.astMod.DirectiveNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirective extends js.Object {
  var directive: DirectiveNode
  var ifArgument: ArgumentNode
}

object AnonDirective {
  @scala.inline
  def apply(directive: DirectiveNode, ifArgument: ArgumentNode): AnonDirective = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], ifArgument = ifArgument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirective]
  }
}

