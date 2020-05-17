package typingsSlinky.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.ClientExtension
  - typingsSlinky.relayCompiler.iRMod.Condition
  - typingsSlinky.relayCompiler.iRMod.Defer
  - typingsSlinky.relayCompiler.iRMod.FragmentSpread
  - typingsSlinky.relayCompiler.iRMod.InlineFragment
  - typingsSlinky.relayCompiler.iRMod.LinkedField
  - typingsSlinky.relayCompiler.iRMod.ModuleImport
  - typingsSlinky.relayCompiler.iRMod.ScalarField
  - typingsSlinky.relayCompiler.iRMod.InlineDataFragmentSpread
  - typingsSlinky.relayCompiler.iRMod.Stream
*/
trait Selection extends js.Object

object Selection {
  @scala.inline
  implicit def apply(value: ClientExtension): Selection = value.asInstanceOf[Selection]
  @scala.inline
  implicit def apply(value: Condition): Selection = value.asInstanceOf[Selection]
  @scala.inline
  implicit def apply(value: Defer): Selection = value.asInstanceOf[Selection]
  @scala.inline
  implicit def apply(value: FragmentSpread): Selection = value.asInstanceOf[Selection]
  @scala.inline
  implicit def apply(value: InlineDataFragmentSpread): Selection = value.asInstanceOf[Selection]
  @scala.inline
  implicit def apply(value: InlineFragment): Selection = value.asInstanceOf[Selection]
  @scala.inline
  implicit def apply(value: LinkedField): Selection = value.asInstanceOf[Selection]
  @scala.inline
  implicit def apply(value: ModuleImport): Selection = value.asInstanceOf[Selection]
  @scala.inline
  implicit def apply(value: ScalarField): Selection = value.asInstanceOf[Selection]
  @scala.inline
  implicit def apply(value: Stream): Selection = value.asInstanceOf[Selection]
}

