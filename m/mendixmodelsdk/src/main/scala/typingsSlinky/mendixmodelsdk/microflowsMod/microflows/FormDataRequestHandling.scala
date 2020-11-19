package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.FormDataRequestHandling")
@js.native
class FormDataRequestHandling protected () extends RequestHandling {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("model")
  var model_FFormDataRequestHandling: IModel = js.native
  
  def parts: IList[FormDataPart] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.FormDataRequestHandling")
@js.native
object FormDataRequestHandling extends js.Object {
  
  /**
    * Creates and returns a new FormDataRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): FormDataRequestHandling = js.native
  
  /**
    * Creates and returns a new FormDataRequestHandling instance in the SDK and on the server.
    * The new FormDataRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInRestCallActionUnderRequestHandling(container: RestCallAction): FormDataRequestHandling = js.native
  
  /**
    * Creates and returns a new FormDataRequestHandling instance in the SDK and on the server.
    * The new FormDataRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebServiceCallActionUnderRequestBodyHandling(container: WebServiceCallAction): FormDataRequestHandling = js.native
  
  /**
    * Creates and returns a new FormDataRequestHandling instance in the SDK and on the server.
    * The new FormDataRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebServiceCallActionUnderRequestHeaderHandling(container: WebServiceCallAction): FormDataRequestHandling = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
