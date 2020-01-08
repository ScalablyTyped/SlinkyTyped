package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.navigation

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage")
@js.native
class RoleBasedHomePage protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.navigation.RoleBasedHomePage {
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
@JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage")
@js.native
object RoleBasedHomePage extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenNavigationMod.navigation.RoleBasedHomePage = js.native
  /**
    * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
    * The new RoleBasedHomePage will be automatically stored in the 'roleBasedHomePages' property
    * of the parent NavigationProfile element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenNavigationMod.navigation.NavigationProfile): typingsSlinky.mendixmodelsdk.distGenNavigationMod.navigation.RoleBasedHomePage = js.native
}

