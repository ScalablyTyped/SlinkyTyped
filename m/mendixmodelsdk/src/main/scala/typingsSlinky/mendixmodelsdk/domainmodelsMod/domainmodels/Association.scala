package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.commonMod.common.IPoint
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/associations relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociation because var conflicts: capabilities, containerAsDomainModel, id, isLoaded, model, name, owner, parent, qualifiedName, remoteSourceDocument, remoteSourceDocumentQualifiedName, source, structureTypeName, `type`, unit. Inlined child */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Association")
@js.native
class Association protected () extends AssociationBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def child: Entity = js.native
  
  def childConnection: IPoint = js.native
  def childConnection_=(newValue: IPoint): Unit = js.native
  
  def child_=(newValue: Entity): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("child")
  val child_FAssociation: IEntity = js.native
  
  @JSName("containerAsDomainModel")
  def containerAsDomainModel_MAssociation: DomainModel = js.native
  
  def parentConnection: IPoint = js.native
  def parentConnection_=(newValue: IPoint): Unit = js.native
}
object Association {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Association")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Association instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Association.create")
  @js.native
  def create(model: IModel): Association = js.native
  
  /**
    * Creates and returns a new Association instance in the SDK and on the server.
    * The new Association will be automatically stored in the 'associations' property
    * of the parent DomainModel element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Association.createIn")
  @js.native
  def createIn(container: DomainModel): Association = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Association.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Association.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
