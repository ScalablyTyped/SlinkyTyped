package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SimpleRequestHandling")
@js.native
class SimpleRequestHandling protected () extends RequestHandling {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 6.7.0: introduced
    */
  def nullValueOption: NullValueOption = js.native
  def nullValueOption_=(newValue: NullValueOption): Unit = js.native
  
  def parameterMappings: IList[WebServiceOperationSimpleParameterMapping] = js.native
}
object SimpleRequestHandling {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SimpleRequestHandling")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SimpleRequestHandling.create")
  @js.native
  def create(model: IModel): SimpleRequestHandling = js.native
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SimpleRequestHandling.createInRestCallActionUnderRequestHandling")
  @js.native
  def createInRestCallActionUnderRequestHandling(container: RestCallAction): SimpleRequestHandling = js.native
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SimpleRequestHandling.createInWebServiceCallActionUnderRequestBodyHandling")
  @js.native
  def createInWebServiceCallActionUnderRequestBodyHandling(container: WebServiceCallAction): SimpleRequestHandling = js.native
  
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SimpleRequestHandling.createInWebServiceCallActionUnderRequestHeaderHandling")
  @js.native
  def createInWebServiceCallActionUnderRequestHeaderHandling(container: WebServiceCallAction): SimpleRequestHandling = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SimpleRequestHandling.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SimpleRequestHandling.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
