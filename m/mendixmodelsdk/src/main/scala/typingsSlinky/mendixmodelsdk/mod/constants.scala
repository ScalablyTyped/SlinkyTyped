package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "constants")
@js.native
object constants extends js.Object {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/constants relevant section in reference guide}
    */
  @js.native
  class Constant protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.constants.Constant {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  /* static members */
  @js.native
  object Constant extends js.Object {
    
    /**
      * Creates a new Constant unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.constantsMod.constants.Constant = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.constantsMod.StructureVersionInfo = js.native
  }
}
