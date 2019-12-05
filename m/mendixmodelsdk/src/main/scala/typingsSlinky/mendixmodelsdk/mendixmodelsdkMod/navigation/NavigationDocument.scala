package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.navigation

import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/navigation relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "navigation.NavigationDocument")
@js.native
class NavigationDocument protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.navigation.NavigationDocument {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "navigation.NavigationDocument")
@js.native
object NavigationDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo = js.native
  /**
    * Creates a new NavigationDocument unit in the SDK and on the server.
    * Expects one argument, the projects.IProject in which this unit is contained.
    */
  def createIn(container: IProject): typingsSlinky.mendixmodelsdk.distGenNavigationMod.navigation.NavigationDocument = js.native
}

