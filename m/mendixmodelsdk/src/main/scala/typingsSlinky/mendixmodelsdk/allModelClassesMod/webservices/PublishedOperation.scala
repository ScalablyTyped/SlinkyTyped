package typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices

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

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedOperation")
@js.native
class PublishedOperation protected ()
  extends typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedOperation {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object PublishedOperation {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedOperation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PublishedOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedOperation.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedOperation = js.native
  
  /**
    * Creates and returns a new PublishedOperation instance in the SDK and on the server.
    * The new PublishedOperation will be automatically stored in the 'operations' property
    * of the parent VersionedService element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedOperation.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.VersionedService): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedOperation = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedOperation.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedOperation.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
