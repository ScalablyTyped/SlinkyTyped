package typingsSlinky.mendixmodelsdk.mod.documenttemplates

import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/document-templates relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.DocumentTemplate")
@js.native
class DocumentTemplate protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.documenttemplates.DocumentTemplate {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "documenttemplates.DocumentTemplate")
@js.native
object DocumentTemplate extends js.Object {
  
  /**
    * Creates a new DocumentTemplate unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
