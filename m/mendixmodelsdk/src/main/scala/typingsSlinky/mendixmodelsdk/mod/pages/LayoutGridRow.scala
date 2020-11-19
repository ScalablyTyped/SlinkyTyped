package typingsSlinky.mendixmodelsdk.mod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.LayoutGridRow")
@js.native
class LayoutGridRow protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.LayoutGridRow {
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
@JSImport("mendixmodelsdk", "pages.LayoutGridRow")
@js.native
object LayoutGridRow extends js.Object {
  
  /**
    * Creates and returns a new LayoutGridRow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridRow = js.native
  
  /**
    * Creates and returns a new LayoutGridRow instance in the SDK and on the server.
    * The new LayoutGridRow will be automatically stored in the 'rows' property
    * of the parent LayoutGrid element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGrid): typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridRow = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
