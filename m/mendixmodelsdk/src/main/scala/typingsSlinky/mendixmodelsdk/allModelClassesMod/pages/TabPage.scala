package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/tab-container relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.TabPage")
@js.native
class TabPage protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.TabPage")
@js.native
object TabPage extends js.Object {
  
  /**
    * Creates and returns a new TabPage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage = js.native
  
  /**
    * Creates and returns a new TabPage instance in the SDK and on the server.
    * The new TabPage will be automatically stored in the 'tabPages' property
    * of the parent TabContainer element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TabContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
