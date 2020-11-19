package typingsSlinky.mendixmodelsdk.datasetsMod.datasets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.OqlDataSetSource")
@js.native
class OqlDataSetSource protected () extends DataSetSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def ignoreErrorsInQuery: Boolean = js.native
  def ignoreErrorsInQuery_=(newValue: Boolean): Unit = js.native
  
  @JSName("model")
  var model_FOqlDataSetSource: IModel = js.native
  
  /**
    * The value of this property is conceptually of type oql.OqlQuery.
    */
  def query: String = js.native
  def query_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.OqlDataSetSource")
@js.native
object OqlDataSetSource extends js.Object {
  
  /**
    * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): OqlDataSetSource = js.native
  
  /**
    * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
    * The new OqlDataSetSource will be automatically stored in the 'source' property
    * of the parent DataSet element passed as argument.
    */
  def createIn(container: DataSet): OqlDataSetSource = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
