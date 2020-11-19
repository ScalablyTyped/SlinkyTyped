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

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetPropertyType")
@js.native
class WidgetPropertyType protected () extends Element {
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
  
  def category: String = js.native
  def category_=(newValue: String): Unit = js.native
  
  def containerAsWidgetObjectType: WidgetObjectType = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def isDefault: Boolean = js.native
  def isDefault_=(newValue: Boolean): Unit = js.native
  
  def key: String = js.native
  def key_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FWidgetPropertyType: IModel = js.native
  
  /**
    * In version 7.13.0: added optional
    */
  def valueType: WidgetValueType | Null = js.native
  def valueType_=(newValue: WidgetValueType | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetPropertyType")
@js.native
object WidgetPropertyType extends js.Object {
  
  /**
    * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WidgetPropertyType = js.native
  
  /**
    * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
    * The new WidgetPropertyType will be automatically stored in the 'propertyTypes' property
    * of the parent WidgetObjectType element passed as argument.
    */
  def createIn(container: WidgetObjectType): WidgetPropertyType = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
