package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.appservices

import typingsSlinky.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedParameter
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "appservices.MsdMicroflowParameter")
@js.native
class MsdMicroflowParameter protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.appservices.MsdMicroflowParameter {
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
@JSImport("mendixmodelsdk", "appservices.MsdMicroflowParameter")
@js.native
object MsdMicroflowParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.MsdMicroflowParameter = js.native
  /**
    * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
    * The new MsdMicroflowParameter will be automatically stored in the 'parameters' property
    * of the parent MsdMicroflow element passed as argument.
    */
  def createInMsdMicroflowUnderParameters(container: typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.MsdMicroflow): typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.MsdMicroflowParameter = js.native
  /**
    * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
    * The new MsdMicroflowParameter will be automatically stored in the 'parameterByContract' property
    * of the parent webservices.PublishedParameter element passed as argument.
    */
  def createInPublishedParameterUnderParameterByContract(container: PublishedParameter): typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.MsdMicroflowParameter = js.native
}

