package typingsSlinky.mendixmodelsdk.allModelClassesMod.messagedefinitions

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element
import typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntity")
@js.native
class ExposedEntity protected ()
  extends typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntity")
@js.native
object ExposedEntity extends js.Object {
  
  /**
    * Creates and returns a new ExposedEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
  
  /**
    * Creates and returns a new ExposedEntity instance in the SDK and on the server.
    * The new ExposedEntity will be automatically stored in the 'children' property
    * of the parent mappings.Element element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInElementUnderChildren(container: Element): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
  
  /**
    * Creates and returns a new ExposedEntity instance in the SDK and on the server.
    * The new ExposedEntity will be automatically stored in the 'exposedEntity' property
    * of the parent EntityMessageDefinition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInEntityMessageDefinitionUnderExposedEntity(
    container: typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition
  ): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
  
  /**
    * Creates and returns a new ExposedEntity instance in the SDK and on the server.
    * The new ExposedEntity will be automatically stored in the 'elements' property
    * of the parent jsonstructures.JsonStructure element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
