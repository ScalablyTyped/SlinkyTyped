package typingsSlinky.ghauth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthOptions extends js.Object {
  /**
    * @default "https://api.github.com/authorizations"
    */
  var authUrl: js.UndefOr[String] = js.native
  var configName: String = js.native
  /**
    * @default false
    */
  var noSave: js.UndefOr[Boolean] = js.native
  /**
    * @default "Node.js command-line app with ghauth"
    */
  var note: js.UndefOr[String] = js.native
  /**
    * @default "GitHub"
    */
  var promptName: js.UndefOr[String] = js.native
  /**
    * @default []
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * @default "Magic Node.js application that does magic things with ghauth"
    */
  var userAgent: js.UndefOr[String] = js.native
}

object AuthOptions {
  @scala.inline
  def apply(configName: String): AuthOptions = {
    val __obj = js.Dynamic.literal(configName = configName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSave")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptName")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
  }
  
}

