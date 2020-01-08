package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.datasets

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint")
@js.native
class DataSetDateTimeConstraint protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.datasets.DataSetDateTimeConstraint {
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
@JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint")
@js.native
object DataSetDateTimeConstraint extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetDateTimeConstraint = js.native
  /**
    * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
    * The new DataSetDateTimeConstraint will be automatically stored in the 'constraints' property
    * of the parent DataSetParameter element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetParameter): typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetDateTimeConstraint = js.native
}

