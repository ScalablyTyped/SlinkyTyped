package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RequestHandling")
@js.native
abstract class RequestHandling protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsExportXmlAction: ExportXmlAction = js.native
  
  def containerAsRestCallAction: RestCallAction = js.native
  
  def containerAsWebServiceCallAction: WebServiceCallAction = js.native
  
  @JSName("model")
  var model_FRequestHandling: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RequestHandling")
@js.native
object RequestHandling extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
