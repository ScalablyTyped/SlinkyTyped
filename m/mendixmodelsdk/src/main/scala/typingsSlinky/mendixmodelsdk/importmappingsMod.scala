package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.DataType
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.IMappingDocument
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingDocument
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ValueMappingElement
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importmappingsMod {
  
  @JSImport("mendixmodelsdk/dist/gen/importmappings", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object importmappings {
    
    /**
      * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
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
    - typingsSlinky.mendixmodelsdk.mappingsMod.mappings.IMappingDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportMapping")
    @js.native
    class ImportMapping protected () extends MappingDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MImportMapping: FolderBase = js.native
      
      /**
        * In version 7.16.0: deleted
        */
      def parameter: IEntity | Null = js.native
      
      def parameterQualifiedName: String | Null = js.native
      
      /**
        * In version 7.16.0: introduced
        */
      def parameterType: DataType = js.native
      def parameterType_=(newValue: DataType): Unit = js.native
      
      def parameter_=(newValue: IEntity | Null): Unit = js.native
      
      def useSubtransactionsForMicroflows: Boolean = js.native
      def useSubtransactionsForMicroflows_=(newValue: Boolean): Unit = js.native
    }
    object ImportMapping {
      
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportMapping")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ImportMapping unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportMapping.createIn")
      @js.native
      def createIn(container: IFolderBase): ImportMapping = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportMapping.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportMapping.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportObjectMappingElement")
    @js.native
    class ImportObjectMappingElement protected () extends ObjectMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object ImportObjectMappingElement {
      
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportObjectMappingElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportObjectMappingElement.create")
      @js.native
      def create(model: IModel): ImportObjectMappingElement = js.native
      
      /**
        * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
        * The new ImportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
        * of the parent mappings.MappingDocument element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportObjectMappingElement.createInMappingDocumentUnderRootMappingElements")
      @js.native
      def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): ImportObjectMappingElement = js.native
      
      /**
        * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
        * The new ImportObjectMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportObjectMappingElement.createInObjectMappingElementUnderChildren")
      @js.native
      def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): ImportObjectMappingElement = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportObjectMappingElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportObjectMappingElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportValueMappingElement")
    @js.native
    class ImportValueMappingElement protected () extends ValueMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object ImportValueMappingElement {
      
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportValueMappingElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportValueMappingElement.create")
      @js.native
      def create(model: IModel): ImportValueMappingElement = js.native
      
      /**
        * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
        * The new ImportValueMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportValueMappingElement.createIn")
      @js.native
      def createIn(container: ObjectMappingElement): ImportValueMappingElement = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportValueMappingElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings.ImportValueMappingElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ImportMappings`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
      */
    @js.native
    trait IImportMapping extends IMappingDocument
  }
}
