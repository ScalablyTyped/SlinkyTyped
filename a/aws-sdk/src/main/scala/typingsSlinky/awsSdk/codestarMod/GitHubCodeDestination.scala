package typingsSlinky.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitHubCodeDestination extends js.Object {
  /**
    * Description for the GitHub repository to be created in AWS CodeStar. This description displays in GitHub after the repository is created.
    */
  var description: js.UndefOr[RepositoryDescription] = js.native
  /**
    * Whether to enable issues for the GitHub repository.
    */
  var issuesEnabled: RepositoryEnableIssues = js.native
  /**
    * Name of the GitHub repository to be created in AWS CodeStar.
    */
  var name: RepositoryName = js.native
  /**
    * The GitHub username for the owner of the GitHub repository to be created in AWS CodeStar. If this repository should be owned by a GitHub organization, provide its name.
    */
  var owner: RepositoryOwner = js.native
  /**
    * Whether the GitHub repository is to be a private repository.
    */
  var privateRepository: RepositoryIsPrivate = js.native
  /**
    * The GitHub user's personal access token for the GitHub repository.
    */
  var token: GitHubPersonalToken = js.native
  /**
    * The type of GitHub repository to be created in AWS CodeStar. Valid values are User or Organization.
    */
  var `type`: RepositoryType = js.native
}

object GitHubCodeDestination {
  @scala.inline
  def apply(
    issuesEnabled: RepositoryEnableIssues,
    name: RepositoryName,
    owner: RepositoryOwner,
    privateRepository: RepositoryIsPrivate,
    token: GitHubPersonalToken,
    `type`: RepositoryType
  ): GitHubCodeDestination = {
    val __obj = js.Dynamic.literal(issuesEnabled = issuesEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], privateRepository = privateRepository.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitHubCodeDestination]
  }
  @scala.inline
  implicit class GitHubCodeDestinationOps[Self <: GitHubCodeDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssuesEnabled(value: RepositoryEnableIssues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: RepositoryOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateRepository(value: RepositoryIsPrivate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateRepository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: GitHubPersonalToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: RepositoryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: RepositoryDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

