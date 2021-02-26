package typingsSlinky.mendixmodelsdk.mod.settings

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

@JSImport("mendixmodelsdk", "settings.WebUIProjectSettingsPart")
@js.native
class WebUIProjectSettingsPart protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.settings.WebUIProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object WebUIProjectSettingsPart {
  
  @JSImport("mendixmodelsdk", "settings.WebUIProjectSettingsPart")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WebUIProjectSettingsPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "settings.WebUIProjectSettingsPart.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.settingsMod.settings.WebUIProjectSettingsPart = js.native
  
  /**
    * Creates and returns a new WebUIProjectSettingsPart instance in the SDK and on the server.
    * The new WebUIProjectSettingsPart will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "settings.WebUIProjectSettingsPart.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.settingsMod.settings.ProjectSettings): typingsSlinky.mendixmodelsdk.settingsMod.settings.WebUIProjectSettingsPart = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.WebUIProjectSettingsPart.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.WebUIProjectSettingsPart.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
