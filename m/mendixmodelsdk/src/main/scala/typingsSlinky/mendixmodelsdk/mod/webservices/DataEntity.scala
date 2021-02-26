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

@JSImport("mendixmodelsdk", "webservices.DataEntity")
@js.native
class DataEntity protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices.DataEntity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DataEntity {
  
  @JSImport("mendixmodelsdk", "webservices.DataEntity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.DataEntity.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.DataEntity.createInDataEntityBaseUnderChildMembers")
  @js.native
  def createInDataEntityBaseUnderChildMembers(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataEntityBase): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedParameter element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.DataEntity.createInPublishedParameterUnderDataEntity")
  @js.native
  def createInPublishedParameterUnderDataEntity(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedParameter): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedResource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.DataEntity.createInPublishedResourceUnderDataEntity")
  @js.native
  def createInPublishedResourceUnderDataEntity(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedResource): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.DataEntity.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.DataEntity.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
