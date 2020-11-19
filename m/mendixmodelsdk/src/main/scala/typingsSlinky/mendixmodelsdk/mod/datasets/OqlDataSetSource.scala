package typingsSlinky.mendixmodelsdk.mod.datasets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "datasets.OqlDataSetSource")
@js.native
class OqlDataSetSource protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets.OqlDataSetSource {
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
@JSImport("mendixmodelsdk", "datasets.OqlDataSetSource")
@js.native
object OqlDataSetSource extends js.Object {
  
  /**
    * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.OqlDataSetSource = js.native
  
  /**
    * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
    * The new OqlDataSetSource will be automatically stored in the 'source' property
    * of the parent DataSet element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.OqlDataSetSource = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
