package typingsSlinky.mendixmodelsdk.allModelClassesMod.settings

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.settingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.WorkflowsProjectSettingsPart")
@js.native
class WorkflowsProjectSettingsPart protected ()
  extends typingsSlinky.mendixmodelsdk.settingsMod.settings.WorkflowsProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object WorkflowsProjectSettingsPart {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.WorkflowsProjectSettingsPart")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WorkflowsProjectSettingsPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.WorkflowsProjectSettingsPart.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.settingsMod.settings.WorkflowsProjectSettingsPart = js.native
  
  /**
    * Creates and returns a new WorkflowsProjectSettingsPart instance in the SDK and on the server.
    * The new WorkflowsProjectSettingsPart will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.WorkflowsProjectSettingsPart.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.settingsMod.settings.ProjectSettings): typingsSlinky.mendixmodelsdk.settingsMod.settings.WorkflowsProjectSettingsPart = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.WorkflowsProjectSettingsPart.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.WorkflowsProjectSettingsPart.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
