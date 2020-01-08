package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.ConfirmationInfo")
@js.native
class ConfirmationInfo protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.ConfirmationInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "pages.ConfirmationInfo")
@js.native
object ConfirmationInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ConfirmationInfo = js.native
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.7.0
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ConfirmationInfo = js.native
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent CallNanoflowClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  def createInCallNanoflowClientActionUnderConfirmationInfo(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CallNanoflowClientAction): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ConfirmationInfo = js.native
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    */
  def createInMicroflowSettingsUnderConfirmationInfo(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ConfirmationInfo = js.native
}

