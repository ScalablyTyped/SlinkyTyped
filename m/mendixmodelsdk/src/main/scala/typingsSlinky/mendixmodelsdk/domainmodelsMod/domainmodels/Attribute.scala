package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/attributes relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEntity, name, `type`, value */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Attribute")
@js.native
class Attribute protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsEntity: Entity = js.native
  @JSName("containerAsEntity")
  val containerAsEntity_FAttribute: IEntity = js.native
  
  def dataStorageGuid: String = js.native
  def dataStorageGuid_=(newValue: String): Unit = js.native
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FAttribute: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FAttribute: String = js.native
  
  @JSName("qualifiedName")
  def qualifiedName_MAttribute: String | Null = js.native
  
  def `type`: AttributeType = js.native
  def type_=(newValue: AttributeType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("type")
  val type_FAttribute: IAttributeType = js.native
  
  /**
    * In version 6.6.0: added public
    */
  def value: ValueType = js.native
  def value_=(newValue: ValueType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 6.6.0: added public
    */
  @JSName("value")
  val value_FAttribute: IValueType = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Attribute")
@js.native
object Attribute extends js.Object {
  
  /**
    * Creates and returns a new Attribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Attribute = js.native
  
  /**
    * Creates and returns a new Attribute instance in the SDK and on the server.
    * The new Attribute will be automatically stored in the 'attributes' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: Entity): Attribute = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
