package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.commonMod.common.ISize
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Flow")
@js.native
abstract class Flow protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsMicroflowBase: MicroflowBase = js.native
  
  def destination: MicroflowObject = js.native
  
  def destinationBezierVector: ISize = js.native
  def destinationBezierVector_=(newValue: ISize): Unit = js.native
  
  def destinationConnectionIndex: Double = js.native
  def destinationConnectionIndex_=(newValue: Double): Unit = js.native
  
  def destination_=(newValue: MicroflowObject): Unit = js.native
  
  @JSName("model")
  var model_FFlow: IModel = js.native
  
  def origin: MicroflowObject = js.native
  
  def originBezierVector: ISize = js.native
  def originBezierVector_=(newValue: ISize): Unit = js.native
  
  def originConnectionIndex: Double = js.native
  def originConnectionIndex_=(newValue: Double): Unit = js.native
  
  def origin_=(newValue: MicroflowObject): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Flow")
@js.native
object Flow extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
