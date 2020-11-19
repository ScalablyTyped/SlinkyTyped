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
  * In version 8.9.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntityKeyPart because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEntityKey, name, `type` */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityKeyPart")
@js.native
class EntityKeyPart protected ()
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
  
  def containerAsEntityKey: EntityKey = js.native
  @JSName("containerAsEntityKey")
  val containerAsEntityKey_FEntityKeyPart: IEntityKey = js.native
  
  @JSName("model")
  var model_FEntityKeyPart: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FEntityKeyPart: String = js.native
  
  @JSName("qualifiedName")
  def qualifiedName_MEntityKeyPart: String | Null = js.native
  
  def `type`: AttributeType = js.native
  def type_=(newValue: AttributeType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("type")
  val type_FEntityKeyPart: IAttributeType = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityKeyPart")
@js.native
object EntityKeyPart extends js.Object {
  
  /**
    * Creates and returns a new EntityKeyPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EntityKeyPart = js.native
  
  /**
    * Creates and returns a new EntityKeyPart instance in the SDK and on the server.
    * The new EntityKeyPart will be automatically stored in the 'parts' property
    * of the parent EntityKey element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  def createIn(container: EntityKey): EntityKeyPart = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
