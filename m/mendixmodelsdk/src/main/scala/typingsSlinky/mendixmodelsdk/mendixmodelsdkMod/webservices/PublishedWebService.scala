package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.webservices

import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "webservices.PublishedWebService")
@js.native
class PublishedWebService protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices.PublishedWebService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "webservices.PublishedWebService")
@js.native
object PublishedWebService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new PublishedWebService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedWebService = js.native
}

