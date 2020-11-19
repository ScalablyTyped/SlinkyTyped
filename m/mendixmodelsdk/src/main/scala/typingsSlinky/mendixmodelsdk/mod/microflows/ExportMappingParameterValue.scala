package typingsSlinky.mendixmodelsdk.mod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
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
@JSImport("mendixmodelsdk", "microflows.ExportMappingParameterValue")
@js.native
class ExportMappingParameterValue protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.ExportMappingParameterValue {
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
@JSImport("mendixmodelsdk", "microflows.ExportMappingParameterValue")
@js.native
object ExportMappingParameterValue extends js.Object {
  
  /**
    * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ExportMappingParameterValue = js.native
  
  /**
    * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
    * The new ExportMappingParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInJavaActionParameterMappingUnderParameterValue(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ExportMappingParameterValue = js.native
  
  /**
    * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
    * The new ExportMappingParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInJavaScriptActionParameterMappingUnderParameterValue(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ExportMappingParameterValue = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
