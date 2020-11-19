package typingsSlinky.mendixmodelsdk.mod.navigation

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.22.0: introduced
  */
@JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig")
@js.native
class OfflineEntityConfig protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.OfflineEntityConfig {
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
@JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig")
@js.native
object OfflineEntityConfig extends js.Object {
  
  /**
    * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.navigationMod.navigation.OfflineEntityConfig = js.native
  
  /**
    * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
    * The new OfflineEntityConfig will be automatically stored in the 'offlineEntityConfigs' property
    * of the parent NavigationProfileBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfileBase): typingsSlinky.mendixmodelsdk.navigationMod.navigation.OfflineEntityConfig = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
