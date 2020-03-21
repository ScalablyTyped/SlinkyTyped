package typingsSlinky.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.POST
  - typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.THREAD
  - typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.GROUP
  - typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.SOLO
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def GROUP: typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.GROUP = this.cast("GROUP")
  @scala.inline
  def POST: typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.POST = this.cast("POST")
  @scala.inline
  def SOLO: typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.SOLO = this.cast("SOLO")
  @scala.inline
  def THREAD: typingsSlinky.facebookInstantGames.facebookInstantGamesStrings.THREAD = this.cast("THREAD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

