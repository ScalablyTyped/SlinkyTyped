package typingsSlinky.mendixmodelsdk.projectsMod.projects

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
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
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined containerAsFolderBase, containerAsModule */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ModuleDocument")
@js.native
abstract class ModuleDocument protected () extends ModelUnit {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IModule
  ) = this()
  
  def containerAsFolderBase: FolderBase = js.native
  @JSName("containerAsFolderBase")
  val containerAsFolderBase_FModuleDocument: IFolderBase = js.native
  
  def containerAsModule: Module = js.native
  @JSName("containerAsModule")
  val containerAsModule_FModuleDocument: IModule = js.native
  
  @JSName("model")
  var model_FModuleDocument: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.ModuleDocument")
@js.native
object ModuleDocument extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
