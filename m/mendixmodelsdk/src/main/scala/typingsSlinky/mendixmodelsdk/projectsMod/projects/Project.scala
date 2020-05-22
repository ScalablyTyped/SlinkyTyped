package typingsSlinky.mendixmodelsdk.projectsMod.projects

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.StructuralUnit
import typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IProject because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined projectDocuments, modules, projectConversion, isSystemProject */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Project")
@js.native
class Project protected () extends StructuralUnit {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
  @JSName("isSystemProject")
  var isSystemProject_FProject: Boolean = js.native
  @JSName("model")
  var model_FProject: IModel = js.native
  @JSName("modules")
  var modules_FProject: IList[IModule] = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("projectConversion")
  var projectConversion_FProject: IProjectConversion = js.native
  @JSName("projectDocuments")
  var projectDocuments_FProject: IList[IProjectDocument] = js.native
  def isSystemProject: Boolean = js.native
  def isSystemProject(newValue: Boolean): js.Any = js.native
  def modules: IList[IModule] = js.native
  def projectConversion: IProjectConversion = js.native
  def projectConversion(newValue: IProjectConversion): js.Any = js.native
  def projectDocuments: IList[IProjectDocument] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.Project")
@js.native
object Project extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

