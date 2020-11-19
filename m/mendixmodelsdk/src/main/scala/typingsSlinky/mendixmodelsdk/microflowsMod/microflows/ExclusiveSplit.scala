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
  * See: {@link https://docs.mendix.com/refguide7/decisions relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExclusiveSplit")
@js.native
class ExclusiveSplit protected () extends MicroflowObject {
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
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  def errorHandlingType: ErrorHandlingType = js.native
  def errorHandlingType_=(newValue: ErrorHandlingType): Unit = js.native
  
  @JSName("model")
  var model_FExclusiveSplit: IModel = js.native
  
  def splitCondition: SplitCondition = js.native
  def splitCondition_=(newValue: SplitCondition): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExclusiveSplit")
@js.native
object ExclusiveSplit extends js.Object {
  
  /**
    * Creates and returns a new ExclusiveSplit instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ExclusiveSplit = js.native
  
  /**
    * Creates and returns a new ExclusiveSplit instance in the SDK and on the server.
    * The new ExclusiveSplit will be automatically stored in the 'objects' property
    * of the parent MicroflowObjectCollection element passed as argument.
    */
  def createIn(container: MicroflowObjectCollection): ExclusiveSplit = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
