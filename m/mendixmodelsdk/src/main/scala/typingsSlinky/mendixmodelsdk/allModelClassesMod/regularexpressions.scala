package typingsSlinky.mendixmodelsdk.allModelClassesMod

import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "regularexpressions")
@js.native
object regularexpressions extends js.Object {
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/regular-expressions relevant section in reference guide}
    */
  @js.native
  class RegularExpression protected ()
    extends typingsSlinky.mendixmodelsdk.regularexpressionsMod.regularexpressions.RegularExpression {
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
  object RegularExpression extends js.Object {
    
    /**
      * Creates a new RegularExpression unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.regularexpressionsMod.regularexpressions.RegularExpression = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.regularexpressionsMod.StructureVersionInfo = js.native
  }
}
