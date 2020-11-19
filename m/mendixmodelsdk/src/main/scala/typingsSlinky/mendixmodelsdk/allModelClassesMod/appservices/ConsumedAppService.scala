package typingsSlinky.mendixmodelsdk.allModelClassesMod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/consumed-app-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.ConsumedAppService")
@js.native
class ConsumedAppService protected ()
  extends typingsSlinky.mendixmodelsdk.appservicesMod.appservices.ConsumedAppService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.ConsumedAppService")
@js.native
object ConsumedAppService extends js.Object {
  
  /**
    * Creates a new ConsumedAppService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.ConsumedAppService = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
