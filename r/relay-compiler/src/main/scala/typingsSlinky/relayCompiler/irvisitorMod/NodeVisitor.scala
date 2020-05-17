package typingsSlinky.relayCompiler.irvisitorMod

import typingsSlinky.relayCompiler.anon.Argument
import typingsSlinky.relayCompiler.anon.ClientExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.irvisitorMod.EnterLeave[typingsSlinky.relayCompiler.anon.Argument]
  - typingsSlinky.relayCompiler.anon.ClientExtension
*/
trait NodeVisitor extends js.Object

object NodeVisitor {
  @scala.inline
  implicit def apply(value: ClientExtension): NodeVisitor = value.asInstanceOf[NodeVisitor]
  @scala.inline
  implicit def apply(value: EnterLeave[Argument]): NodeVisitor = value.asInstanceOf[NodeVisitor]
}

