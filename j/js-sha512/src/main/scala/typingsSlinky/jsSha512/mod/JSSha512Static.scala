package typingsSlinky.jsSha512.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSSha512Static extends HashStatic {
  
  def sha384(messageToHash: String): String = js.native
  @JSName("sha384")
  var sha384_Original: HashStatic = js.native
  
  def sha512(messageToHash: String): String = js.native
  
  def sha512_224(messageToHash: String): String = js.native
  @JSName("sha512_224")
  var sha512_224_Original: HashStatic = js.native
  
  def sha512_256(messageToHash: String): String = js.native
  @JSName("sha512_256")
  var sha512_256_Original: HashStatic = js.native
  
  @JSName("sha512")
  var sha512_Original: HashStatic = js.native
}
