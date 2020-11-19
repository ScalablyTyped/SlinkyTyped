package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.exportmappingsMod.exportmappings.IExportMapping
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/export-mapping-action relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportXmlAction")
@js.native
class ExportXmlAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def isValidationRequired: Boolean = js.native
  def isValidationRequired_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.6.0: deleted
    */
  def mapping: IExportMapping | Null = js.native
  
  /**
    * In version 7.6.0: deleted
    */
  def mappingArgumentVariableName: String = js.native
  def mappingArgumentVariableName_=(newValue: String): Unit = js.native
  
  def mappingQualifiedName: String | Null = js.native
  
  def mapping_=(newValue: IExportMapping | Null): Unit = js.native
  
  @JSName("model")
  var model_FExportXmlAction: IModel = js.native
  
  def outputMethod: OutputMethod = js.native
  def outputMethod_=(newValue: OutputMethod): Unit = js.native
  
  /**
    * In version 7.6.0: introduced
    */
  def resultHandling: MappingRequestHandling = js.native
  def resultHandling_=(newValue: MappingRequestHandling): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportXmlAction")
@js.native
object ExportXmlAction extends js.Object {
  
  /**
    * Creates and returns a new ExportXmlAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ExportXmlAction = js.native
  
  /**
    * Creates and returns a new ExportXmlAction instance in the SDK and on the server.
    * The new ExportXmlAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): ExportXmlAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
