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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/exportmappings", JSImport.Namespace)
@js.native
object exportmappingsMod extends js.Object {
  
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object exportmappings extends js.Object {
    
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
    - typingsSlinky.mendixmodelsdk.exportmappingsMod.exportmappings.IExportMapping because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
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
    /* static members */
    @js.native
    object ExportMapping extends js.Object {
      
      /**
        * Creates a new ExportMapping unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): ExportMapping = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
      */
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
    /* static members */
    @js.native
    object ExportObjectMappingElement extends js.Object {
      
      /**
        * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): ExportObjectMappingElement = js.native
      
      /**
        * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
        * The new ExportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
        * of the parent mappings.MappingDocument element passed as argument.
        */
      def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): ExportObjectMappingElement = js.native
      
      /**
        * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
        * The new ExportObjectMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): ExportObjectMappingElement = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
      */
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
    /* static members */
    @js.native
    object ExportValueMappingElement extends js.Object {
      
      /**
        * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): ExportValueMappingElement = js.native
      
      /**
        * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
        * The new ExportValueMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      def createIn(container: ObjectMappingElement): ExportValueMappingElement = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
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
