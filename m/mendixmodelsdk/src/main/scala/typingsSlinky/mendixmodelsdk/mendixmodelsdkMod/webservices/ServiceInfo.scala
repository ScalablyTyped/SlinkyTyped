package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.webservices

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "webservices.ServiceInfo")
@js.native
class ServiceInfo protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices.ServiceInfo {
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
@JSImport("mendixmodelsdk", "webservices.ServiceInfo")
@js.native
object ServiceInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ServiceInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.ServiceInfo = js.native
  /**
    * Creates and returns a new ServiceInfo instance in the SDK and on the server.
    * The new ServiceInfo will be automatically stored in the 'services' property
    * of the parent WsdlDescription element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlDescription): typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.ServiceInfo = js.native
}

