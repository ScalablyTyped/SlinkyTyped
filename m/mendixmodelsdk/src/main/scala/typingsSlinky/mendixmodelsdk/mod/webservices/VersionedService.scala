package typingsSlinky.mendixmodelsdk.mod.webservices

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/published-web-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "webservices.VersionedService")
@js.native
class VersionedService protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices.VersionedService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object VersionedService {
  
  @JSImport("mendixmodelsdk", "webservices.VersionedService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new VersionedService instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.VersionedService.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.VersionedService = js.native
  
  /**
    * Creates and returns a new VersionedService instance in the SDK and on the server.
    * The new VersionedService will be automatically stored in the 'versionedServices' property
    * of the parent PublishedServiceBase element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.VersionedService.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedServiceBase): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.VersionedService = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.VersionedService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.VersionedService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
