package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
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

@JSImport("mendixmodelsdk/dist/gen/regularexpressions", JSImport.Namespace)
@js.native
object regularexpressionsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object regularexpressions extends js.Object {
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `RegularExpressions`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide7/regular-expressions relevant section in reference guide}
      */
    @js.native
    trait IRegularExpression extends IDocument
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/regular-expressions relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.regularexpressionsMod.regularexpressions.IRegularExpression because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    class RegularExpression protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FRegularExpression: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MRegularExpression: FolderBase = js.native
      def regEx: String = js.native
      def regEx(newValue: String): js.Any = js.native
    }
    
    /* static members */
    @js.native
    object RegularExpression extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new RegularExpression unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): RegularExpression = js.native
    }
    
  }
  
}

