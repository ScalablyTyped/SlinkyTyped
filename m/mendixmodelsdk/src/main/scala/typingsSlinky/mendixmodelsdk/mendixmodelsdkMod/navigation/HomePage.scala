package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.navigation

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "navigation.HomePage")
@js.native
class HomePage protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.navigation.HomePage {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "navigation.HomePage")
@js.native
object HomePage extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new HomePage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenNavigationMod.navigation.HomePage = js.native
  /**
    * Creates and returns a new HomePage instance in the SDK and on the server.
    * The new HomePage will be automatically stored in the 'homePage' property
    * of the parent NavigationProfile element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenNavigationMod.navigation.NavigationProfile): typingsSlinky.mendixmodelsdk.distGenNavigationMod.navigation.HomePage = js.native
}

