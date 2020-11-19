package typingsSlinky.mendixmodelsdk.mod.webservices

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "webservices.PartEncoding")
@js.native
class PartEncoding protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices.PartEncoding {
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
@JSImport("mendixmodelsdk", "webservices.PartEncoding")
@js.native
object PartEncoding extends js.Object {
  
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PartEncoding = js.native
  
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * The new PartEncoding will be automatically stored in the 'requestBodyPartEncodings' property
    * of the parent OperationInfo element passed as argument.
    */
  def createInOperationInfoUnderRequestBodyPartEncodings(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.OperationInfo): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PartEncoding = js.native
  
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * The new PartEncoding will be automatically stored in the 'requestHeaderPartEncoding' property
    * of the parent OperationInfo element passed as argument.
    */
  def createInOperationInfoUnderRequestHeaderPartEncoding(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.OperationInfo): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PartEncoding = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
