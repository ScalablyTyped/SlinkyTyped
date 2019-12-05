package typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenSecurityMod.security.IModuleRole
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetModuleRoleAccess")
@js.native
class DataSetModuleRoleAccess protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsDataSetAccess: DataSetAccess = js.native
  @JSName("model")
  var model_DataSetModuleRoleAccess: IModel = js.native
  var moduleRole: IModuleRole | Null = js.native
  val moduleRoleQualifiedName: String | Null = js.native
  val parameterAccessList: IList[DataSetParameterAccess] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetModuleRoleAccess")
@js.native
object DataSetModuleRoleAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetModuleRoleAccess = js.native
  /**
    * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
    * The new DataSetModuleRoleAccess will be automatically stored in the 'moduleRoleAccessList' property
    * of the parent DataSetAccess element passed as argument.
    */
  def createIn(container: DataSetAccess): DataSetModuleRoleAccess = js.native
}

