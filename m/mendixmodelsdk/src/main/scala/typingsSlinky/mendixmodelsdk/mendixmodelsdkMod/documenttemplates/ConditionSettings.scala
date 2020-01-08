package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.documenttemplates

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "documenttemplates.ConditionSettings")
@js.native
class ConditionSettings protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates.ConditionSettings {
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
@JSImport("mendixmodelsdk", "documenttemplates.ConditionSettings")
@js.native
object ConditionSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConditionSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.ConditionSettings = js.native
  /**
    * Creates and returns a new ConditionSettings instance in the SDK and on the server.
    * The new ConditionSettings will be automatically stored in the 'conditionSettings' property
    * of the parent TableRow element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TableRow): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.ConditionSettings = js.native
}

