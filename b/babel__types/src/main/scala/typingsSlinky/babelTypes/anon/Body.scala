package typingsSlinky.babelTypes.anon

import typingsSlinky.babelTypes.mod.BlockStatement_
import typingsSlinky.babelTypes.mod.Expression
import typingsSlinky.babelTypes.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: BlockStatement_ | Statement | Expression
}

object Body {
  @scala.inline
  def apply(body: BlockStatement_ | Statement | Expression): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

