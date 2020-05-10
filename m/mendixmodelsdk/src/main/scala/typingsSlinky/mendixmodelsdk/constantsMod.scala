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
import scala.scalajs.js.annotation._

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
      @JSName("model")
      var model_FConstant: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MConstant: FolderBase = js.native
      /**
        * The value of this property is conceptually of type dataTypes.LegacyDataType.
        *
        * In version 7.9.0: deleted
        */
      def dataType: String = js.native
      def dataType(newValue: String): js.Any = js.native
      def defaultValue: String = js.native
      def defaultValue(newValue: String): js.Any = js.native
      /**
        * In version 8.2.0: introduced
        */
      def exposedToClient: Boolean = js.native
      def exposedToClient(newValue: Boolean): js.Any = js.native
      /**
        * In version 7.9.0: introduced
        */
      def `type`: DataType = js.native
      def `type`(newValue: DataType): js.Any = js.native
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Constants`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide7/constants relevant section in reference guide}
      */
    @js.native
    trait IConstant extends IDocument
    
    /* static members */
    @js.native
    object Constant extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new Constant unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): Constant = js.native
    }
    
  }
  
}

