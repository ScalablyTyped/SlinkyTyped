package typingsSlinky.mendixmodelsdk.distGenPagesMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.15.0: deleted
  * In version 7.1.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MasterDetailRegion")
@js.native
abstract class MasterDetailRegion protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMasterDetailRegion: IModel = js.native
  def `class`(): String = js.native
  def `class`(newValue: String): js.Any = js.native
  def containerAsMasterDetail(): MasterDetail = js.native
  def style(): String = js.native
  def style(newValue: String): js.Any = js.native
  def widget(): Widget | Null = js.native
  def widget(newValue: Widget): js.Any = js.native
  @JSName("widget")
  def widget_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MasterDetailRegion")
@js.native
object MasterDetailRegion extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

