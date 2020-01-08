package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices

import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedResource")
@js.native
abstract class PublishedResource protected ()
  extends typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedResource {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedResource")
@js.native
object PublishedResource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

