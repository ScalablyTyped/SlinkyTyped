package typingsSlinky.mendixmodelsdk.mod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.SimpleRequestHandling")
@js.native
class SimpleRequestHandling protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.SimpleRequestHandling {
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
@JSImport("mendixmodelsdk", "microflows.SimpleRequestHandling")
@js.native
object SimpleRequestHandling extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling = js.native
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  def createInRestCallActionUnderRequestHandling(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RestCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling = js.native
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  def createInWebServiceCallActionUnderRequestBodyHandling(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling = js.native
  /**
    * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
    * The new SimpleRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  def createInWebServiceCallActionUnderRequestHeaderHandling(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling = js.native
}

