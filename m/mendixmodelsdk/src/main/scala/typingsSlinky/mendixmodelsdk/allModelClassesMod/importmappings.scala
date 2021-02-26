package typingsSlinky.mendixmodelsdk.allModelClassesMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingDocument
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importmappings {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportMapping")
  @js.native
  class ImportMapping protected ()
    extends typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.ImportMapping {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ImportMapping {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ImportMapping unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportMapping.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.ImportMapping = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportMapping.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.importmappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.importmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportObjectMappingElement")
  @js.native
  class ImportObjectMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.ImportObjectMappingElement {
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
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportObjectMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportObjectMappingElement.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.ImportObjectMappingElement = js.native
    
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * The new ImportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
      * of the parent mappings.MappingDocument element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportObjectMappingElement.createInMappingDocumentUnderRootMappingElements")
    @js.native
    def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.ImportObjectMappingElement = js.native
    
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * The new ImportObjectMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportObjectMappingElement.createInObjectMappingElementUnderChildren")
    @js.native
    def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.ImportObjectMappingElement = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportObjectMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportObjectMappingElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.importmappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.importmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportValueMappingElement")
  @js.native
  class ImportValueMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.ImportValueMappingElement {
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
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportValueMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportValueMappingElement.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.ImportValueMappingElement = js.native
    
    /**
      * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
      * The new ImportValueMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportValueMappingElement.createIn")
    @js.native
    def createIn(container: ObjectMappingElement): typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.ImportValueMappingElement = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportValueMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "importmappings.ImportValueMappingElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.importmappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.importmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
