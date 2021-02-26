package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.MappingDocument
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportmappings {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "exportmappings.ExportMapping")
  @js.native
  class ExportMapping protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.exportmappings.ExportMapping {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ExportMapping {
    
    @JSImport("mendixmodelsdk", "exportmappings.ExportMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ExportMapping unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportMapping.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.exportmappingsMod.exportmappings.ExportMapping = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportMapping.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.exportmappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.exportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement")
  @js.native
  class ExportObjectMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.exportmappings.ExportObjectMappingElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExportObjectMappingElement {
    
    @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.exportmappingsMod.exportmappings.ExportObjectMappingElement = js.native
    
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * The new ExportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
      * of the parent mappings.MappingDocument element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement.createInMappingDocumentUnderRootMappingElements")
    @js.native
    def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): typingsSlinky.mendixmodelsdk.exportmappingsMod.exportmappings.ExportObjectMappingElement = js.native
    
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * The new ExportObjectMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement.createInObjectMappingElementUnderChildren")
    @js.native
    def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): typingsSlinky.mendixmodelsdk.exportmappingsMod.exportmappings.ExportObjectMappingElement = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.exportmappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.exportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement")
  @js.native
  class ExportValueMappingElement protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.exportmappings.ExportValueMappingElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExportValueMappingElement {
    
    @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.exportmappingsMod.exportmappings.ExportValueMappingElement = js.native
    
    /**
      * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
      * The new ExportValueMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement.createIn")
    @js.native
    def createIn(container: ObjectMappingElement): typingsSlinky.mendixmodelsdk.exportmappingsMod.exportmappings.ExportValueMappingElement = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.exportmappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.exportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
