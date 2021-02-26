package typingsSlinky.reactGithubButton.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactGithubButton.mod.ReactGitHubButtonProps
import typingsSlinky.reactGithubButton.mod.default
import typingsSlinky.reactGithubButton.reactGithubButtonStrings.forks
import typingsSlinky.reactGithubButton.reactGithubButtonStrings.large
import typingsSlinky.reactGithubButton.reactGithubButtonStrings.stargazers
import typingsSlinky.reactGithubButton.reactGithubButtonStrings.watchers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGithubButton {
  
  @scala.inline
  def apply(namespace: String, repo: String, `type`: stargazers | watchers | forks): Builder = {
    val __props = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactGitHubButtonProps]))
  }
  
  @JSImport("react-github-button", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def size(value: large): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactGitHubButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
