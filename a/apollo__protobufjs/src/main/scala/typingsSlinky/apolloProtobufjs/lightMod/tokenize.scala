package typingsSlinky.apolloProtobufjs.lightMod

import typingsSlinky.apolloProtobufjs.mod.ITokenizerHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/light", "tokenize")
@js.native
object tokenize extends js.Object {
  
  def apply(source: String, alternateCommentMode: Boolean): ITokenizerHandle = js.native
  
  /**
    * Unescapes a string.
    * @param str String to unescape
    * @returns Unescaped string
    */
  def unescape(str: String): String = js.native
}
