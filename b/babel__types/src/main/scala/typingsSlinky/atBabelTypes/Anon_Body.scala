package typingsSlinky.atBabelTypes

import typingsSlinky.atBabelTypes.atBabelTypesMod.BlockStatement
import typingsSlinky.atBabelTypes.atBabelTypesMod.Expression
import typingsSlinky.atBabelTypes.atBabelTypesMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: BlockStatement | Statement | Expression
}

object Anon_Body {
  @scala.inline
  def apply(body: BlockStatement | Statement | Expression): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Body]
  }
}

