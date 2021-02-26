package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.managed
import typingsSlinky.ionic.ionicStrings.repo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.definitionsMod.RepoStarterTemplate
  - typingsSlinky.ionic.definitionsMod.ManagedStarterTemplate
*/
trait StarterTemplate extends StObject
object StarterTemplate {
  
  @scala.inline
  def ManagedStarterTemplate(id: String, name: String, projectType: ProjectType, `type`: managed): typingsSlinky.ionic.definitionsMod.ManagedStarterTemplate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionic.definitionsMod.ManagedStarterTemplate]
  }
  
  @scala.inline
  def RepoStarterTemplate(name: String, projectType: ProjectType, repo: String, `type`: repo): typingsSlinky.ionic.definitionsMod.RepoStarterTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionic.definitionsMod.RepoStarterTemplate]
  }
}
