package typingsSlinky.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "Token")
@js.native
class Token protected ()
  extends typingsSlinky.angularCompiler.compilerMod.Token {
  def this(
    index: Double,
    end: Double,
    `type`: typingsSlinky.angularCompiler.lexerMod.TokenType,
    numValue: Double,
    strValue: String
  ) = this()
}
