package typingsSlinky.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "Token")
@js.native
class Token protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.Token {
  def this(
    index: Double,
    end: Double,
    `type`: typingsSlinky.angularCompiler.lexerMod.TokenType,
    numValue: Double,
    strValue: String
  ) = this()
}

