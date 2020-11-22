package typingsSlinky.mendixmodelsdk.mod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.WebServiceOperationSimpleParameterMapping")
@js.native
class WebServiceOperationSimpleParameterMapping protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.WebServiceOperationSimpleParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "microflows.WebServiceOperationSimpleParameterMapping")
@js.native
object WebServiceOperationSimpleParameterMapping extends js.Object {
  
  /**
    * Creates and returns a new WebServiceOperationSimpleParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceOperationSimpleParameterMapping = js.native
  
  /**
    * Creates and returns a new WebServiceOperationSimpleParameterMapping instance in the SDK and on the server.
    * The new WebServiceOperationSimpleParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent SimpleRequestHandling element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.SimpleRequestHandling): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceOperationSimpleParameterMapping = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
