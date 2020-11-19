package typingsSlinky.mendixmodelsdk.securityMod.security

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IModule
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Module
import typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsSlinky.mendixmodelsdk.securityMod.security.IModuleSecurity because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined containerAsModule, moduleRoles */ @JSImport("mendixmodelsdk/dist/gen/security", "security.ModuleSecurity")
@js.native
class ModuleSecurity protected () extends ModelUnit {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IModule
  ) = this()
  
  def containerAsModule: Module = js.native
  @JSName("containerAsModule")
  val containerAsModule_FModuleSecurity: IModule = js.native
  
  @JSName("model")
  var model_FModuleSecurity: IModel = js.native
  
  def moduleRoles: IList[ModuleRole] = js.native
  @JSName("moduleRoles")
  val moduleRoles_FModuleSecurity: IList[IModuleRole] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.ModuleSecurity")
@js.native
object ModuleSecurity extends js.Object {
  
  /**
    * Creates a new ModuleSecurity unit in the SDK and on the server.
    * Expects one argument, the projects.IModule in which this unit is contained.
    */
  def createIn(container: IModule): ModuleSecurity = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
