package typingsSlinky.ionic.libStartMod

import typingsSlinky.ionic.definitionsMod.ProjectType
import typingsSlinky.ionic.ionicBooleans.`false`
import typingsSlinky.ionic.ionicBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.libStartMod.NewAppSchema
  - typingsSlinky.ionic.libStartMod.ClonedAppSchema
*/
trait AppSchema extends js.Object
object AppSchema {
  
  @scala.inline
  def NewAppSchema(
    cloned: `false`,
    name: String,
    projectDir: String,
    projectId: String,
    template: String,
    `type`: ProjectType
  ): AppSchema = {
    val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSchema]
  }
  
  @scala.inline
  def ClonedAppSchema(cloned: `true`, projectDir: String, projectId: String, url: String): AppSchema = {
    val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSchema]
  }
}
