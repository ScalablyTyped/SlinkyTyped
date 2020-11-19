package typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets

import typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/data-sets relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSet")
@js.native
class DataSet protected ()
  extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSet")
@js.native
object DataSet extends js.Object {
  
  /**
    * Creates a new DataSet unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSet = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
