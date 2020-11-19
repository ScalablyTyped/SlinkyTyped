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

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridRow")
@js.native
class LayoutGridRow protected () extends Element {
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
  
  def columns: IList[LayoutGridColumn] = js.native
  
  def conditionalVisibilitySettings: ConditionalVisibilitySettings | Null = js.native
  def conditionalVisibilitySettings_=(newValue: ConditionalVisibilitySettings | Null): Unit = js.native
  
  def containerAsLayoutGrid: LayoutGrid = js.native
  
  /**
    * In version 8.3.0: introduced
    */
  def horizontalAlignment: LayoutGridAlignment = js.native
  def horizontalAlignment_=(newValue: LayoutGridAlignment): Unit = js.native
  
  @JSName("model")
  var model_FLayoutGridRow: IModel = js.native
  
  /**
    * In version 8.3.0: introduced
    */
  def spacingBetweenColumns: Boolean = js.native
  def spacingBetweenColumns_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.3.0: introduced
    */
  def verticalAlignment: LayoutGridAlignment = js.native
  def verticalAlignment_=(newValue: LayoutGridAlignment): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridRow")
@js.native
object LayoutGridRow extends js.Object {
  
  /**
    * Creates and returns a new LayoutGridRow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): LayoutGridRow = js.native
  
  /**
    * Creates and returns a new LayoutGridRow instance in the SDK and on the server.
    * The new LayoutGridRow will be automatically stored in the 'rows' property
    * of the parent LayoutGrid element passed as argument.
    */
  def createIn(container: LayoutGrid): LayoutGridRow = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
