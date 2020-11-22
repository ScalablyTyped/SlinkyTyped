package typingsSlinky.mendixmodelsdk.projectsMod.projects

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IProjectConversion because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined containerAsProject */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectConversion")
@js.native
class ProjectConversion protected () extends ModelUnit[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  
  def containerAsProject: Project = js.native
  @JSName("containerAsProject")
  val containerAsProject_FProjectConversion: IProject = js.native
  
  def markers: IList[OneTimeConversionMarker] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectConversion")
@js.native
object ProjectConversion extends js.Object {
  
  /**
    * Creates a new ProjectConversion unit in the SDK and on the server.
    * Expects one argument, the IProject in which this unit is contained.
    */
  def createIn(container: IProject): ProjectConversion = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
