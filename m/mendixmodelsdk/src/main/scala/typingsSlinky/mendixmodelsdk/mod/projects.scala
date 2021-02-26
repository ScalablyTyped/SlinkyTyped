package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IModule
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProject
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projects {
  
  @JSImport("mendixmodelsdk", "projects.Document")
  @js.native
  abstract class Document protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.projects.Document {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Document {
    
    @JSImport("mendixmodelsdk", "projects.Document")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.Document.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.Document.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/resources relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "projects.Folder")
  @js.native
  class Folder protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.projects.Folder {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Folder {
    
    @JSImport("mendixmodelsdk", "projects.Folder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Folder unit in the SDK and on the server.
      * Expects one argument, the IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "projects.Folder.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.projectsMod.projects.Folder = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.Folder.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.Folder.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "projects.FolderBase")
  @js.native
  abstract class FolderBase protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.projects.FolderBase {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object FolderBase {
    
    @JSImport("mendixmodelsdk", "projects.FolderBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.FolderBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.FolderBase.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/modules relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "projects.Module")
  @js.native
  class Module protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.projects.Module {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object Module {
    
    @JSImport("mendixmodelsdk", "projects.Module")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Module unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "projects.Module.createIn")
    @js.native
    def createIn(container: IProject): typingsSlinky.mendixmodelsdk.projectsMod.projects.Module = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.Module.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.Module.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "projects.ModuleDocument")
  @js.native
  abstract class ModuleDocument protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.projects.ModuleDocument {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
  }
  object ModuleDocument {
    
    @JSImport("mendixmodelsdk", "projects.ModuleDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.ModuleDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.ModuleDocument.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "projects.OneTimeConversionMarker")
  @js.native
  class OneTimeConversionMarker protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.projects.OneTimeConversionMarker {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object OneTimeConversionMarker {
    
    @JSImport("mendixmodelsdk", "projects.OneTimeConversionMarker")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "projects.OneTimeConversionMarker.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.projectsMod.projects.OneTimeConversionMarker = js.native
    
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * The new OneTimeConversionMarker will be automatically stored in the 'markers' property
      * of the parent ProjectConversion element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "projects.OneTimeConversionMarker.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.projectsMod.projects.ProjectConversion): typingsSlinky.mendixmodelsdk.projectsMod.projects.OneTimeConversionMarker = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.OneTimeConversionMarker.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.OneTimeConversionMarker.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "projects.Project")
  @js.native
  class Project protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.projects.Project {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  object Project {
    
    @JSImport("mendixmodelsdk", "projects.Project")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.Project.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.Project.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "projects.ProjectConversion")
  @js.native
  class ProjectConversion protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.projects.ProjectConversion {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object ProjectConversion {
    
    @JSImport("mendixmodelsdk", "projects.ProjectConversion")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ProjectConversion unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "projects.ProjectConversion.createIn")
    @js.native
    def createIn(container: IProject): typingsSlinky.mendixmodelsdk.projectsMod.projects.ProjectConversion = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.ProjectConversion.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.ProjectConversion.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "projects.ProjectDocument")
  @js.native
  abstract class ProjectDocument protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.projects.ProjectDocument {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object ProjectDocument {
    
    @JSImport("mendixmodelsdk", "projects.ProjectDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.ProjectDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "projects.ProjectDocument.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
