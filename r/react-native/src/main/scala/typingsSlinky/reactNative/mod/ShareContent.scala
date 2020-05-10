package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.AnonMessage
  - typingsSlinky.reactNative.AnonTitle
*/
trait ShareContent extends js.Object

object ShareContent {
  @scala.inline
  def AnonMessage(message: String): ShareContent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
  @scala.inline
  def AnonTitle(url: String): ShareContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
}

