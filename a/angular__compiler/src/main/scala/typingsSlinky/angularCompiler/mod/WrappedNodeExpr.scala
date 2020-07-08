package typingsSlinky.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "WrappedNodeExpr")
@js.native
class WrappedNodeExpr[T] protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.WrappedNodeExpr[T] {
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

