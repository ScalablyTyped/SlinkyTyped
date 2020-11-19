package typingsSlinky.mendixmodelsdk.mod.webservices

import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/published-app-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "webservices.PublishedAppService")
@js.native
class PublishedAppService protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices.PublishedAppService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "webservices.PublishedAppService")
@js.native
object PublishedAppService extends js.Object {
  
  /**
    * Creates a new PublishedAppService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedAppService = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
