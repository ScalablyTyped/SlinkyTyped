package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.managed
import typingsSlinky.ionic.ionicStrings.repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.definitionsMod.RepoStarterTemplate
  - typingsSlinky.ionic.definitionsMod.ManagedStarterTemplate
*/
trait StarterTemplate extends js.Object

object StarterTemplate {
  @scala.inline
  def RepoStarterTemplate(name: String, projectType: ProjectType, repo: String, `type`: repo): StarterTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarterTemplate]
  }
  @scala.inline
  def ManagedStarterTemplate(id: String, name: String, projectType: ProjectType, `type`: managed): StarterTemplate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarterTemplate]
  }
}

