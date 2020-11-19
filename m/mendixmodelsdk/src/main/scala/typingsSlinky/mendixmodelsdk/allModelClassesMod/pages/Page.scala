package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/page relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.Page")
@js.native
class Page protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.Page {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.Page")
@js.native
object Page extends js.Object {
  
  /**
    * Creates a new Page unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.pagesMod.pages.Page = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
