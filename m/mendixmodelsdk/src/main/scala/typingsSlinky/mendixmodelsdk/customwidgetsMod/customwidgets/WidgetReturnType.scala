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

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetReturnType")
@js.native
class WidgetReturnType protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsWidgetValueType: WidgetValueType = js.native
  
  def entityProperty: String = js.native
  def entityProperty_=(newValue: String): Unit = js.native
  
  def isList: Boolean = js.native
  def isList_=(newValue: Boolean): Unit = js.native
  
  @JSName("model")
  var model_FWidgetReturnType: IModel = js.native
  
  def `type`: WidgetReturnTypeEnum = js.native
  def type_=(newValue: WidgetReturnTypeEnum): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetReturnType")
@js.native
object WidgetReturnType extends js.Object {
  
  /**
    * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WidgetReturnType = js.native
  
  /**
    * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
    * The new WidgetReturnType will be automatically stored in the 'returnType' property
    * of the parent WidgetValueType element passed as argument.
    */
  def createIn(container: WidgetValueType): WidgetReturnType = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
