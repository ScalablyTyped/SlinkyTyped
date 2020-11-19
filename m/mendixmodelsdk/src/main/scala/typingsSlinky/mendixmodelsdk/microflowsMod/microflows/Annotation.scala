package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/annotation relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Annotation")
@js.native
class Annotation protected () extends MicroflowObject {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FAnnotation: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Annotation")
@js.native
object Annotation extends js.Object {
  
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Annotation = js.native
  
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * The new Annotation will be automatically stored in the 'objects' property
    * of the parent MicroflowObjectCollection element passed as argument.
    */
  def createIn(container: MicroflowObjectCollection): Annotation = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
