package typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.JavaDataSetSource")
@js.native
class JavaDataSetSource protected ()
  extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.JavaDataSetSource")
@js.native
object JavaDataSetSource extends js.Object {
  
  /**
    * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource = js.native
  
  /**
    * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
    * The new JavaDataSetSource will be automatically stored in the 'source' property
    * of the parent DataSet element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
