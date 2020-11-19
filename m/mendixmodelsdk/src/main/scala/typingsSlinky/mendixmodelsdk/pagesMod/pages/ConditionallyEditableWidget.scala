package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionallyEditableWidget")
@js.native
abstract class ConditionallyEditableWidget protected () extends ConditionallyVisibleWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def conditionalEditabilitySettings: ConditionalEditabilitySettings | Null = js.native
  def conditionalEditabilitySettings_=(newValue: ConditionalEditabilitySettings | Null): Unit = js.native
  
  def editable: EditableEnum = js.native
  def editable_=(newValue: EditableEnum): Unit = js.native
  
  @JSName("model")
  var model_FConditionallyEditableWidget: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionallyEditableWidget")
@js.native
object ConditionallyEditableWidget extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
