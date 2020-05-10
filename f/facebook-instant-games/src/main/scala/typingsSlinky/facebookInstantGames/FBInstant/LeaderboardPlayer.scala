package typingsSlinky.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the player associated with a score entry.
  */
@js.native
trait LeaderboardPlayer extends js.Object {
  /**
    * Gets the game's unique identifier for the player.
    *
    * @returns The game-scoped identifier for the player.
    */
  def getID(): String | Null = js.native
  /**
    * Gets the player's localized display name.
    *
    * @returns The player's localized display name.
    */
  def getName(): String = js.native
  /**
    * Returns a url to the player's public profile photo.
    *
    * @returns Url to the player's public profile photo.
    */
  def getPhoto(): String | Null = js.native
}

object LeaderboardPlayer {
  @scala.inline
  def apply(getID: () => String | Null, getName: () => String, getPhoto: () => String | Null): LeaderboardPlayer = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID), getName = js.Any.fromFunction0(getName), getPhoto = js.Any.fromFunction0(getPhoto))
    __obj.asInstanceOf[LeaderboardPlayer]
  }
  @scala.inline
  implicit class LeaderboardPlayerOps[Self <: LeaderboardPlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetID(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPhoto(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPhoto")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

