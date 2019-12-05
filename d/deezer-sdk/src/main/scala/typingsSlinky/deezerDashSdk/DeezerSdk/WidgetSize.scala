package typingsSlinky.deezerDashSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
  */
/* Rewritten from type alias, can be one of: 
  - typings.deezerDashSdk.deezerDashSdkStrings.small
  - typings.deezerDashSdk.deezerDashSdkStrings.medium
  - typings.deezerDashSdk.deezerDashSdkStrings.big
*/
trait WidgetSize extends js.Object

object WidgetSize {
  @scala.inline
  def big: typingsSlinky.deezerDashSdk.deezerDashSdkStrings.big = this.cast("big")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def medium: typingsSlinky.deezerDashSdk.deezerDashSdkStrings.medium = this.cast("medium")
  @scala.inline
  def small: typingsSlinky.deezerDashSdk.deezerDashSdkStrings.small = this.cast("small")
}

