package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.ICrossAssociation because var conflicts: capabilities, containerAsDomainModel, id, isLoaded, model, name, owner, parent, qualifiedName, remoteSourceDocument, remoteSourceDocumentQualifiedName, source, structureTypeName, `type`, unit. Inlined child, childQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.CrossAssociation")
@js.native
class CrossAssociation protected () extends AssociationBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def child: IEntity = js.native
  
  def childQualifiedName: String = js.native
  @JSName("childQualifiedName")
  val childQualifiedName_FCrossAssociation: String = js.native
  
  def child_=(newValue: IEntity): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("child")
  val child_FCrossAssociation: IEntity = js.native
  
  @JSName("containerAsDomainModel")
  def containerAsDomainModel_MCrossAssociation: DomainModel = js.native
  
  @JSName("model")
  var model_FCrossAssociation: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.CrossAssociation")
@js.native
object CrossAssociation extends js.Object {
  
  /**
    * Creates and returns a new CrossAssociation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CrossAssociation = js.native
  
  /**
    * Creates and returns a new CrossAssociation instance in the SDK and on the server.
    * The new CrossAssociation will be automatically stored in the 'crossAssociations' property
    * of the parent DomainModel element passed as argument.
    */
  def createIn(container: DomainModel): CrossAssociation = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
