package typingsSlinky.angularCompiler.srcUtilMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/util", "getParseErrors")
@js.native
object getParseErrors extends js.Object {
  def apply(error: js.Error): js.Array[ParseError] = js.native
}

