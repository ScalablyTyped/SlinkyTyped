package typingsSlinky.mendixmodelsdk.projectsMod.projects

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.StructuralUnit
import typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsFolderBase, containerAsProject, folders, documents */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.FolderBase")
@js.native
abstract class FolderBase protected () extends StructuralUnit {
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
    container: IProject
  ) = this()
  
  def containerAsFolderBase: FolderBase = js.native
  @JSName("containerAsFolderBase")
  val containerAsFolderBase_FFolderBase: IFolderBase = js.native
  
  def containerAsProject: Project = js.native
  @JSName("containerAsProject")
  val containerAsProject_FFolderBase: IProject = js.native
  
  def documents: IList[IDocument] = js.native
  @JSName("documents")
  var documents_FFolderBase: IList[IDocument] = js.native
  
  def folders: IList[IFolder] = js.native
  @JSName("folders")
  var folders_FFolderBase: IList[IFolder] = js.native
  
  @JSName("model")
  var model_FFolderBase: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.FolderBase")
@js.native
object FolderBase extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
