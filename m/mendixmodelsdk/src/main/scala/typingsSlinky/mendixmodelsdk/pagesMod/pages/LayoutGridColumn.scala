package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridColumn")
@js.native
class LayoutGridColumn protected () extends Element {
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
  def appearance: Appearance = js.native
  def appearance_=(newValue: Appearance): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  
  def containerAsLayoutGridRow: LayoutGridRow = js.native
  
  @JSName("model")
  var model_FLayoutGridColumn: IModel = js.native
  
  /**
    * In version 8.3.0: introduced
    */
  def phoneWeight: Double = js.native
  def phoneWeight_=(newValue: Double): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.3.0: introduced
    */
  def tabletWeight: Double = js.native
  def tabletWeight_=(newValue: Double): Unit = js.native
  
  /**
    * In version 8.3.0: introduced
    */
  def verticalAlignment: LayoutGridAlignment = js.native
  def verticalAlignment_=(newValue: LayoutGridAlignment): Unit = js.native
  
  def weight: Double = js.native
  def weight_=(newValue: Double): Unit = js.native
  
  /**
    * In version 7.15.0: deleted
    */
  def widget: Widget | Null = js.native
  def widget_=(newValue: Widget | Null): Unit = js.native
  
  /**
    * In version 7.15.0: introduced
    */
  def widgets: IList[Widget] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridColumn")
@js.native
object LayoutGridColumn extends js.Object {
  
  /**
    * Creates and returns a new LayoutGridColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): LayoutGridColumn = js.native
  
  /**
    * Creates and returns a new LayoutGridColumn instance in the SDK and on the server.
    * The new LayoutGridColumn will be automatically stored in the 'columns' property
    * of the parent LayoutGridRow element passed as argument.
    */
  def createIn(container: LayoutGridRow): LayoutGridColumn = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
