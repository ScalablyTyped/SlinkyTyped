package typingsSlinky.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "ParseLocation")
@js.native
class ParseLocation protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.ParseLocation {
  def this(
    file: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceFile,
    offset: Double,
    line: Double,
    col: Double
  ) = this()
}
