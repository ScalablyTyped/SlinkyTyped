package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurnBasedAutoMatchingCriteria extends js.Object {
  /**
    * A bitmask indicating when auto-matches are valid. When ANDed with other exclusive bitmasks, the result must be zero. Can be used to support exclusive
    * roles within a game.
    */
  var exclusiveBitmask: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedAutoMatchingCriteria. */
  var kind: js.UndefOr[String] = js.native
  /** The maximum number of players that should be added to the match by auto-matching. */
  var maxAutoMatchingPlayers: js.UndefOr[Double] = js.native
  /** The minimum number of players that should be added to the match by auto-matching. */
  var minAutoMatchingPlayers: js.UndefOr[Double] = js.native
}

object TurnBasedAutoMatchingCriteria {
  @scala.inline
  def apply(): TurnBasedAutoMatchingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TurnBasedAutoMatchingCriteria]
  }
  @scala.inline
  implicit class TurnBasedAutoMatchingCriteriaOps[Self <: TurnBasedAutoMatchingCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusiveBitmask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveBitmask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveBitmask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveBitmask")(js.undefined)
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
    def withMaxAutoMatchingPlayers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAutoMatchingPlayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAutoMatchingPlayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAutoMatchingPlayers")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAutoMatchingPlayers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAutoMatchingPlayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAutoMatchingPlayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAutoMatchingPlayers")(js.undefined)
        ret
    }
  }
  
}

