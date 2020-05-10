package typingsSlinky.reactGithubButton.mod

import typingsSlinky.reactGithubButton.reactGithubButtonStrings.forks
import typingsSlinky.reactGithubButton.reactGithubButtonStrings.large
import typingsSlinky.reactGithubButton.reactGithubButtonStrings.stargazers
import typingsSlinky.reactGithubButton.reactGithubButtonStrings.watchers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactGitHubButtonProps extends js.Object {
  /**
    * Your GitHub id or organization name.
    */
  var namespace: String = js.native
  /**
    * The name of your repository.
    */
  var repo: String = js.native
  /**
    * The size of the button. Leave undefined for default.
    */
  var size: js.UndefOr[large] = js.native
  /**
    * The type of information to display
    */
  var `type`: stargazers | watchers | forks = js.native
}

object ReactGitHubButtonProps {
  @scala.inline
  def apply(namespace: String, repo: String, `type`: stargazers | watchers | forks): ReactGitHubButtonProps = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactGitHubButtonProps]
  }
  @scala.inline
  implicit class ReactGitHubButtonPropsOps[Self <: ReactGitHubButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: stargazers | watchers | forks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

