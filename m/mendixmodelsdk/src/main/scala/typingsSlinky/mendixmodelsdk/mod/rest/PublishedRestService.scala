package typingsSlinky.mendixmodelsdk.mod.rest

import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.restMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/published-rest-services relevant section in reference guide}
  *
  * In version 7.11.0: removed experimental
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk", "rest.PublishedRestService")
@js.native
class PublishedRestService protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.rest.PublishedRestService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "rest.PublishedRestService")
@js.native
object PublishedRestService extends js.Object {
  
  /**
    * Creates a new PublishedRestService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.restMod.rest.PublishedRestService = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
