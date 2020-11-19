package typingsSlinky.mendixmodelsdk.mod.documenttemplates

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "documenttemplates.GridSortItem")
@js.native
class GridSortItem protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.documenttemplates.GridSortItem {
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
@JSImport("mendixmodelsdk", "documenttemplates.GridSortItem")
@js.native
object GridSortItem extends js.Object {
  
  /**
    * Creates and returns a new GridSortItem instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.GridSortItem = js.native
  
  /**
    * Creates and returns a new GridSortItem instance in the SDK and on the server.
    * The new GridSortItem will be automatically stored in the 'sortItems' property
    * of the parent GridSortBar element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.GridSortBar): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.GridSortItem = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
