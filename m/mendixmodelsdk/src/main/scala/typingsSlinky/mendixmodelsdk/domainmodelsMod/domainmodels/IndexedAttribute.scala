package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.IndexedAttribute")
@js.native
class IndexedAttribute protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 7.14.0: introduced
    */
  def ascending: Boolean = js.native
  def ascending_=(newValue: Boolean): Unit = js.native
  
  def attribute: Attribute | Null = js.native
  def attribute_=(newValue: Attribute | Null): Unit = js.native
  
  def containerAsIndex: Index = js.native
  
  def `type`: IndexedAttributeType = js.native
  def type_=(newValue: IndexedAttributeType): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.IndexedAttribute")
@js.native
object IndexedAttribute extends js.Object {
  
  /**
    * Creates and returns a new IndexedAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): IndexedAttribute = js.native
  
  /**
    * Creates and returns a new IndexedAttribute instance in the SDK and on the server.
    * The new IndexedAttribute will be automatically stored in the 'attributes' property
    * of the parent Index element passed as argument.
    */
  def createIn(container: Index): IndexedAttribute = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
