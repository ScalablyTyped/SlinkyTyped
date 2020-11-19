package typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DropZone")
@js.native
abstract class DropZone protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsDataView: DataView = js.native
  
  def containerAsDocumentTemplate: DocumentTemplate = js.native
  
  def containerAsTableRow: TableRow = js.native
  
  def containerAsTemplateGrid: TemplateGrid = js.native
  
  @JSName("model")
  var model_FDropZone: IModel = js.native
  
  def widget: Widget | Null = js.native
  def widget_=(newValue: Widget | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DropZone")
@js.native
object DropZone extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
