package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.navigation

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation.HomePage")
@js.native
class HomePage protected ()
  extends typingsSlinky.mendixmodelsdk.distGenNavigationMod.navigation.HomePage {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation.HomePage")
@js.native
object HomePage extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
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

