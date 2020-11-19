package typingsSlinky.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.definitionsMod.IProjectConfig
  - typingsSlinky.ionic.definitionsMod.IMultiProjectConfig
*/
trait ProjectFile extends js.Object
object ProjectFile {
  
  @scala.inline
  def IProjectConfig(integrations: ProjectIntegrations, name: String): ProjectFile = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectFile]
  }
  
  @scala.inline
  def IMultiProjectConfig(projects: StringDictionary[js.UndefOr[IProjectConfig]]): ProjectFile = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectFile]
  }
}
