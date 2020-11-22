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

/**
  * In version 8.12.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntityCapabilities because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEntity, countable */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityCapabilities")
@js.native
class EntityCapabilities protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsEntity: Entity = js.native
  @JSName("containerAsEntity")
  val containerAsEntity_FEntityCapabilities: IEntity = js.native
  
  /**
    * In version 8.14.0: added public
    */
  def countable: Boolean = js.native
  def countable_=(newValue: Boolean): Unit = js.native
  /**
    * In version 8.14.0: added public
    */
  @JSName("countable")
  val countable_FEntityCapabilities: Boolean = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityCapabilities")
@js.native
object EntityCapabilities extends js.Object {
  
  /**
    * Creates and returns a new EntityCapabilities instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EntityCapabilities = js.native
  
  /**
    * Creates and returns a new EntityCapabilities instance in the SDK and on the server.
    * The new EntityCapabilities will be automatically stored in the 'capabilities' property
    * of the parent Entity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.12.0 and higher
    */
  def createIn(container: Entity): EntityCapabilities = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
