package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.anon.Message
  - typingsSlinky.reactNative.anon.Title
*/
trait ShareContent extends js.Object
object ShareContent {
  
  @scala.inline
  def Message(message: String): ShareContent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
  
  @scala.inline
  def Title(url: String): ShareContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
}
