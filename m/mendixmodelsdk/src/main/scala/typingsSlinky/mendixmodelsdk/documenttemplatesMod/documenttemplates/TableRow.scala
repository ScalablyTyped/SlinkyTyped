package typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/row-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TableRow")
@js.native
class TableRow protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def cells: IList[TableCell] = js.native
  
  def conditionSettings: ConditionSettings = js.native
  def conditionSettings_=(newValue: ConditionSettings): Unit = js.native
  
  def containerAsTable: Table = js.native
  
  @JSName("model")
  var model_FTableRow: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TableRow")
@js.native
object TableRow extends js.Object {
  
  /**
    * Creates and returns a new TableRow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TableRow = js.native
  
  /**
    * Creates and returns a new TableRow instance in the SDK and on the server.
    * The new TableRow will be automatically stored in the 'rows' property
    * of the parent Table element passed as argument.
    */
  def createIn(container: Table): TableRow = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
