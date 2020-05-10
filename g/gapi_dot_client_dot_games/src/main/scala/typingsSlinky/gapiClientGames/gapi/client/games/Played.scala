package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Played extends js.Object {
  /** True if the player was auto-matched with the currently authenticated user. */
  var autoMatched: js.UndefOr[Boolean] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#played. */
  var kind: js.UndefOr[String] = js.native
  /** The last time the player played the game in milliseconds since the epoch in UTC. */
  var timeMillis: js.UndefOr[String] = js.native
}

object Played {
  @scala.inline
  def apply(): Played = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Played]
  }
  @scala.inline
  implicit class PlayedOps[Self <: Played] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMatched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMatched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatched")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMillis")(js.undefined)
        ret
    }
  }
  
}

