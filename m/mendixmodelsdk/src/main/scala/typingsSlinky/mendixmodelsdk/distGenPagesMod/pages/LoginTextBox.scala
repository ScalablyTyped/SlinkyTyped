package typingsSlinky.mendixmodelsdk.distGenPagesMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.0.2: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginTextBox")
@js.native
abstract class LoginTextBox protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FLoginTextBox: IModel = js.native
  def label(): Text | Null = js.native
  def label(newValue: Text): js.Any = js.native
  def labelWidth(): Double = js.native
  def labelWidth(newValue: Double): js.Any = js.native
  @JSName("label")
  def label_Any(): js.Any = js.native
  def placeholder(): Text = js.native
  def placeholder(newValue: Text): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginTextBox")
@js.native
object LoginTextBox extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

