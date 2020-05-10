package typingsSlinky.conventionalChangelogWriter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  /**
    * Commit keyword in the url if `context.linkReferences === true`.
    *
    * @default
    * 'commits'
    */
  var commit: String = js.native
  /**
    * Default to formatted (`'yyyy-mm-dd'`) today's date. [dateformat](https://github.com/felixge/node-dateformat)
    * is used for formatting the date. If `version` is found in the last commit,
    * `committerDate` will overwrite this.
    *
    * @default
    * dateFormat(new Date(), 'yyyy-mm-dd', true)
    */
  var date: String = js.native
  /**
    * The hosting website. Eg: `'https://github.com'` or `'https://bitbucket.org'`.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * By default, this value is true if `version`'s patch is `0`.
    *
    * @default
    * semver.patch(context.version) !== 0
    */
  var isPatch: js.UndefOr[Boolean] = js.native
  /**
    * Issue or pull request keyword in the url if `context.linkReferences === true`.
    *
    * @default
    * 'issues'
    */
  var issue: String = js.native
  /**
    * Should all references be linked?
    *
    * @defaults
    * `true` if (`context.repository` or `context.repoUrl`), `context.commit` and
    * `context.issue` are truthy.
    */
  var linkReferences: js.UndefOr[Boolean] = js.native
  /**
    * The owner of the repository. Eg: `'stevemao'`.
    */
  var owner: js.UndefOr[String] = js.native
  /**
    * The whole repository url. Eg: `'https://github.com/conventional-changelog/conventional-changelog-writer'`.
    * The should be used as a fallback when `context.repository` doesn't exist.
    */
  var repoUrl: js.UndefOr[String] = js.native
  /**
    * The repository name on `host`. Eg: `'conventional-changelog-writer'`.
    */
  var repository: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  /**
    * Version number of the up-coming release. If `version` is found in the last
    * commit before generating logs, it will be overwritten.
    */
  var version: js.UndefOr[String] = js.native
}

object Context {
  @scala.inline
  def apply(commit: String, date: String, issue: String): Context = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue")(value.asInstanceOf[js.Any])
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
    def withIsPatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPatch")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkReferences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkReferences")(js.undefined)
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
    def withRepoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRepository(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(js.undefined)
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
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

