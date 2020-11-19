package typingsSlinky.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "Token")
@js.native
class Token protected ()
  extends typingsSlinky.angularCompiler.lexerMod.Token {
  def this(
    index: Double,
    end: Double,
    `type`: typingsSlinky.angularCompiler.lexerMod.TokenType,
    numValue: Double,
    strValue: String
  ) = this()
}
