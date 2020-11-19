package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ColumnGrid")
@js.native
abstract class ColumnGrid protected () extends Grid {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def columns: IList[GridColumn] = js.native
  
  @JSName("model")
  var model_FColumnGrid: IModel = js.native
  
  def numberOfRows: Double = js.native
  def numberOfRows_=(newValue: Double): Unit = js.native
  
  def showEmptyRows: Boolean = js.native
  def showEmptyRows_=(newValue: Boolean): Unit = js.native
  
  def tooltipPage: IPage | Null = js.native
  
  def tooltipPageQualifiedName: String | Null = js.native
  
  def tooltipPage_=(newValue: IPage | Null): Unit = js.native
  
  def widthUnit: UnitEnum = js.native
  def widthUnit_=(newValue: UnitEnum): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ColumnGrid")
@js.native
object ColumnGrid extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
