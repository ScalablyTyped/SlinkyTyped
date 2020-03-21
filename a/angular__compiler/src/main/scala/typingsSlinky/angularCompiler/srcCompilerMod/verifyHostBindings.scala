package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.viewCompilerMod.ParsedHostBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "verifyHostBindings")
@js.native
object verifyHostBindings extends js.Object {
  def apply(
    bindings: ParsedHostBindings,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): js.Array[typingsSlinky.angularCompiler.srcParseUtilMod.ParseError] = js.native
}

