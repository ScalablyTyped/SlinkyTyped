package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.DataType
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object constants extends js.Object {
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/constants relevant section in reference guide}
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
    - typingsSlinky.mendixmodelsdk.constantsMod.constants.IConstant because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    class Constant protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MConstant: FolderBase = js.native
      
      /**
        * The value of this property is conceptually of type dataTypes.LegacyDataType.
        *
        * In version 7.9.0: deleted
        */
      def dataType: String = js.native
      def dataType_=(newValue: String): Unit = js.native
      
      def defaultValue: String = js.native
      def defaultValue_=(newValue: String): Unit = js.native
      
      /**
        * In version 8.2.0: introduced
        */
      def exposedToClient: Boolean = js.native
      def exposedToClient_=(newValue: Boolean): Unit = js.native
      
      @JSName("model")
      var model_FConstant: IModel = js.native
      
      /**
        * In version 7.9.0: introduced
        */
      def `type`: DataType = js.native
      def type_=(newValue: DataType): Unit = js.native
    }
    /* static members */
    @js.native
    object Constant extends js.Object {
      
      /**
        * Creates a new Constant unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): Constant = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Constants`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide7/constants relevant section in reference guide}
      */
    @js.native
    trait IConstant extends IDocument
  }
}
