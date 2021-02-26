package typingsSlinky.mendixmodelsdk.allModelClassesMod.settings

import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProject
import typingsSlinky.mendixmodelsdk.settingsMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/project-settings relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.ProjectSettings")
@js.native
class ProjectSettings protected ()
  extends typingsSlinky.mendixmodelsdk.settingsMod.settings.ProjectSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
}
object ProjectSettings {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.ProjectSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ProjectSettings unit in the SDK and on the server.
    * Expects one argument, the projects.IProject in which this unit is contained.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.ProjectSettings.createIn")
  @js.native
  def createIn(container: IProject): typingsSlinky.mendixmodelsdk.settingsMod.settings.ProjectSettings = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.ProjectSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.ProjectSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
