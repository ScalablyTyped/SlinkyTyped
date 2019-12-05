package typingsSlinky.facebookDashJsDashSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTauthResponseChange
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTlogout
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTlogin
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTstatusChange
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.xfbmlDOTrender
*/
trait FacebookEventType extends js.Object

object FacebookEventType {
  @scala.inline
  def authDOTauthResponseChange: typingsSlinky.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTauthResponseChange = this.cast("auth.authResponseChange")
  @scala.inline
  def authDOTlogin: typingsSlinky.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTlogin = this.cast("auth.login")
  @scala.inline
  def authDOTlogout: typingsSlinky.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTlogout = this.cast("auth.logout")
  @scala.inline
  def authDOTstatusChange: typingsSlinky.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTstatusChange = this.cast("auth.statusChange")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xfbmlDOTrender: typingsSlinky.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.xfbmlDOTrender = this.cast("xfbml.render")
}

