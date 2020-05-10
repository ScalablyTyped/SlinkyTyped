package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionallyVisibleWidget")
@js.native
abstract class ConditionallyVisibleWidget protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FConditionallyVisibleWidget: IModel = js.native
  def conditionalVisibilitySettings(): js.Any = js.native
  def conditionalVisibilitySettings(newValue: ConditionalVisibilitySettings): js.Any = js.native
  @JSName("conditionalVisibilitySettings")
  def conditionalVisibilitySettings_Union: ConditionalVisibilitySettings | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionallyVisibleWidget")
@js.native
object ConditionallyVisibleWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

