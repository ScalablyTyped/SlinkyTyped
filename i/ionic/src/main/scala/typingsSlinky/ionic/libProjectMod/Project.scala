package typingsSlinky.ionic.libProjectMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ionic.definitionsMod.IIntegration
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.ProjectIntegration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project", "Project")
@js.native
abstract class Project protected () extends IProject {
  def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
  @JSName("config")
  val config_Project: ProjectConfig = js.native
  val e: ProjectDeps = js.native
  var originalConfigFile: js.UndefOr[StringDictionary[js.Any]] = js.native
  val packageJsonPath: String = js.native
  /* protected */ def getIntegrations(): js.Promise[js.Array[IIntegration[ProjectIntegration]]] = js.native
}

