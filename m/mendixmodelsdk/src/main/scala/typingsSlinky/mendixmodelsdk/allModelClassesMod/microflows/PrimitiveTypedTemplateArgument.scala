package typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.PrimitiveTypedTemplateArgument")
@js.native
class PrimitiveTypedTemplateArgument protected ()
  extends typingsSlinky.mendixmodelsdk.microflowsMod.microflows.PrimitiveTypedTemplateArgument {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.PrimitiveTypedTemplateArgument")
@js.native
object PrimitiveTypedTemplateArgument extends js.Object {
  
  /**
    * Creates and returns a new PrimitiveTypedTemplateArgument instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.PrimitiveTypedTemplateArgument = js.native
  
  /**
    * Creates and returns a new PrimitiveTypedTemplateArgument instance in the SDK and on the server.
    * The new PrimitiveTypedTemplateArgument will be automatically stored in the 'arguments' property
    * of the parent TypedTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.TypedTemplate): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.PrimitiveTypedTemplateArgument = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
