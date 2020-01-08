package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.messagedefinitions

import typingsSlinky.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
  *
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection")
@js.native
class MessageDefinitionCollection protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.messagedefinitions.MessageDefinitionCollection {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection")
@js.native
object MessageDefinitionCollection extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.MessageDefinitionCollection = js.native
}

