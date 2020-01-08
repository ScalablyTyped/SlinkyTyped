package typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataEntityBase")
@js.native
abstract class DataEntityBase protected () extends DataMember {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataEntityBase: IModel = js.native
  def childMembers(): IList[DataMember] = js.native
  def entity(): IEntity | Null = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName(): String | Null = js.native
  @JSName("entity")
  def entity_Any(): js.Any = js.native
  def exposedItemName(): String = js.native
  def exposedItemName(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataEntityBase")
@js.native
object DataEntityBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

