package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.exportmappingsMod.exportmappings.IExportMapping
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 7.2.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportMappingJavaActionParameterValue")
@js.native
class ExportMappingJavaActionParameterValue protected () extends JavaActionParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def exportMapping: IExportMapping | Null = js.native
  
  def exportMappingQualifiedName: String | Null = js.native
  
  def exportMapping_=(newValue: IExportMapping | Null): Unit = js.native
}
object ExportMappingJavaActionParameterValue {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportMappingJavaActionParameterValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ExportMappingJavaActionParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportMappingJavaActionParameterValue.create")
  @js.native
  def create(model: IModel): ExportMappingJavaActionParameterValue = js.native
  
  /**
    * Creates and returns a new ExportMappingJavaActionParameterValue instance in the SDK and on the server.
    * The new ExportMappingJavaActionParameterValue will be automatically stored in the 'value' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 to 7.20.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportMappingJavaActionParameterValue.createIn")
  @js.native
  def createIn(container: JavaActionParameterMapping): ExportMappingJavaActionParameterValue = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportMappingJavaActionParameterValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportMappingJavaActionParameterValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
