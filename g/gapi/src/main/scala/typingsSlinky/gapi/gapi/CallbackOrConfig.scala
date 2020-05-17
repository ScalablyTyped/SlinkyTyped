package typingsSlinky.gapi.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gapi.gapi.LoadConfig
  - typingsSlinky.gapi.gapi.LoadCallback
*/
trait CallbackOrConfig extends js.Object

object CallbackOrConfig {
  @scala.inline
  implicit def apply(value: LoadCallback): CallbackOrConfig = value.asInstanceOf[CallbackOrConfig]
  @scala.inline
  implicit def apply(value: LoadConfig): CallbackOrConfig = value.asInstanceOf[CallbackOrConfig]
}

