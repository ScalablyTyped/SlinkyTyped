package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IModule
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Module
import typingsSlinky.mendixmodelsdk.projectsMod.projects.ModuleDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/domain-model relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IDomainModel because var conflicts: containerAsFolderBase, containerAsModule, id, isLoaded, model, structureTypeName, unit. Inlined entities, associations, crossAssociations */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DomainModel")
@js.native
class DomainModel protected () extends ModuleDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IModule
  ) = this()
  
  def annotations: IList[Annotation] = js.native
  
  def associations: IList[Association] = js.native
  @JSName("associations")
  val associations_FDomainModel: IList[IAssociation] = js.native
  
  @JSName("containerAsModule")
  def containerAsModule_MDomainModel: Module = js.native
  
  def crossAssociations: IList[CrossAssociation] = js.native
  @JSName("crossAssociations")
  val crossAssociations_FDomainModel: IList[ICrossAssociation] = js.native
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  def entities: IList[Entity] = js.native
  @JSName("entities")
  val entities_FDomainModel: IList[IEntity] = js.native
}
object DomainModel {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DomainModel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DomainModel unit in the SDK and on the server.
    * Expects one argument, the projects.IModule in which this unit is contained.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DomainModel.createIn")
  @js.native
  def createIn(container: IModule): DomainModel = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DomainModel.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DomainModel.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
