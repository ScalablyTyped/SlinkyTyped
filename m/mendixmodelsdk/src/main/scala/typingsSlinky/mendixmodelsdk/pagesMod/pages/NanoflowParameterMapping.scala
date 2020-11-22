package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.INanoflowParameter
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.19.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NanoflowParameterMapping")
@js.native
class NanoflowParameterMapping protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsCallNanoflowClientAction: CallNanoflowClientAction = js.native
  
  def containerAsNanoflowSource: NanoflowSource = js.native
  
  def parameter: INanoflowParameter = js.native
  
  def parameterQualifiedName: String = js.native
  
  def parameter_=(newValue: INanoflowParameter): Unit = js.native
  
  /**
    * In version 8.4.0: deleted
    */
  def useAllPages: Boolean = js.native
  def useAllPages_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.4.0: introduced
    */
  def variable: PageVariable = js.native
  def variable_=(newValue: PageVariable): Unit = js.native
  
  /**
    * In version 8.4.0: deleted
    */
  def widget: EntityWidget | Null = js.native
  
  def widgetLocalName: String | Null = js.native
  
  def widget_=(newValue: EntityWidget | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NanoflowParameterMapping")
@js.native
object NanoflowParameterMapping extends js.Object {
  
  /**
    * Creates and returns a new NanoflowParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NanoflowParameterMapping = js.native
  
  /**
    * Creates and returns a new NanoflowParameterMapping instance in the SDK and on the server.
    * The new NanoflowParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent CallNanoflowClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInCallNanoflowClientActionUnderParameterMappings(container: CallNanoflowClientAction): NanoflowParameterMapping = js.native
  
  /**
    * Creates and returns a new NanoflowParameterMapping instance in the SDK and on the server.
    * The new NanoflowParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent NanoflowSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInNanoflowSourceUnderParameterMappings(container: NanoflowSource): NanoflowParameterMapping = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
