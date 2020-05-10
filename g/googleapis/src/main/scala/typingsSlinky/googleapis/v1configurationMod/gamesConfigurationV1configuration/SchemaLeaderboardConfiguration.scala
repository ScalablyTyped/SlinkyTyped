package typingsSlinky.googleapis.v1configurationMod.gamesConfigurationV1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an leaderboard configuration resource.
  */
@js.native
trait SchemaLeaderboardConfiguration extends js.Object {
  /**
    * The draft data of the leaderboard.
    */
  var draft: js.UndefOr[SchemaLeaderboardConfigurationDetail] = js.native
  /**
    * The ID of the leaderboard.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#leaderboardConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The read-only published data of the leaderboard.
    */
  var published: js.UndefOr[SchemaLeaderboardConfigurationDetail] = js.native
  /**
    * Maximum score that can be posted to this leaderboard.
    */
  var scoreMax: js.UndefOr[String] = js.native
  /**
    * Minimum score that can be posted to this leaderboard.
    */
  var scoreMin: js.UndefOr[String] = js.native
  /**
    * The type of the leaderboard. Possible values are:   -
    * &quot;LARGER_IS_BETTER&quot; - Larger scores posted are ranked higher.  -
    * &quot;SMALLER_IS_BETTER&quot; - Smaller scores posted are ranked higher.
    */
  var scoreOrder: js.UndefOr[String] = js.native
  /**
    * The token for this resource.
    */
  var token: js.UndefOr[String] = js.native
}

object SchemaLeaderboardConfiguration {
  @scala.inline
  def apply(): SchemaLeaderboardConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardConfiguration]
  }
  @scala.inline
  implicit class SchemaLeaderboardConfigurationOps[Self <: SchemaLeaderboardConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraft(value: SchemaLeaderboardConfigurationDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(js.undefined)
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
    def withPublished(value: SchemaLeaderboardConfigurationDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(js.undefined)
        ret
    }
    @scala.inline
    def withScoreMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoreMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreMax")(js.undefined)
        ret
    }
    @scala.inline
    def withScoreMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoreMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreMin")(js.undefined)
        ret
    }
    @scala.inline
    def withScoreOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoreOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

