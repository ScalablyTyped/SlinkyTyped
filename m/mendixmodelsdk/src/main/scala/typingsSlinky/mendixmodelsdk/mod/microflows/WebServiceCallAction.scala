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
  * See: {@link https://docs.mendix.com/refguide7/call-web-service-action relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "microflows.WebServiceCallAction")
@js.native
class WebServiceCallAction protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.WebServiceCallAction {
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
@JSImport("mendixmodelsdk", "microflows.WebServiceCallAction")
@js.native
object WebServiceCallAction extends js.Object {
  
  /**
    * Creates and returns a new WebServiceCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction = js.native
  
  /**
    * Creates and returns a new WebServiceCallAction instance in the SDK and on the server.
    * The new WebServiceCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ActionActivity): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
