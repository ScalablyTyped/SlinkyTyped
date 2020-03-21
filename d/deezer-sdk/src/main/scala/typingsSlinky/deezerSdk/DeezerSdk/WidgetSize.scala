package typingsSlinky.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.deezerSdk.deezerSdkStrings.small
  - typingsSlinky.deezerSdk.deezerSdkStrings.medium
  - typingsSlinky.deezerSdk.deezerSdkStrings.big
*/
trait WidgetSize extends js.Object

object WidgetSize {
  @scala.inline
  def big: typingsSlinky.deezerSdk.deezerSdkStrings.big = this.cast("big")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def medium: typingsSlinky.deezerSdk.deezerSdkStrings.medium = this.cast("medium")
  @scala.inline
  def small: typingsSlinky.deezerSdk.deezerSdkStrings.small = this.cast("small")
}

