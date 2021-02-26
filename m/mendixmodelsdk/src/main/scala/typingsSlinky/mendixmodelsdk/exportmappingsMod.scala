package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.IMappingDocument
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingDocument
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ValueMappingElement
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.NullValueOption
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportmappingsMod {
  
  @JSImport("mendixmodelsdk/dist/gen/exportmappings", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object exportmappings {
    
    /**
      * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
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
    - typingsSlinky.mendixmodelsdk.exportmappingsMod.exportmappings.IExportMapping because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportMapping")
    @js.native
    class ExportMapping protected () extends MappingDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MExportMapping: FolderBase = js.native
      
      def isHeader: Boolean = js.native
      def isHeader_=(newValue: Boolean): Unit = js.native
      
      /**
        * In version 6.7.0: introduced
        */
      def nullValueOption: NullValueOption = js.native
      def nullValueOption_=(newValue: NullValueOption): Unit = js.native
      
      def parameterName: String = js.native
      def parameterName_=(newValue: String): Unit = js.native
      
      /**
        * In version 6.1.0: deleted
        */
      def parameterTypeName: String = js.native
      def parameterTypeName_=(newValue: String): Unit = js.native
    }
    object ExportMapping {
      
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportMapping")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ExportMapping unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportMapping.createIn")
      @js.native
      def createIn(container: IFolderBase): ExportMapping = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportMapping.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportMapping.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportObjectMappingElement")
    @js.native
    class ExportObjectMappingElement protected () extends ObjectMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object ExportObjectMappingElement {
      
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportObjectMappingElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportObjectMappingElement.create")
      @js.native
      def create(model: IModel): ExportObjectMappingElement = js.native
      
      /**
        * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
        * The new ExportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
        * of the parent mappings.MappingDocument element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportObjectMappingElement.createInMappingDocumentUnderRootMappingElements")
      @js.native
      def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): ExportObjectMappingElement = js.native
      
      /**
        * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
        * The new ExportObjectMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportObjectMappingElement.createInObjectMappingElementUnderChildren")
      @js.native
      def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): ExportObjectMappingElement = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportObjectMappingElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportObjectMappingElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportValueMappingElement")
    @js.native
    class ExportValueMappingElement protected () extends ValueMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object ExportValueMappingElement {
      
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportValueMappingElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportValueMappingElement.create")
      @js.native
      def create(model: IModel): ExportValueMappingElement = js.native
      
      /**
        * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
        * The new ExportValueMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportValueMappingElement.createIn")
      @js.native
      def createIn(container: ObjectMappingElement): ExportValueMappingElement = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportValueMappingElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings.ExportValueMappingElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ExportMappings`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
      */
    @js.native
    trait IExportMapping extends IMappingDocument
  }
}
