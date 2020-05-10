package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typingsSlinky.gapiClientGamesmanagement.AnonFamilyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Player extends js.Object {
  /** The base URL for the image that represents the player. */
  var avatarImageUrl: js.UndefOr[String] = js.native
  /** The url to the landscape mode player banner image. */
  var bannerUrlLandscape: js.UndefOr[String] = js.native
  /** The url to the portrait mode player banner image. */
  var bannerUrlPortrait: js.UndefOr[String] = js.native
  /** The name to display for the player. */
  var displayName: js.UndefOr[String] = js.native
  /** An object to represent Play Game experience information for the player. */
  var experienceInfo: js.UndefOr[GamesPlayerExperienceInfoResource] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#player. */
  var kind: js.UndefOr[String] = js.native
  /**
    * Details about the last time this player played a multiplayer game with the currently authenticated player. Populated for PLAYED_WITH player collection
    * members.
    */
  var lastPlayedWith: js.UndefOr[GamesPlayedResource] = js.native
  /** An object representation of the individual components of the player's name. For some players, these fields may not be present. */
  var name: js.UndefOr[AnonFamilyName] = js.native
  /**
    * The player ID that was used for this player the first time they signed into the game in question. This is only populated for calls to player.get for
    * the requesting player, only if the player ID has subsequently changed, and only to clients that support remapping player IDs.
    */
  var originalPlayerId: js.UndefOr[String] = js.native
  /** The ID of the player. */
  var playerId: js.UndefOr[String] = js.native
  /** The player's profile settings. Controls whether or not the player's profile is visible to other players. */
  var profileSettings: js.UndefOr[ProfileSettings] = js.native
  /** The player's title rewarded for their game activities. */
  var title: js.UndefOr[String] = js.native
}

object Player {
  @scala.inline
  def apply(): Player = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Player]
  }
  @scala.inline
  implicit class PlayerOps[Self <: Player] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatarImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatarImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerUrlLandscape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerUrlLandscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerUrlLandscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerUrlLandscape")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerUrlPortrait(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerUrlPortrait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerUrlPortrait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerUrlPortrait")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withExperienceInfo(value: GamesPlayerExperienceInfoResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experienceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperienceInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experienceInfo")(js.undefined)
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
    def withLastPlayedWith(value: GamesPlayedResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPlayedWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPlayedWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPlayedWith")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: AnonFamilyName): Self = {
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
    def withOriginalPlayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPlayerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalPlayerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPlayerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerId")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileSettings(value: ProfileSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

