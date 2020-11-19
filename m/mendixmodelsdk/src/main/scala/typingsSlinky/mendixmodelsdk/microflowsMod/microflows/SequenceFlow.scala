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
  * See: {@link https://docs.mendix.com/refguide7/sequence-flow relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SequenceFlow")
@js.native
class SequenceFlow protected () extends Flow {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def caseValue: CaseValue = js.native
  def caseValue_=(newValue: CaseValue): Unit = js.native
  
  def isErrorHandler: Boolean = js.native
  def isErrorHandler_=(newValue: Boolean): Unit = js.native
  
  @JSName("model")
  var model_FSequenceFlow: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SequenceFlow")
@js.native
object SequenceFlow extends js.Object {
  
  /**
    * Creates and returns a new SequenceFlow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SequenceFlow = js.native
  
  /**
    * Creates and returns a new SequenceFlow instance in the SDK and on the server.
    * The new SequenceFlow will be automatically stored in the 'flows' property
    * of the parent MicroflowBase element passed as argument.
    */
  def createIn(container: MicroflowBase): SequenceFlow = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
