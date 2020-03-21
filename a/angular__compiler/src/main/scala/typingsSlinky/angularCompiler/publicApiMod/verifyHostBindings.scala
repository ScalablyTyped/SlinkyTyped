package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.viewCompilerMod.ParsedHostBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "verifyHostBindings")
@js.native
object verifyHostBindings extends js.Object {
  def apply(
    bindings: ParsedHostBindings,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): js.Array[typingsSlinky.angularCompiler.srcParseUtilMod.ParseError] = js.native
}

