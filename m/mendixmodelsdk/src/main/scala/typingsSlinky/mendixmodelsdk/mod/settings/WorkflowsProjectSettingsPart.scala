package typingsSlinky.mendixmodelsdk.mod.settings

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.settingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.8.0: introduced
  */
@JSImport("mendixmodelsdk", "settings.WorkflowsProjectSettingsPart")
@js.native
class WorkflowsProjectSettingsPart protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.settings.WorkflowsProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "settings.WorkflowsProjectSettingsPart")
@js.native
object WorkflowsProjectSettingsPart extends js.Object {
  
  /**
    * Creates and returns a new WorkflowsProjectSettingsPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.settingsMod.settings.WorkflowsProjectSettingsPart = js.native
  
  /**
    * Creates and returns a new WorkflowsProjectSettingsPart instance in the SDK and on the server.
    * The new WorkflowsProjectSettingsPart will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.settingsMod.settings.ProjectSettings): typingsSlinky.mendixmodelsdk.settingsMod.settings.WorkflowsProjectSettingsPart = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
