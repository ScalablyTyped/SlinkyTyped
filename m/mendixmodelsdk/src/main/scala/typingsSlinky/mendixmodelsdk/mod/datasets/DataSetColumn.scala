package typingsSlinky.mendixmodelsdk.mod.datasets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "datasets.DataSetColumn")
@js.native
class DataSetColumn protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.DataSetColumn {
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
@JSImport("mendixmodelsdk", "datasets.DataSetColumn")
@js.native
object DataSetColumn extends js.Object {
  
  /**
    * Creates and returns a new DataSetColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetColumn = js.native
  
  /**
    * Creates and returns a new DataSetColumn instance in the SDK and on the server.
    * The new DataSetColumn will be automatically stored in the 'columns' property
    * of the parent JavaDataSetSource element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetColumn = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
