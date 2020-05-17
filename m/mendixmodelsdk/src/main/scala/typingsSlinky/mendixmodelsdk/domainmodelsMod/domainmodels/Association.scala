package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.commonMod.common.IPoint
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociation because var conflicts: containerAsDomainModel, id, isLoaded, model, name, owner, parent, qualifiedName, remoteSourceDocument, remoteSourceDocumentQualifiedName, structureTypeName, `type`, unit. Inlined child */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Association")
@js.native
class Association protected () extends AssociationBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("child")
  val child_FAssociation: IEntity = js.native
  @JSName("model")
  var model_FAssociation: IModel = js.native
  def child: Entity = js.native
  def child(newValue: Entity): js.Any = js.native
  def childConnection: IPoint = js.native
  def childConnection(newValue: IPoint): js.Any = js.native
  @JSName("containerAsDomainModel")
  def containerAsDomainModel_MAssociation: DomainModel = js.native
  def parentConnection: IPoint = js.native
  def parentConnection(newValue: IPoint): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Association")
@js.native
object Association extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Association instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Association = js.native
  /**
    * Creates and returns a new Association instance in the SDK and on the server.
    * The new Association will be automatically stored in the 'associations' property
    * of the parent DomainModel element passed as argument.
    */
  def createIn(container: DomainModel): Association = js.native
}

