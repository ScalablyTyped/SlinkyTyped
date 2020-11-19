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

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetEnumerationValue")
@js.native
class WidgetEnumerationValue protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  
  def containerAsWidgetValueType: WidgetValueType = js.native
  
  def key: String = js.native
  def key_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FWidgetEnumerationValue: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetEnumerationValue")
@js.native
object WidgetEnumerationValue extends js.Object {
  
  /**
    * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WidgetEnumerationValue = js.native
  
  /**
    * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
    * The new WidgetEnumerationValue will be automatically stored in the 'enumerationValues' property
    * of the parent WidgetValueType element passed as argument.
    */
  def createIn(container: WidgetValueType): WidgetEnumerationValue = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
