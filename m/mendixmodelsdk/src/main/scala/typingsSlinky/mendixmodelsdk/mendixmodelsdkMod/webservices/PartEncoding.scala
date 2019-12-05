package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.webservices

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "webservices.PartEncoding")
@js.native
class PartEncoding protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices.PartEncoding {
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
@JSImport("mendixmodelsdk", "webservices.PartEncoding")
@js.native
object PartEncoding extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.PartEncoding = js.native
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * The new PartEncoding will be automatically stored in the 'requestBodyPartEncodings' property
    * of the parent OperationInfo element passed as argument.
    */
  def createInOperationInfoUnderRequestBodyPartEncodings(container: typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.OperationInfo): typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.PartEncoding = js.native
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * The new PartEncoding will be automatically stored in the 'requestHeaderPartEncoding' property
    * of the parent OperationInfo element passed as argument.
    */
  def createInOperationInfoUnderRequestHeaderPartEncoding(container: typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.OperationInfo): typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.PartEncoding = js.native
}

