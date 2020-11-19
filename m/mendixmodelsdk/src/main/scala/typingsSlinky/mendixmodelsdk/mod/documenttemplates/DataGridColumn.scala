package typingsSlinky.mendixmodelsdk.mod.documenttemplates

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/columns-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.DataGridColumn")
@js.native
class DataGridColumn protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.documenttemplates.DataGridColumn {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "documenttemplates.DataGridColumn")
@js.native
object DataGridColumn extends js.Object {
  
  /**
    * Creates and returns a new DataGridColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn = js.native
  
  /**
    * Creates and returns a new DataGridColumn instance in the SDK and on the server.
    * The new DataGridColumn will be automatically stored in the 'columns' property
    * of the parent DataGrid element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGrid): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
