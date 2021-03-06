package typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices

import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/published-web-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedWebService")
@js.native
class PublishedWebService protected ()
  extends typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedWebService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
object PublishedWebService {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedWebService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PublishedWebService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedWebService.createIn")
  @js.native
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedWebService = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedWebService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedWebService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
