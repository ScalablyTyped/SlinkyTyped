package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.commonMod.common.IPoint
import typingsSlinky.mendixmodelsdk.commonMod.common.ISize
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Microflows`.
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowObject")
@js.native
abstract class MicroflowObject protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMicroflowObject: IModel = js.native
  def containerAsMicroflowObjectCollection: MicroflowObjectCollection = js.native
  def relativeMiddlePoint: IPoint = js.native
  def relativeMiddlePoint(newValue: IPoint): js.Any = js.native
  def size: ISize = js.native
  def size(newValue: ISize): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowObject")
@js.native
object MicroflowObject extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

