package typingsSlinky.builderUtilRuntime.publishOptionsMod

import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.draft
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.github
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.http
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.https
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.prerelease
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.release
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GithubOptions
  extends PublishConfiguration
     with _AllPublishOptions {
  /**
    * The host (including the port if need).
    * @default github.com
    */
  val host: js.UndefOr[String | Null] = js.native
  /**
    * The owner.
    */
  val owner: js.UndefOr[String | Null] = js.native
  /**
    * Whether to use private github auto-update provider if `GH_TOKEN` environment variable is defined. See [Private GitHub Update Repo](/auto-update#private-github-update-repo).
    */
  val `private`: js.UndefOr[Boolean | Null] = js.native
  /**
    * The protocol. GitHub Publisher supports only `https`.
    * @default https
    */
  val protocol: js.UndefOr[https | http | Null] = js.native
  /**
    * The provider. Must be `github`.
    */
  @JSName("provider")
  val provider_GithubOptions: github = js.native
  /**
    * The type of release. By default `draft` release will be created.
    *
    * Also you can set release type using environment variable. If `EP_DRAFT`is set to `true` — `draft`, if `EP_PRE_RELEASE`is set to `true` — `prerelease`.
    * @default draft
    */
  var releaseType: js.UndefOr[draft | prerelease | release | Null] = js.native
  /**
    * The repository name. [Detected automatically](#github-repository-and-bintray-package).
    */
  val repo: js.UndefOr[String | Null] = js.native
  /**
    * The access token to support auto-update from private github repositories. Never specify it in the configuration files. Only for [setFeedURL](/auto-update#appupdatersetfeedurloptions).
    */
  val token: js.UndefOr[String | Null] = js.native
  /**
    * Whether to use `v`-prefixed tag name.
    * @default true
    */
  val vPrefixedTagName: js.UndefOr[Boolean] = js.native
}

object GithubOptions {
  @scala.inline
  def apply(provider: github): GithubOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GithubOptions]
  }
  @scala.inline
  implicit class GithubOptionsOps[Self <: GithubOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: github): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withHostNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(null)
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(null)
        ret
    }
    @scala.inline
    def withPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(null)
        ret
    }
    @scala.inline
    def withProtocol(value: https | http): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(null)
        ret
    }
    @scala.inline
    def withReleaseType(value: draft | prerelease | release): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseType")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseType")(null)
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(js.undefined)
        ret
    }
    @scala.inline
    def withRepoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(null)
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
    @scala.inline
    def withTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(null)
        ret
    }
    @scala.inline
    def withVPrefixedTagName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vPrefixedTagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVPrefixedTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vPrefixedTagName")(js.undefined)
        ret
    }
  }
  
}

