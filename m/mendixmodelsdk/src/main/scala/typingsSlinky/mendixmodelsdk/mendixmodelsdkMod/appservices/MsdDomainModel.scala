package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.appservices

import typingsSlinky.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "appservices.MsdDomainModel")
@js.native
class MsdDomainModel protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.appservices.MsdDomainModel {
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
@JSImport("mendixmodelsdk", "appservices.MsdDomainModel")
@js.native
object MsdDomainModel extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.MsdDomainModel = js.native
  /**
    * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
    * The new MsdDomainModel will be automatically stored in the 'domainModel' property
    * of the parent Msd element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.Msd): typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.MsdDomainModel = js.native
}

