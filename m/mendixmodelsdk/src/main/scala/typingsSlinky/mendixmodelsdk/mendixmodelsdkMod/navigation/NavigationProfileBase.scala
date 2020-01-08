package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.navigation

import typingsSlinky.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "navigation.NavigationProfileBase")
@js.native
abstract class NavigationProfileBase protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.navigation.NavigationProfileBase {
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
@JSImport("mendixmodelsdk", "navigation.NavigationProfileBase")
@js.native
object NavigationProfileBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

