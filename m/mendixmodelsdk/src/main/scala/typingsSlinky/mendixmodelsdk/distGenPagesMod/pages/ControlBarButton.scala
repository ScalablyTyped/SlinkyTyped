package typingsSlinky.mendixmodelsdk.distGenPagesMod.pages

import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ControlBarButton")
@js.native
abstract class ControlBarButton protected () extends ControlBarItem {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 8.0.0: introduced
    */
  var appearance: Appearance = js.native
  var buttonStyle: ButtonStyle = js.native
  var caption: ClientTemplate = js.native
  /**
    * In version 8.0.0: deleted
    */
  var `class`: String = js.native
  var conditionalVisibilitySettings: ConditionalVisibilitySettings | Null = js.native
  var icon: Icon | Null = js.native
  /**
    * In version 8.0.0: deleted
    */
  var style: String = js.native
  var tooltip: Text = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ControlBarButton")
@js.native
object ControlBarButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

