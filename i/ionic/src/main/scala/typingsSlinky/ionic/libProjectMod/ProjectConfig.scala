package typingsSlinky.ionic.libProjectMod

import typingsSlinky.ionic.anon.PartialReadonlyIProjectCo
import typingsSlinky.ionic.definitionsMod.IProjectConfig
import typingsSlinky.ionic.definitionsMod.ProjectType
import typingsSlinky.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project", "ProjectConfig")
@js.native
class ProjectConfig protected () extends BaseConfig[IProjectConfig] {
  def this(p: String) = this()
  def this(p: String, hasTypeOptions: ProjectConfigOptions) = this()
  
  def provideDefaults(c: PartialReadonlyIProjectCo): IProjectConfig = js.native
  
  val `type`: js.UndefOr[ProjectType] = js.native
}
