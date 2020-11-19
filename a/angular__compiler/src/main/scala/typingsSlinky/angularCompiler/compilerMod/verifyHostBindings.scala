package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.viewCompilerMod.ParsedHostBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "verifyHostBindings")
@js.native
object verifyHostBindings extends js.Object {
  
  def apply(
    bindings: ParsedHostBindings,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): js.Array[typingsSlinky.angularCompiler.srcParseUtilMod.ParseError] = js.native
}
