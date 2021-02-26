package typingsSlinky.protobufjs.lightMod

import typingsSlinky.protobufjs.mod.ITokenizerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenize {
  
  @JSImport("protobufjs/light", "tokenize")
  @js.native
  def apply(source: String, alternateCommentMode: Boolean): ITokenizerHandle = js.native
  
  /**
    * Unescapes a string.
    * @param str String to unescape
    * @returns Unescaped string
    */
  @JSImport("protobufjs/light", "tokenize.unescape")
  @js.native
  def unescape(str: String): String = js.native
}
