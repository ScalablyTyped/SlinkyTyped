package typingsSlinky.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/getloginstatus | DZ.getLoginStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.deezerSdk.deezerSdkStrings.connected
  - typingsSlinky.deezerSdk.deezerSdkStrings.notConnected
  - typingsSlinky.deezerSdk.deezerSdkStrings.unknown
  - typingsSlinky.deezerSdk.deezerSdkStrings.not_authorized
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.deezerSdk.deezerSdkStrings.connected = this.cast("connected")
  @scala.inline
  def notConnected: typingsSlinky.deezerSdk.deezerSdkStrings.notConnected = this.cast("notConnected")
  @scala.inline
  def not_authorized: typingsSlinky.deezerSdk.deezerSdkStrings.not_authorized = this.cast("not_authorized")
  @scala.inline
  def unknown: typingsSlinky.deezerSdk.deezerSdkStrings.unknown = this.cast("unknown")
}

