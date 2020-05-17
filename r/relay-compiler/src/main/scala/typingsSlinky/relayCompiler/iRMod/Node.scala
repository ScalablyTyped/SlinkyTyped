package typingsSlinky.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.ClientExtension
  - typingsSlinky.relayCompiler.iRMod.Condition
  - typingsSlinky.relayCompiler.iRMod.Defer
  - typingsSlinky.relayCompiler.iRMod.Fragment
  - typingsSlinky.relayCompiler.iRMod.InlineDataFragmentSpread
  - typingsSlinky.relayCompiler.iRMod.InlineFragment
  - typingsSlinky.relayCompiler.iRMod.LinkedField
  - typingsSlinky.relayCompiler.iRMod.ModuleImport
  - typingsSlinky.relayCompiler.iRMod.Root
  - typingsSlinky.relayCompiler.iRMod.SplitOperation
  - typingsSlinky.relayCompiler.iRMod.Stream
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: ClientExtension): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Condition): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Defer): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Fragment): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: InlineDataFragmentSpread): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: InlineFragment): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: LinkedField): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: ModuleImport): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Root): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: SplitOperation): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Stream): Node = value.asInstanceOf[Node]
}

