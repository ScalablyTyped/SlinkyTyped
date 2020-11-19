package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.astMod.TemplateBindingIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "VariableBinding")
@js.native
class VariableBinding protected ()
  extends typingsSlinky.angularCompiler.compilerMod.VariableBinding {
  /**
    * @param sourceSpan entire span of the binding.
    * @param key name of the LHS along with its span.
    * @param value optional value for the RHS along with its span.
    */
  def this(
    sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan,
    key: TemplateBindingIdentifier
  ) = this()
  def this(
    sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan,
    key: TemplateBindingIdentifier,
    value: TemplateBindingIdentifier
  ) = this()
}
