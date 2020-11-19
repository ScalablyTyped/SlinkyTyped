package typingsSlinky.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "WrappedNodeExpr")
@js.native
class WrappedNodeExpr[T] protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.WrappedNodeExpr[T] {
  def this(node: T) = this()
  def this(node: T, `type`: typingsSlinky.angularCompiler.outputAstMod.Type) = this()
  def this(
    node: T,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(node: T, `type`: Null, sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(
    node: T,
    `type`: typingsSlinky.angularCompiler.outputAstMod.Type,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
