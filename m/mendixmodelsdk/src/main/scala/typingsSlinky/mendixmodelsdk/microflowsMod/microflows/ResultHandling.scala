package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.DataType
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ResultHandling")
@js.native
class ResultHandling protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsImportXmlAction: ImportXmlAction = js.native
  
  def containerAsRestCallAction: RestCallAction = js.native
  
  def containerAsWebServiceCallAction: WebServiceCallAction = js.native
  
  def importMappingCall: ImportMappingCall | Null = js.native
  def importMappingCall_=(newValue: ImportMappingCall | Null): Unit = js.native
  
  def outputVariableName: String = js.native
  def outputVariableName_=(newValue: String): Unit = js.native
  
  def storeInVariable: Boolean = js.native
  def storeInVariable_=(newValue: Boolean): Unit = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    * In version 6.10.0: introduced
    */
  def variableDataType: String = js.native
  def variableDataType_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.9.0: introduced
    */
  def variableType: DataType = js.native
  def variableType_=(newValue: DataType): Unit = js.native
}
object ResultHandling {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ResultHandling")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ResultHandling.create")
  @js.native
  def create(model: IModel): ResultHandling = js.native
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent ImportXmlAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ResultHandling.createInImportXmlActionUnderResultHandling")
  @js.native
  def createInImportXmlActionUnderResultHandling(container: ImportXmlAction): ResultHandling = js.native
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ResultHandling.createInRestCallActionUnderResultHandling")
  @js.native
  def createInRestCallActionUnderResultHandling(container: RestCallAction): ResultHandling = js.native
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ResultHandling.createInWebServiceCallActionUnderResultHandling")
  @js.native
  def createInWebServiceCallActionUnderResultHandling(container: WebServiceCallAction): ResultHandling = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ResultHandling.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ResultHandling.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
