package typingsSlinky.deezerDashSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
  */
/* Rewritten from type alias, can be one of: 
  - typings.deezerDashSdk.deezerDashSdkStrings.light
  - typings.deezerDashSdk.deezerDashSdkStrings.dark
*/
trait WidgetLayout extends js.Object

object WidgetLayout {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typingsSlinky.deezerDashSdk.deezerDashSdkStrings.dark = this.cast("dark")
  @scala.inline
  def light: typingsSlinky.deezerDashSdk.deezerDashSdkStrings.light = this.cast("light")
}

