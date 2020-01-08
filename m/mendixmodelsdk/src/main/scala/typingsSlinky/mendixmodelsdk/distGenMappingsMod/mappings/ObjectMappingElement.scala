package typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAssociationBase
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectMappingElement")
@js.native
abstract class ObjectMappingElement protected () extends MappingElement {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FObjectMappingElement: IModel = js.native
  def association(): IAssociationBase | Null = js.native
  def association(newValue: IAssociationBase): js.Any = js.native
  def associationQualifiedName(): String | Null = js.native
  @JSName("association")
  def association_Any(): js.Any = js.native
  def children(): IList[MappingElement] = js.native
  def entity(): IEntity | Null = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName(): String | Null = js.native
  @JSName("entity")
  def entity_Any(): js.Any = js.native
  /**
    * In version 6.4.0: introduced
    */
  def isDefaultType(): Boolean = js.native
  def isDefaultType(newValue: Boolean): js.Any = js.native
  def mappingMicroflowCall(): MappingMicroflowCall | Null = js.native
  def mappingMicroflowCall(newValue: MappingMicroflowCall): js.Any = js.native
  @JSName("mappingMicroflowCall")
  def mappingMicroflowCall_Any(): js.Any = js.native
  def objectHandling(): ObjectHandlingEnum = js.native
  def objectHandling(newValue: ObjectHandlingEnum): js.Any = js.native
  def objectHandlingBackup(): ObjectHandlingBackupEnum = js.native
  def objectHandlingBackup(newValue: ObjectHandlingBackupEnum): js.Any = js.native
  /**
    * In version 7.17.0: introduced
    */
  def objectHandlingBackupAllowOverride(): Boolean = js.native
  def objectHandlingBackupAllowOverride(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectMappingElement")
@js.native
object ObjectMappingElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

