package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.ionicStrings.ios
  - typings.ionic.ionicStrings.android
  - typings.ionic.ionicStrings.wp8
  - typings.ionic.ionicStrings.windows
  - typings.ionic.ionicStrings.browser
*/
trait KnownPlatform extends js.Object

object KnownPlatform {
  @scala.inline
  def android: typingsSlinky.ionic.ionicStrings.android = this.cast("android")
  @scala.inline
  def browser: typingsSlinky.ionic.ionicStrings.browser = this.cast("browser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ios: typingsSlinky.ionic.ionicStrings.ios = this.cast("ios")
  @scala.inline
  def windows: typingsSlinky.ionic.ionicStrings.windows = this.cast("windows")
  @scala.inline
  def wp8: typingsSlinky.ionic.ionicStrings.wp8 = this.cast("wp8")
}

