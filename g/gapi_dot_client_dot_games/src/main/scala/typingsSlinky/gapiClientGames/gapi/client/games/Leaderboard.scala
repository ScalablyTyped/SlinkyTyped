package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Leaderboard extends js.Object {
  /** The icon for the leaderboard. */
  var iconUrl: js.UndefOr[String] = js.native
  /** The leaderboard ID. */
  var id: js.UndefOr[String] = js.native
  /** Indicates whether the icon image being returned is a default image, or is game-provided. */
  var isIconUrlDefault: js.UndefOr[Boolean] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboard. */
  var kind: js.UndefOr[String] = js.native
  /** The name of the leaderboard. */
  var name: js.UndefOr[String] = js.native
  /**
    * How scores are ordered.
    * Possible values are:
    * - "LARGER_IS_BETTER" - Larger values are better; scores are sorted in descending order.
    * - "SMALLER_IS_BETTER" - Smaller values are better; scores are sorted in ascending order.
    */
  var order: js.UndefOr[String] = js.native
}

object Leaderboard {
  @scala.inline
  def apply(): Leaderboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Leaderboard]
  }
  @scala.inline
  implicit class LeaderboardOps[Self <: Leaderboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIconUrlDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIconUrlDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIconUrlDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIconUrlDefault")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
  }
  
}

