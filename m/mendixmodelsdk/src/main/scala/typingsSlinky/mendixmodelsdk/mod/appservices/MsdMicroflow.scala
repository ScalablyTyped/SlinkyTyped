package typingsSlinky.mendixmodelsdk.mod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "appservices.MsdMicroflow")
@js.native
class MsdMicroflow protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.appservices.MsdMicroflow {
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
@JSImport("mendixmodelsdk", "appservices.MsdMicroflow")
@js.native
object MsdMicroflow extends js.Object {
  
  /**
    * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdMicroflow = js.native
  
  /**
    * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
    * The new MsdMicroflow will be automatically stored in the 'microflows' property
    * of the parent MsdMetadata element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdMetadata): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdMicroflow = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
