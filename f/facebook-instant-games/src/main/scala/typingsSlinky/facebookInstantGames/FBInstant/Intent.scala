package typingsSlinky.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.INVITE
  - typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.REQUEST
  - typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.CHALLENGE
  - typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.SHARE
*/
trait Intent extends js.Object

object Intent {
  @scala.inline
  def CHALLENGE: typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.CHALLENGE = this.cast("CHALLENGE")
  @scala.inline
  def INVITE: typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.INVITE = this.cast("INVITE")
  @scala.inline
  def REQUEST: typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.REQUEST = this.cast("REQUEST")
  @scala.inline
  def SHARE: typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.SHARE = this.cast("SHARE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

