package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "syntaxError")
@js.native
object syntaxError extends js.Object {
  def apply(msg: String): js.Error = js.native
  def apply(
    msg: String,
    parseErrors: js.Array[typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ): js.Error = js.native
}

