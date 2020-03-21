package typingsSlinky.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.facebookJsSdk.facebookJsSdkStrings.authDotauthResponseChange
  - typingsSlinky.facebookJsSdk.facebookJsSdkStrings.authDotlogout
  - typingsSlinky.facebookJsSdk.facebookJsSdkStrings.authDotlogin
  - typingsSlinky.facebookJsSdk.facebookJsSdkStrings.authDotstatusChange
  - typingsSlinky.facebookJsSdk.facebookJsSdkStrings.xfbmlDotrender
*/
trait FacebookEventType extends js.Object

object FacebookEventType {
  @scala.inline
  def authDotauthResponseChange: typingsSlinky.facebookJsSdk.facebookJsSdkStrings.authDotauthResponseChange = this.cast("auth.authResponseChange")
  @scala.inline
  def authDotlogin: typingsSlinky.facebookJsSdk.facebookJsSdkStrings.authDotlogin = this.cast("auth.login")
  @scala.inline
  def authDotlogout: typingsSlinky.facebookJsSdk.facebookJsSdkStrings.authDotlogout = this.cast("auth.logout")
  @scala.inline
  def authDotstatusChange: typingsSlinky.facebookJsSdk.facebookJsSdkStrings.authDotstatusChange = this.cast("auth.statusChange")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xfbmlDotrender: typingsSlinky.facebookJsSdk.facebookJsSdkStrings.xfbmlDotrender = this.cast("xfbml.render")
}

