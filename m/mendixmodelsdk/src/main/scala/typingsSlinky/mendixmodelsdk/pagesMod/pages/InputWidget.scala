package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputWidget")
@js.native
abstract class InputWidget protected () extends ConditionallyEditableWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FInputWidget: IModel = js.native
  def label(): js.Any = js.native
  def label(newValue: Text): js.Any = js.native
  def labelTemplate(): js.Any = js.native
  def labelTemplate(newValue: ClientTemplate): js.Any = js.native
  /**
    * In version 7.18.0: introduced
    */
  @JSName("labelTemplate")
  def labelTemplate_Union: ClientTemplate | Null = js.native
  /**
    * In version 7.18.0: deleted
    */
  @JSName("label")
  def label_Union: Text | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.InputWidget")
@js.native
object InputWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

