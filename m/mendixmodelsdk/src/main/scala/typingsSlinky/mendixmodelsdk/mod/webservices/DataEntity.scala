package typingsSlinky.mendixmodelsdk.mod.webservices

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "webservices.DataEntity")
@js.native
class DataEntity protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices.DataEntity {
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
@JSImport("mendixmodelsdk", "webservices.DataEntity")
@js.native
object DataEntity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    */
  def createInDataEntityBaseUnderChildMembers(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataEntityBase): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedParameter element passed as argument.
    */
  def createInPublishedParameterUnderDataEntity(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedParameter): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedResource element passed as argument.
    */
  def createInPublishedResourceUnderDataEntity(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedResource): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
}

