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
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportMappingParameterValue")
@js.native
class ExportMappingParameterValue protected () extends ExpressionBasedCodeActionParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def exportMapping: IExportMapping | Null = js.native
  
  def exportMappingQualifiedName: String | Null = js.native
  
  def exportMapping_=(newValue: IExportMapping | Null): Unit = js.native
  
  @JSName("model")
  var model_FExportMappingParameterValue: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportMappingParameterValue")
@js.native
object ExportMappingParameterValue extends js.Object {
  
  /**
    * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ExportMappingParameterValue = js.native
  
  /**
    * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
    * The new ExportMappingParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): ExportMappingParameterValue = js.native
  
  /**
    * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
    * The new ExportMappingParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): ExportMappingParameterValue = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
