package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.ClientTemplateParameter")
@js.native
class ClientTemplateParameter protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.ClientTemplateParameter {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "pages.ClientTemplateParameter")
@js.native
object ClientTemplateParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ClientTemplateParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplateParameter = js.native
  /**
    * Creates and returns a new ClientTemplateParameter instance in the SDK and on the server.
    * The new ClientTemplateParameter will be automatically stored in the 'parameters' property
    * of the parent ClientTemplate element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplateParameter = js.native
}

