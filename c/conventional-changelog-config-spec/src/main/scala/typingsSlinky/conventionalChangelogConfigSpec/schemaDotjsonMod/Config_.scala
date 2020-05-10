package typingsSlinky.conventionalChangelogConfigSpec.schemaDotjsonMod

import typingsSlinky.conventionalChangelogConfigSpec.schemaDotjsonMod.Config.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the configuration options supported by conventional-config for
  * upstream tooling.
  */
@js.native
trait Config_ extends js.Object {
  /**
    * A URL representing a specific commit at a hash.
    *
    * @default
    * "{{host}}/{{owner}}/{{repository}}/commit/{{hash}}"
    */
  var commitUrlFormat: js.UndefOr[String] = js.native
  /**
    * A URL representing the comparison between two git SHAs.
    *
    * @default
    * "{{host}}/{{owner}}/{{repository}}/compare/{{previousTag}}...{{currentTag}}"
    */
  var compareUrlFormat: js.UndefOr[String] = js.native
  /**
    * A string to be used as the main header section of the CHANGELOG.
    *
    * @default
    * "# Changelog\n\n"
    */
  var header: js.UndefOr[String] = js.native
  /**
    * A URL representing the issue format (allowing a different URL format to be
    * swapped in for Gitlab, Bitbucket, etc).
    *
    * @default
    * "{{host}}/{{owner}}/{{repository}}/issues/{{id}}"
    */
  var issueUrlFormat: js.UndefOr[String] = js.native
  /**
    * Boolean indicating whether or not the action being run (generating CHANGELOG,
    * recommendedBump, etc.) is being performed for a pre-major release (<1.0.0).
    *
    * This config setting will generally be set by tooling and not a user.
    *
    * @default
    * false
    */
  var preMajor: js.UndefOr[Boolean] = js.native
  /**
    * A string to be used to format the auto-generated release commit message.
    *
    * @default
    * "chore(release): {{currentTag}}"
    */
  var releaseCommitMessageFormat: js.UndefOr[String] = js.native
  /**
    * An array of `type` objects representing the explicitly supported commit
    * message types, and whether they should show up in generated `CHANGELOG`s.
    *
    * @default
    * [
    *     { "type": "feat", "section": "Features" },
    *     { "type": "fix", "section": "Bug Fixes" },
    *     { "type": "chore", "hidden": true },
    *     { "type": "docs", "hidden": true },
    *     { "type": "style", "hidden": true },
    *     { "type": "refactor", "hidden": true },
    *     { "type": "perf", "hidden": true },
    *     { "type": "test", "hidden": true }
    * ]
    */
  var types: js.UndefOr[js.Array[Type]] = js.native
  /**
    * A URL representing the a user's profile URL on GitHub, Gitlab, etc. This URL
    * is used for substituting @bcoe with https://github.com/bcoe in commit
    * messages.
    *
    * @default
    * "{{host}}/{{user}}"
    */
  var userUrlFormat: js.UndefOr[String] = js.native
}

object Config_ {
  @scala.inline
  def apply(): Config_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config_]
  }
  @scala.inline
  implicit class Config_Ops[Self <: Config_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitUrlFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitUrlFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitUrlFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitUrlFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareUrlFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareUrlFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareUrlFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareUrlFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withIssueUrlFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueUrlFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssueUrlFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueUrlFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPreMajor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preMajor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreMajor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preMajor")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseCommitMessageFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseCommitMessageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseCommitMessageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseCommitMessageFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def withUserUrlFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userUrlFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserUrlFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userUrlFormat")(js.undefined)
        ret
    }
  }
  
}

