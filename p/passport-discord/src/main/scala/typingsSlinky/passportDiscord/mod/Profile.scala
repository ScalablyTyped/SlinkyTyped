package typingsSlinky.passportDiscord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile
  extends typingsSlinky.passport.mod.Profile {
  var avatar: String = js.native
   // requires "email" scope
  var connections: js.UndefOr[js.Array[ConnectionInfo]] = js.native
  var discriminator: String = js.native
  var email: js.UndefOr[String] = js.native
  var fetchedAt: String = js.native
  var flags: Double = js.native
   // requires "connection" scope
  var guilds: js.UndefOr[js.Array[GuildInfo]] = js.native
  var locale: String = js.native
  var mfa_enabled: Boolean = js.native
  var verified: Boolean = js.native
}

object Profile {
  @scala.inline
  def apply(
    avatar: String,
    discriminator: String,
    displayName: String,
    fetchedAt: String,
    flags: Double,
    id: String,
    locale: String,
    mfa_enabled: Boolean,
    provider: String,
    verified: Boolean
  ): Profile = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], discriminator = discriminator.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fetchedAt = fetchedAt.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mfa_enabled = mfa_enabled.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscriminator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMfa_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfa_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnections(value: js.Array[ConnectionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withGuilds(value: js.Array[GuildInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guilds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuilds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guilds")(js.undefined)
        ret
    }
  }
  
}

