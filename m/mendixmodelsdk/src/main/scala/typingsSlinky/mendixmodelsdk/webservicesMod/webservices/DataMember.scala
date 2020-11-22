package typingsSlinky.mendixmodelsdk.webservicesMod.webservices

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `WebServices`.
  */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataMember")
@js.native
abstract class DataMember protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsDataEntityBase: DataEntityBase = js.native
  
  def containerAsPublishedParameter: PublishedParameter = js.native
  
  def containerAsPublishedResource: PublishedResource = js.native
  
  def exposedName: String = js.native
  def exposedName_=(newValue: String): Unit = js.native
  
  def isKey: Boolean = js.native
  def isKey_=(newValue: Boolean): Unit = js.native
  
  def isLockedByContract: Boolean = js.native
  def isLockedByContract_=(newValue: Boolean): Unit = js.native
  
  def isNillable: Boolean = js.native
  
  def isNillableByContract: Boolean = js.native
  def isNillableByContract_=(newValue: Boolean): Unit = js.native
  
  def isNillable_=(newValue: Boolean): Unit = js.native
  
  def isOptional: Boolean = js.native
  
  def isOptionalByContract: Boolean = js.native
  def isOptionalByContract_=(newValue: Boolean): Unit = js.native
  
  def isOptional_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataMember")
@js.native
object DataMember extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
