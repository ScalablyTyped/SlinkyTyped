package typingsSlinky.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the current platform that the user is playing on.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.IOS
  - typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.ANDROID
  - typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.WEB
  - typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.MOBILE_WEB
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  def ANDROID: typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.ANDROID = this.cast("ANDROID")
  @scala.inline
  def IOS: typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.IOS = this.cast("IOS")
  @scala.inline
  def MOBILE_WEB: typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.MOBILE_WEB = this.cast("MOBILE_WEB")
  @scala.inline
  def WEB: typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.WEB = this.cast("WEB")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

