package typingsSlinky.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.reactNativeStrings.navigate
  - typingsSlinky.reactNative.reactNativeStrings.`same-origin`
  - typingsSlinky.reactNative.reactNativeStrings.`no-cors`
  - typingsSlinky.reactNative.reactNativeStrings.cors
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typingsSlinky.reactNative.reactNativeStrings.cors = this.cast("cors")
  @scala.inline
  def navigate: typingsSlinky.reactNative.reactNativeStrings.navigate = this.cast("navigate")
  @scala.inline
  def `no-cors`: typingsSlinky.reactNative.reactNativeStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typingsSlinky.reactNative.reactNativeStrings.`same-origin` = this.cast("same-origin")
}

