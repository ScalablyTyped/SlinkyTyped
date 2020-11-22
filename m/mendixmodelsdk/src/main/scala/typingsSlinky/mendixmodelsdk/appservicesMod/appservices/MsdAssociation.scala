package typingsSlinky.mendixmodelsdk.appservicesMod.appservices

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataAssociation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAssociation")
@js.native
class MsdAssociation protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def associationKind: String = js.native
  def associationKind_=(newValue: String): Unit = js.native
  
  def associationOwner: String = js.native
  def associationOwner_=(newValue: String): Unit = js.native
  
  def associationType: String = js.native
  def associationType_=(newValue: String): Unit = js.native
  
  def childDeleteBehavior: String = js.native
  def childDeleteBehavior_=(newValue: String): Unit = js.native
  
  def childEntityName: String = js.native
  def childEntityName_=(newValue: String): Unit = js.native
  
  def childX: Double = js.native
  def childX_=(newValue: Double): Unit = js.native
  
  def childY: Double = js.native
  def childY_=(newValue: Double): Unit = js.native
  
  def containerAsDataAssociation: DataAssociation = js.native
  
  def containerAsMsdDomainModel: MsdDomainModel = js.native
  
  def guid: String = js.native
  def guid_=(newValue: String): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  def parentDeleteBehavior: String = js.native
  def parentDeleteBehavior_=(newValue: String): Unit = js.native
  
  def parentEntityName: String = js.native
  def parentEntityName_=(newValue: String): Unit = js.native
  
  def parentX: Double = js.native
  def parentX_=(newValue: Double): Unit = js.native
  
  def parentY: Double = js.native
  def parentY_=(newValue: Double): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAssociation")
@js.native
object MsdAssociation extends js.Object {
  
  /**
    * Creates and returns a new MsdAssociation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdAssociation = js.native
  
  /**
    * Creates and returns a new MsdAssociation instance in the SDK and on the server.
    * The new MsdAssociation will be automatically stored in the 'associationByContract' property
    * of the parent webservices.DataAssociation element passed as argument.
    */
  def createInDataAssociationUnderAssociationByContract(container: DataAssociation): MsdAssociation = js.native
  
  /**
    * Creates and returns a new MsdAssociation instance in the SDK and on the server.
    * The new MsdAssociation will be automatically stored in the 'associations' property
    * of the parent MsdDomainModel element passed as argument.
    */
  def createInMsdDomainModelUnderAssociations(container: MsdDomainModel): MsdAssociation = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
