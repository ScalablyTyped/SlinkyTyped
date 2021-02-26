package typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MappingRequestHandling")
@js.native
class MappingRequestHandling protected ()
  extends typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MappingRequestHandling {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MappingRequestHandling {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MappingRequestHandling")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MappingRequestHandling.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MappingRequestHandling = js.native
  
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * The new MappingRequestHandling will be automatically stored in the 'resultHandling' property
    * of the parent ExportXmlAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MappingRequestHandling.createInExportXmlActionUnderResultHandling")
  @js.native
  def createInExportXmlActionUnderResultHandling(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ExportXmlAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MappingRequestHandling = js.native
  
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * The new MappingRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MappingRequestHandling.createInRestCallActionUnderRequestHandling")
  @js.native
  def createInRestCallActionUnderRequestHandling(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RestCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MappingRequestHandling = js.native
  
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * The new MappingRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MappingRequestHandling.createInWebServiceCallActionUnderRequestBodyHandling")
  @js.native
  def createInWebServiceCallActionUnderRequestBodyHandling(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MappingRequestHandling = js.native
  
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * The new MappingRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MappingRequestHandling.createInWebServiceCallActionUnderRequestHeaderHandling")
  @js.native
  def createInWebServiceCallActionUnderRequestHeaderHandling(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MappingRequestHandling = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MappingRequestHandling.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MappingRequestHandling.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
