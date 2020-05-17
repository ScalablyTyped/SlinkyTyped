package typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
  *
  * In version 7.6.0: introduced
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
- typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinitionCollection because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined messageDefinitions */ @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection")
@js.native
class MessageDefinitionCollection protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("messageDefinitions")
  val messageDefinitions_FMessageDefinitionCollection: IList[IMessageDefinition] = js.native
  @JSName("model")
  var model_FMessageDefinitionCollection: IModel = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MMessageDefinitionCollection: FolderBase = js.native
  def messageDefinitions: IList[MessageDefinition] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection")
@js.native
object MessageDefinitionCollection extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): MessageDefinitionCollection = js.native
}

