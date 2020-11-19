package typingsSlinky.angularCompiler.srcUtilMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/util", "syntaxError")
@js.native
object syntaxError extends js.Object {
  
  def apply(msg: String): js.Error = js.native
  def apply(msg: String, parseErrors: js.Array[ParseError]): js.Error = js.native
}
