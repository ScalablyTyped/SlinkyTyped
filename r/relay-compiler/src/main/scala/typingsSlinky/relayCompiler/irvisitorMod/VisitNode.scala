package typingsSlinky.relayCompiler.irvisitorMod

import typingsSlinky.relayCompiler.iRMod.Argument
import typingsSlinky.relayCompiler.iRMod.ClientExtension
import typingsSlinky.relayCompiler.iRMod.Condition
import typingsSlinky.relayCompiler.iRMod.Defer
import typingsSlinky.relayCompiler.iRMod.Directive
import typingsSlinky.relayCompiler.iRMod.Fragment
import typingsSlinky.relayCompiler.iRMod.FragmentSpread
import typingsSlinky.relayCompiler.iRMod.InlineDataFragmentSpread
import typingsSlinky.relayCompiler.iRMod.InlineFragment
import typingsSlinky.relayCompiler.iRMod.LinkedField
import typingsSlinky.relayCompiler.iRMod.Literal
import typingsSlinky.relayCompiler.iRMod.LocalArgumentDefinition
import typingsSlinky.relayCompiler.iRMod.ModuleImport
import typingsSlinky.relayCompiler.iRMod.Request
import typingsSlinky.relayCompiler.iRMod.Root
import typingsSlinky.relayCompiler.iRMod.RootArgumentDefinition
import typingsSlinky.relayCompiler.iRMod.ScalarField
import typingsSlinky.relayCompiler.iRMod.SplitOperation
import typingsSlinky.relayCompiler.iRMod.Stream
import typingsSlinky.relayCompiler.iRMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.Argument
  - typingsSlinky.relayCompiler.iRMod.ClientExtension
  - typingsSlinky.relayCompiler.iRMod.Condition
  - typingsSlinky.relayCompiler.iRMod.Defer
  - typingsSlinky.relayCompiler.iRMod.Directive
  - typingsSlinky.relayCompiler.iRMod.Fragment
  - typingsSlinky.relayCompiler.iRMod.FragmentSpread
  - typingsSlinky.relayCompiler.iRMod.InlineDataFragmentSpread
  - typingsSlinky.relayCompiler.iRMod.InlineFragment
  - typingsSlinky.relayCompiler.iRMod.LinkedField
  - typingsSlinky.relayCompiler.iRMod.Literal
  - typingsSlinky.relayCompiler.iRMod.LocalArgumentDefinition
  - typingsSlinky.relayCompiler.iRMod.ModuleImport
  - typingsSlinky.relayCompiler.iRMod.Request
  - typingsSlinky.relayCompiler.iRMod.Root
  - typingsSlinky.relayCompiler.iRMod.RootArgumentDefinition
  - typingsSlinky.relayCompiler.iRMod.ScalarField
  - typingsSlinky.relayCompiler.iRMod.SplitOperation
  - typingsSlinky.relayCompiler.iRMod.Stream
  - typingsSlinky.relayCompiler.iRMod.Variable
*/
trait VisitNode extends js.Object

object VisitNode {
  @scala.inline
  implicit def apply(value: Argument): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: ClientExtension): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: Condition): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: Defer): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: Directive): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: Fragment): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: FragmentSpread): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: InlineDataFragmentSpread): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: InlineFragment): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: LinkedField): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: Literal): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: LocalArgumentDefinition): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: ModuleImport): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: Request): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: Root): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: RootArgumentDefinition): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: ScalarField): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: SplitOperation): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: Stream): VisitNode = value.asInstanceOf[VisitNode]
  @scala.inline
  implicit def apply(value: Variable): VisitNode = value.asInstanceOf[VisitNode]
}

