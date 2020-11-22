package typingsSlinky.mendixmodelsdk.allModelClassesMod.settings

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

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.CustomSetting")
@js.native
class CustomSetting protected ()
  extends typingsSlinky.mendixmodelsdk.settingsMod.settings.CustomSetting {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.CustomSetting")
@js.native
object CustomSetting extends js.Object {
  
  /**
    * Creates and returns a new CustomSetting instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.settingsMod.settings.CustomSetting = js.native
  
  /**
    * Creates and returns a new CustomSetting instance in the SDK and on the server.
    * The new CustomSetting will be automatically stored in the 'customSettings' property
    * of the parent Configuration element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.settingsMod.settings.Configuration): typingsSlinky.mendixmodelsdk.settingsMod.settings.CustomSetting = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
