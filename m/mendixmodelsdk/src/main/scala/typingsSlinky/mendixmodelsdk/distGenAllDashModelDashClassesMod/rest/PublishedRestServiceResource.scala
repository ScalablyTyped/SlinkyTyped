package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.rest

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-rest-resource relevant section in reference guide}
  *
  * In version 7.11.0: removed experimental
  * In version 7.7.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.PublishedRestServiceResource")
@js.native
class PublishedRestServiceResource protected ()
  extends typingsSlinky.mendixmodelsdk.distGenRestMod.rest.PublishedRestServiceResource {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.PublishedRestServiceResource")
@js.native
object PublishedRestServiceResource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new PublishedRestServiceResource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenRestMod.rest.PublishedRestServiceResource = js.native
  /**
    * Creates and returns a new PublishedRestServiceResource instance in the SDK and on the server.
    * The new PublishedRestServiceResource will be automatically stored in the 'resources' property
    * of the parent PublishedRestService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenRestMod.rest.PublishedRestService): typingsSlinky.mendixmodelsdk.distGenRestMod.rest.PublishedRestServiceResource = js.native
}

