package typingsSlinky.angularCompiler.viewCompilerMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseError
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/view/compiler", "verifyHostBindings")
@js.native
object verifyHostBindings extends js.Object {
  
  def apply(bindings: ParsedHostBindings, sourceSpan: ParseSourceSpan): js.Array[ParseError] = js.native
}
