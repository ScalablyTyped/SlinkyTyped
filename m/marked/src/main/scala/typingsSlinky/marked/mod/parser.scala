package typingsSlinky.marked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "parser")
@js.native
object parser extends js.Object {
  
  /**
    * @param src Tokenized source as array of tokens
    * @param options Hash of options
    */
  def apply(src: TokensList): String = js.native
  def apply(src: TokensList, options: MarkedOptions): String = js.native
}
