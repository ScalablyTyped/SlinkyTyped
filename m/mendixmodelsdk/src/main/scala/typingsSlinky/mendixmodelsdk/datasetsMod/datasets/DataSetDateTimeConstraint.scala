package typingsSlinky.mendixmodelsdk.datasetsMod.datasets

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetDateTimeConstraint")
@js.native
class DataSetDateTimeConstraint protected () extends DataSetParameterConstraint {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def length: DateTimeIntervalLength = js.native
  def length_=(newValue: DateTimeIntervalLength): Unit = js.native
  
  def modifier: DateTimeIntervalModifier = js.native
  def modifier_=(newValue: DateTimeIntervalModifier): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetDateTimeConstraint")
@js.native
object DataSetDateTimeConstraint extends js.Object {
  
  /**
    * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetDateTimeConstraint = js.native
  
  /**
    * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
    * The new DataSetDateTimeConstraint will be automatically stored in the 'constraints' property
    * of the parent DataSetParameter element passed as argument.
    */
  def createIn(container: DataSetParameter): DataSetDateTimeConstraint = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
