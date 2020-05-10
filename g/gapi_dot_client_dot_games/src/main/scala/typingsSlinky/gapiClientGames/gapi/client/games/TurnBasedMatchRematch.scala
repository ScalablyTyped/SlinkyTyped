package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurnBasedMatchRematch extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchRematch. */
  var kind: js.UndefOr[String] = js.native
  /** The old match that the rematch was created from; will be updated such that the rematchId field will point at the new match. */
  var previousMatch: js.UndefOr[TurnBasedMatch] = js.native
  /** The newly created match; a rematch of the old match with the same participants. */
  var rematch: js.UndefOr[TurnBasedMatch] = js.native
}

object TurnBasedMatchRematch {
  @scala.inline
  def apply(): TurnBasedMatchRematch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TurnBasedMatchRematch]
  }
  @scala.inline
  implicit class TurnBasedMatchRematchOps[Self <: TurnBasedMatchRematch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPreviousMatch(value: TurnBasedMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withRematch(value: TurnBasedMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rematch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRematch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rematch")(js.undefined)
        ret
    }
  }
  
}

