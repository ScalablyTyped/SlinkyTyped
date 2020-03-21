package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.TypedTemplateArgument")
@js.native
abstract class TypedTemplateArgument protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FTypedTemplateArgument: IModel = js.native
  def containerAsTypedTemplate(): TypedTemplate = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.TypedTemplateArgument")
@js.native
object TypedTemplateArgument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

