package typingsSlinky.mendixmodelsdk.allModelClassesMod

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IModule
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProject
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "projects")
@js.native
object projects extends js.Object {
  
  @js.native
  abstract class Document protected ()
    extends typingsSlinky.mendixmodelsdk.projectsMod.projects.Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  /* static members */
  @js.native
  object Document extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/resources relevant section in reference guide}
    */
  @js.native
  class Folder protected ()
    extends typingsSlinky.mendixmodelsdk.projectsMod.projects.Folder {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  /* static members */
  @js.native
  object Folder extends js.Object {
    
    /**
      * Creates a new Folder unit in the SDK and on the server.
      * Expects one argument, the IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.projectsMod.projects.Folder = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  abstract class FolderBase protected ()
    extends typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  /* static members */
  @js.native
  object FolderBase extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
    */
  @js.native
  class Module protected ()
    extends typingsSlinky.mendixmodelsdk.projectsMod.projects.Module {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  /* static members */
  @js.native
  object Module extends js.Object {
    
    /**
      * Creates a new Module unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    def createIn(container: IProject): typingsSlinky.mendixmodelsdk.projectsMod.projects.Module = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  abstract class ModuleDocument protected ()
    extends typingsSlinky.mendixmodelsdk.projectsMod.projects.ModuleDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
  }
  /* static members */
  @js.native
  object ModuleDocument extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class OneTimeConversionMarker protected ()
    extends typingsSlinky.mendixmodelsdk.projectsMod.projects.OneTimeConversionMarker {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object OneTimeConversionMarker extends js.Object {
    
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.projectsMod.projects.OneTimeConversionMarker = js.native
    
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * The new OneTimeConversionMarker will be automatically stored in the 'markers' property
      * of the parent ProjectConversion element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.projectsMod.projects.ProjectConversion): typingsSlinky.mendixmodelsdk.projectsMod.projects.OneTimeConversionMarker = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  @js.native
  class Project protected ()
    extends typingsSlinky.mendixmodelsdk.projectsMod.projects.Project {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  /* static members */
  @js.native
  object Project extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class ProjectConversion protected ()
    extends typingsSlinky.mendixmodelsdk.projectsMod.projects.ProjectConversion {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  /* static members */
  @js.native
  object ProjectConversion extends js.Object {
    
    /**
      * Creates a new ProjectConversion unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    def createIn(container: IProject): typingsSlinky.mendixmodelsdk.projectsMod.projects.ProjectConversion = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  @js.native
  abstract class ProjectDocument protected ()
    extends typingsSlinky.mendixmodelsdk.projectsMod.projects.ProjectDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  /* static members */
  @js.native
  object ProjectDocument extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
}
