package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "jsonstructures")
@js.native
object jsonstructures extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `JsonStructures`.
    */
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  class JsonElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.jsonstructures.JsonElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/json-structures relevant section in reference guide}
    *
    * In version 6.6.0: removed experimental
    * In version 6.2.0: introduced
    */
  @js.native
  class JsonStructure protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.jsonstructures.JsonStructure {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /* static members */
  @js.native
  object JsonElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.jsonstructuresMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonElement = js.native
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * The new JsonElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInElementUnderChildren(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element): typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonElement = js.native
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * The new JsonElement will be automatically stored in the 'elements' property
      * of the parent JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure): typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonElement = js.native
  }
  
  /* static members */
  @js.native
  object JsonStructure extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.jsonstructuresMod.StructureVersionInfo = js.native
    /**
      * Creates a new JsonStructure unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure = js.native
  }
  
}

