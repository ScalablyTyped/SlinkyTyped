package typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetTranslation")
@js.native
class WidgetTranslation protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsWidgetValueType: WidgetValueType = js.native
  
  def languageCode: String = js.native
  def languageCode_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FWidgetTranslation: IModel = js.native
  
  def text: String = js.native
  def text_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetTranslation")
@js.native
object WidgetTranslation extends js.Object {
  
  /**
    * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WidgetTranslation = js.native
  
  /**
    * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
    * The new WidgetTranslation will be automatically stored in the 'translations' property
    * of the parent WidgetValueType element passed as argument.
    */
  def createIn(container: WidgetValueType): WidgetTranslation = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
