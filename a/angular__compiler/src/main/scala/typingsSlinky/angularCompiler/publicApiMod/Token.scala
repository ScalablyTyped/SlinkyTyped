package typingsSlinky.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Token")
@js.native
class Token protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.Token {
  def this(
    index: Double,
    end: Double,
    `type`: typingsSlinky.angularCompiler.lexerMod.TokenType,
    numValue: Double,
    strValue: String
  ) = this()
}

