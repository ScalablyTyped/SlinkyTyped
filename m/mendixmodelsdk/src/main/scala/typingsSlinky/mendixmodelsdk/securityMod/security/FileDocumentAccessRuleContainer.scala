package typingsSlinky.mendixmodelsdk.securityMod.security

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/security", "security.FileDocumentAccessRuleContainer")
@js.native
class FileDocumentAccessRuleContainer protected () extends AccessRuleContainerBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("model")
  var model_FFileDocumentAccessRuleContainer: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.FileDocumentAccessRuleContainer")
@js.native
object FileDocumentAccessRuleContainer extends js.Object {
  
  /**
    * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): FileDocumentAccessRuleContainer = js.native
  
  /**
    * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
    * The new FileDocumentAccessRuleContainer will be automatically stored in the 'fileDocumentAccess' property
    * of the parent ProjectSecurity element passed as argument.
    */
  def createIn(container: ProjectSecurity): FileDocumentAccessRuleContainer = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
