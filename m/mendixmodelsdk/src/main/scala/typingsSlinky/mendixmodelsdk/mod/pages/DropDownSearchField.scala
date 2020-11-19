package typingsSlinky.mendixmodelsdk.mod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/search-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.DropDownSearchField")
@js.native
class DropDownSearchField protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.DropDownSearchField {
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
@JSImport("mendixmodelsdk", "pages.DropDownSearchField")
@js.native
object DropDownSearchField extends js.Object {
  
  /**
    * Creates and returns a new DropDownSearchField instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.DropDownSearchField = js.native
  
  /**
    * Creates and returns a new DropDownSearchField instance in the SDK and on the server.
    * The new DropDownSearchField will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ControlBar): typingsSlinky.mendixmodelsdk.pagesMod.pages.DropDownSearchField = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
