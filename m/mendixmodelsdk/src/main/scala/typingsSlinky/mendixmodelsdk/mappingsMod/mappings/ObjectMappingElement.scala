package typingsSlinky.mendixmodelsdk.mappingsMod.mappings

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo
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
  def association: IAssociationBase | Null = js.native
  def associationQualifiedName: String | Null = js.native
  def association_=(newValue: IAssociationBase | Null): Unit = js.native
  def children: IList[MappingElement] = js.native
  def entity: IEntity | Null = js.native
  def entityQualifiedName: String | Null = js.native
  def entity_=(newValue: IEntity | Null): Unit = js.native
  /**
    * In version 6.4.0: introduced
    */
  def isDefaultType: Boolean = js.native
  def isDefaultType_=(newValue: Boolean): Unit = js.native
  def mappingMicroflowCall: MappingMicroflowCall | Null = js.native
  def mappingMicroflowCall_=(newValue: MappingMicroflowCall | Null): Unit = js.native
  def objectHandling: ObjectHandlingEnum = js.native
  def objectHandlingBackup: ObjectHandlingBackupEnum = js.native
  /**
    * In version 7.17.0: introduced
    */
  def objectHandlingBackupAllowOverride: Boolean = js.native
  def objectHandlingBackupAllowOverride_=(newValue: Boolean): Unit = js.native
  def objectHandlingBackup_=(newValue: ObjectHandlingBackupEnum): Unit = js.native
  def objectHandling_=(newValue: ObjectHandlingEnum): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectMappingElement")
@js.native
object ObjectMappingElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

