package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.astMod.TemplateBindingIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "ExpressionBinding")
@js.native
class ExpressionBinding protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.ExpressionBinding {
  /**
    * @param sourceSpan entire span of the binding.
    * @param key binding name, like ngForOf, ngForTrackBy, ngIf, along with its
    * span. Note that the length of the span may not be the same as
    * `key.source.length`. For example,
    * 1. key.source = ngFor, key.span is for "ngFor"
    * 2. key.source = ngForOf, key.span is for "of"
    * 3. key.source = ngForTrackBy, key.span is for "trackBy"
    * @param value optional expression for the RHS.
    */
  def this(
    sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan,
    key: TemplateBindingIdentifier
  ) = this()
  def this(
    sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan,
    key: TemplateBindingIdentifier,
    value: typingsSlinky.angularCompiler.astMod.ASTWithSource
  ) = this()
}
