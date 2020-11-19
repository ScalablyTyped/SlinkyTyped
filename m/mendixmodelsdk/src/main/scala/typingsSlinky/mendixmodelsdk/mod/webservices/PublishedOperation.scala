package typingsSlinky.mendixmodelsdk.mod.webservices

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "webservices.PublishedOperation")
@js.native
class PublishedOperation protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices.PublishedOperation {
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
@JSImport("mendixmodelsdk", "webservices.PublishedOperation")
@js.native
object PublishedOperation extends js.Object {
  
  /**
    * Creates and returns a new PublishedOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedOperation = js.native
  
  /**
    * Creates and returns a new PublishedOperation instance in the SDK and on the server.
    * The new PublishedOperation will be automatically stored in the 'operations' property
    * of the parent VersionedService element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.VersionedService): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.PublishedOperation = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
