package typingsSlinky.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GitHubEventsConfig describes the configuration of a trigger that creates a
  * build whenever a GitHub event is received.  This message is experimental.
  */
@js.native
trait SchemaGitHubEventsConfig extends js.Object {
  /**
    * Output only. Indicates that a build was generated from a check suite
    * event.
    */
  var checkSuite: js.UndefOr[SchemaCheckSuiteFilter] = js.native
  /**
    * The installationID that emmits the GitHub event.
    */
  var installationId: js.UndefOr[String] = js.native
  /**
    * Name of the repository.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Owner of the repository.
    */
  var owner: js.UndefOr[String] = js.native
  /**
    * filter to match changes in pull requests.
    */
  var pullRequest: js.UndefOr[SchemaPullRequestFilter] = js.native
  /**
    * filter to match changes in refs like branches, tags.
    */
  var push: js.UndefOr[SchemaPushFilter] = js.native
}

object SchemaGitHubEventsConfig {
  @scala.inline
  def apply(): SchemaGitHubEventsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGitHubEventsConfig]
  }
  @scala.inline
  implicit class SchemaGitHubEventsConfigOps[Self <: SchemaGitHubEventsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckSuite(value: SchemaCheckSuiteFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSuite")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationId")(js.undefined)
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
    def withPullRequest(value: SchemaPullRequestFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: SchemaPushFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
  }
  
}

