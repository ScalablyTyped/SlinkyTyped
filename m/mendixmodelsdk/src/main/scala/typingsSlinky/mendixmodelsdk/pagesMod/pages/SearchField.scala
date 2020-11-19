package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SearchField")
@js.native
abstract class SearchField protected () extends ControlBarItem {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def caption: Text = js.native
  def caption_=(newValue: Text): Unit = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def customDateFormat: String = js.native
  def customDateFormat_=(newValue: String): Unit = js.native
  
  def defaultValue: String = js.native
  def defaultValue_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FSearchField: IModel = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def placeholder: Text = js.native
  def placeholder_=(newValue: Text): Unit = js.native
  
  def `type`: SearchFieldType = js.native
  def type_=(newValue: SearchFieldType): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SearchField")
@js.native
object SearchField extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
