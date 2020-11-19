package typingsSlinky.mendixmodelsdk.appservicesMod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.DataType
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.appservicesMod.appservices.IAppServiceAction because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsConsumedAppService, name, parameters */ @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceAction")
@js.native
class AppServiceAction protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  /**
    * In version 7.9.0: introduced
    */
  def actionReturnType: DataType = js.native
  def actionReturnType_=(newValue: DataType): Unit = js.native
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  
  def containerAsConsumedAppService: ConsumedAppService = js.native
  @JSName("containerAsConsumedAppService")
  val containerAsConsumedAppService_FAppServiceAction: IConsumedAppService = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def image: String = js.native
  def image_=(newValue: String): Unit = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  @JSName("model")
  var model_FAppServiceAction: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FAppServiceAction: String = js.native
  
  def parameters: IList[AppServiceActionParameter] = js.native
  @JSName("parameters")
  val parameters_FAppServiceAction: IList[IAppServiceActionParameter] = js.native
  
  @JSName("qualifiedName")
  def qualifiedName_MAppServiceAction: String | Null = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def returnType: String = js.native
  
  def returnTypeCanBeEmpty: Boolean = js.native
  def returnTypeCanBeEmpty_=(newValue: Boolean): Unit = js.native
  
  def returnType_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceAction")
@js.native
object AppServiceAction extends js.Object {
  
  /**
    * Creates and returns a new AppServiceAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): AppServiceAction = js.native
  
  /**
    * Creates and returns a new AppServiceAction instance in the SDK and on the server.
    * The new AppServiceAction will be automatically stored in the 'actions' property
    * of the parent ConsumedAppService element passed as argument.
    */
  def createIn(container: ConsumedAppService): AppServiceAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
