package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonstructures {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `JsonStructures`.
    */
  /**
    * In version 6.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "jsonstructures.JsonElement")
  @js.native
  class JsonElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.jsonstructures.JsonElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object JsonElement {
    
    @JSImport("mendixmodelsdk", "jsonstructures.JsonElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "jsonstructures.JsonElement.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonElement = js.native
    
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * The new JsonElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "jsonstructures.JsonElement.createInElementUnderChildren")
    @js.native
    def createInElementUnderChildren(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element): typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonElement = js.native
    
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * The new JsonElement will be automatically stored in the 'elements' property
      * of the parent JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "jsonstructures.JsonElement.createInJsonStructureUnderElements")
    @js.native
    def createInJsonStructureUnderElements(container: typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure): typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonElement = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "jsonstructures.JsonElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "jsonstructures.JsonElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.jsonstructuresMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.jsonstructuresMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/json-structures relevant section in reference guide}
    *
    * In version 6.6.0: removed experimental
    * In version 6.2.0: introduced
    */
  @JSImport("mendixmodelsdk", "jsonstructures.JsonStructure")
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
  object JsonStructure {
    
    @JSImport("mendixmodelsdk", "jsonstructures.JsonStructure")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new JsonStructure unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "jsonstructures.JsonStructure.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "jsonstructures.JsonStructure.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "jsonstructures.JsonStructure.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.jsonstructuresMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.jsonstructuresMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
