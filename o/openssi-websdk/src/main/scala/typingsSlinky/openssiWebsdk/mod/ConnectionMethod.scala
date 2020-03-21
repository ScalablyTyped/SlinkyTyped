package typingsSlinky.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.out_of_band
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.in_band
  - typingsSlinky.openssiWebsdk.openssiWebsdkStrings.invitation
*/
trait ConnectionMethod extends js.Object

object ConnectionMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def in_band: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.in_band = this.cast("in_band")
  @scala.inline
  def invitation: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.invitation = this.cast("invitation")
  @scala.inline
  def out_of_band: typingsSlinky.openssiWebsdk.openssiWebsdkStrings.out_of_band = this.cast("out_of_band")
}

