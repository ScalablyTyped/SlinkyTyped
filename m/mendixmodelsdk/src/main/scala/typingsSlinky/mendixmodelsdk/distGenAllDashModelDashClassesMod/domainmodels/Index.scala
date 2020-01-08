package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/indexes relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.Index")
@js.native
class Index protected ()
  extends typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.Index {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.Index")
@js.native
object Index extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Index instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.Index = js.native
  /**
    * Creates and returns a new Index instance in the SDK and on the server.
    * The new Index will be automatically stored in the 'indexes' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.Entity): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.Index = js.native
}

