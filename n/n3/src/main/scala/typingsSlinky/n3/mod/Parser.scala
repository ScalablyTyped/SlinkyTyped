package typingsSlinky.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "Parser")
@js.native
class Parser[Q /* <: BaseQuad */] () extends js.Object {
  def this(options: ParserOptions) = this()
  
  def parse(input: String): js.Array[Q] = js.native
  def parse(input: String, callback: ParseCallback[Q]): Unit = js.native
}
