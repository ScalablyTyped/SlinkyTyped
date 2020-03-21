package typingsSlinky.mendixmodelsdk.allModelClassesMod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataAssociation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.MsdAssociation")
@js.native
class MsdAssociation protected ()
  extends typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdAssociation {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.MsdAssociation")
@js.native
object MsdAssociation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdAssociation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdAssociation = js.native
  /**
    * Creates and returns a new MsdAssociation instance in the SDK and on the server.
    * The new MsdAssociation will be automatically stored in the 'associationByContract' property
    * of the parent webservices.DataAssociation element passed as argument.
    */
  def createInDataAssociationUnderAssociationByContract(container: DataAssociation): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdAssociation = js.native
  /**
    * Creates and returns a new MsdAssociation instance in the SDK and on the server.
    * The new MsdAssociation will be automatically stored in the 'associations' property
    * of the parent MsdDomainModel element passed as argument.
    */
  def createInMsdDomainModelUnderAssociations(container: typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdDomainModel): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdAssociation = js.native
}

