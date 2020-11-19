package typingsSlinky.mendixmodelsdk.mod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.NavigationSource")
@js.native
class NavigationSource protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.NavigationSource {
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
@JSImport("mendixmodelsdk", "pages.NavigationSource")
@js.native
object NavigationSource extends js.Object {
  
  /**
    * Creates and returns a new NavigationSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationSource = js.native
  
  /**
    * Creates and returns a new NavigationSource instance in the SDK and on the server.
    * The new NavigationSource will be automatically stored in the 'menuSource' property
    * of the parent MenuWidget element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.MenuWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationSource = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
