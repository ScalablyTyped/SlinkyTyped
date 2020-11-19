package typingsSlinky.mendixmodelsdk.webservicesMod.webservices

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.restMod.rest.PublishedODataService
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedResource")
@js.native
abstract class PublishedResource protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsPublishedODataService: PublishedODataService = js.native
  
  def containerAsVersionedService: VersionedService = js.native
  
  def dataEntity: DataEntity = js.native
  def dataEntity_=(newValue: DataEntity): Unit = js.native
  
  @JSName("model")
  var model_FPublishedResource: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedResource")
@js.native
object PublishedResource extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
