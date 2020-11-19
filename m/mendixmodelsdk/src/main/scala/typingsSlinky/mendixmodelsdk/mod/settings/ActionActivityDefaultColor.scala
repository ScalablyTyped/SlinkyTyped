package typingsSlinky.mendixmodelsdk.mod.settings

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Settings`.
  */
/**
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk", "settings.ActionActivityDefaultColor")
@js.native
class ActionActivityDefaultColor protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.settings.ActionActivityDefaultColor {
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
@JSImport("mendixmodelsdk", "settings.ActionActivityDefaultColor")
@js.native
object ActionActivityDefaultColor extends js.Object {
  
  /**
    * Creates and returns a new ActionActivityDefaultColor instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.settingsMod.settings.ActionActivityDefaultColor = js.native
  
  /**
    * Creates and returns a new ActionActivityDefaultColor instance in the SDK and on the server.
    * The new ActionActivityDefaultColor will be automatically stored in the 'actionActivityDefaultColors' property
    * of the parent ModelerSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.settingsMod.settings.ModelerSettings): typingsSlinky.mendixmodelsdk.settingsMod.settings.ActionActivityDefaultColor = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
