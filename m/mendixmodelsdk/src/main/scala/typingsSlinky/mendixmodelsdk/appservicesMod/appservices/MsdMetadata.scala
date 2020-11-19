package typingsSlinky.mendixmodelsdk.appservicesMod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMetadata")
@js.native
class MsdMetadata protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  
  def containerAsMsd: Msd = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  def headerAuthentication: String = js.native
  def headerAuthentication_=(newValue: String): Unit = js.native
  
  def image: String = js.native
  def image_=(newValue: String): Unit = js.native
  
  def instanceGuid: String = js.native
  def instanceGuid_=(newValue: String): Unit = js.native
  
  def microflows: IList[MsdMicroflow] = js.native
  
  @JSName("model")
  var model_FMsdMetadata: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  def publishDateTime: String = js.native
  def publishDateTime_=(newValue: String): Unit = js.native
  
  def serviceGuid: String = js.native
  def serviceGuid_=(newValue: String): Unit = js.native
  
  def supportedProtocols: IList[String] = js.native
  
  def version: Double = js.native
  
  def versionGuid: String = js.native
  def versionGuid_=(newValue: String): Unit = js.native
  
  def version_=(newValue: Double): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMetadata")
@js.native
object MsdMetadata extends js.Object {
  
  /**
    * Creates and returns a new MsdMetadata instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdMetadata = js.native
  
  /**
    * Creates and returns a new MsdMetadata instance in the SDK and on the server.
    * The new MsdMetadata will be automatically stored in the 'metadata' property
    * of the parent Msd element passed as argument.
    */
  def createIn(container: Msd): MsdMetadata = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
