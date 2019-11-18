package typingsSlinky.atAngularCompiler.srcUtilMod

import typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/util", "syntaxError")
@js.native
object syntaxError extends js.Object {
  def apply(msg: String): js.Error = js.native
  def apply(msg: String, parseErrors: js.Array[ParseError]): js.Error = js.native
}

