package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.IMxSchema
import typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.MxSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonstructuresMod {
  
  @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object jsonstructures {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `JsonStructures`.
      */
    /**
      * In version 6.6.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures.JsonElement")
    @js.native
    class JsonElement protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def originalValue: String = js.native
      def originalValue_=(newValue: String): Unit = js.native
    }
    object JsonElement {
      
      @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures.JsonElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new JsonElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures.JsonElement.create")
      @js.native
      def create(model: IModel): JsonElement = js.native
      
      /**
        * Creates and returns a new JsonElement instance in the SDK and on the server.
        * The new JsonElement will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures.JsonElement.createInElementUnderChildren")
      @js.native
      def createInElementUnderChildren(container: Element): JsonElement = js.native
      
      /**
        * Creates and returns a new JsonElement instance in the SDK and on the server.
        * The new JsonElement will be automatically stored in the 'elements' property
        * of the parent JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures.JsonElement.createInJsonStructureUnderElements")
      @js.native
      def createInJsonStructureUnderElements(container: JsonStructure): JsonElement = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures.JsonElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures.JsonElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/json-structures relevant section in reference guide}
      *
      * In version 6.6.0: removed experimental
      * In version 6.2.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.IMxSchema because Already inherited
    - typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.IJsonStructure because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures.JsonStructure")
    @js.native
    class JsonStructure protected () extends MxSchema {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MJsonStructure: FolderBase = js.native
      
      /**
        * In version 6.6.0: introduced
        */
      def elements: IList[Element] = js.native
      
      def jsonSnippet: String = js.native
      def jsonSnippet_=(newValue: String): Unit = js.native
    }
    object JsonStructure {
      
      @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures.JsonStructure")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new JsonStructure unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures.JsonStructure.createIn")
      @js.native
      def createIn(container: IFolderBase): JsonStructure = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures.JsonStructure.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures.JsonStructure.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/json-structures relevant section in reference guide}
      *
      * In version 6.6.0: removed experimental
      * In version 6.2.0: introduced
      */
    @js.native
    trait IJsonStructure extends IMxSchema
  }
}
