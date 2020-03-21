package typingsSlinky.mendixmodelsdk.allModelClassesMod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.VersionedService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.MsdEnumerationContainer")
@js.native
class MsdEnumerationContainer protected ()
  extends typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.MsdEnumerationContainer")
@js.native
object MsdEnumerationContainer extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer = js.native
  /**
    * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
    * The new MsdEnumerationContainer will be automatically stored in the 'enumerations' property
    * of the parent Msd element passed as argument.
    */
  def createInMsdUnderEnumerations(container: typingsSlinky.mendixmodelsdk.appservicesMod.appservices.Msd): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer = js.native
  /**
    * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
    * The new MsdEnumerationContainer will be automatically stored in the 'enumerationsByContract' property
    * of the parent webservices.VersionedService element passed as argument.
    */
  def createInVersionedServiceUnderEnumerationsByContract(container: VersionedService): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer = js.native
}

