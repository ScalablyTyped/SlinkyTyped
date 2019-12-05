package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.microflows

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.WebServiceOperationAdvancedParameterMapping")
@js.native
class WebServiceOperationAdvancedParameterMapping protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.WebServiceOperationAdvancedParameterMapping {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "microflows.WebServiceOperationAdvancedParameterMapping")
@js.native
object WebServiceOperationAdvancedParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new WebServiceOperationAdvancedParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceOperationAdvancedParameterMapping = js.native
  /**
    * Creates and returns a new WebServiceOperationAdvancedParameterMapping instance in the SDK and on the server.
    * The new WebServiceOperationAdvancedParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent AdvancedRequestHandling element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.AdvancedRequestHandling): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceOperationAdvancedParameterMapping = js.native
}

