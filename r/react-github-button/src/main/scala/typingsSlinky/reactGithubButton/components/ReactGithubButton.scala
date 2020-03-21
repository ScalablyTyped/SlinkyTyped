package typingsSlinky.reactGithubButton.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactGithubButton.mod.ReactGitHubButtonProps
import typingsSlinky.reactGithubButton.mod.default
import typingsSlinky.reactGithubButton.reactGithubButtonStrings.forks
import typingsSlinky.reactGithubButton.reactGithubButtonStrings.large
import typingsSlinky.reactGithubButton.reactGithubButtonStrings.stargazers
import typingsSlinky.reactGithubButton.reactGithubButtonStrings.watchers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactGithubButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-github-button", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    namespace: String,
    repo: String,
    `type`: stargazers | watchers | forks,
    size: large = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactGitHubButtonProps
}

