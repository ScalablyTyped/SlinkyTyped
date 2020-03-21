package typingsSlinky.mendixmodelsdk.navigationMod.navigation

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.securityMod.security.IUserRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedHomePage")
@js.native
class RoleBasedHomePage protected () extends HomePageBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRoleBasedHomePage: IModel = js.native
  def userRole(): js.Any = js.native
  def userRole(newValue: IUserRole): js.Any = js.native
  def userRoleQualifiedName(): String | Null = js.native
  @JSName("userRole")
  def userRole_Union(): IUserRole | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedHomePage")
@js.native
object RoleBasedHomePage extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RoleBasedHomePage = js.native
  /**
    * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
    * The new RoleBasedHomePage will be automatically stored in the 'roleBasedHomePages' property
    * of the parent NavigationProfile element passed as argument.
    */
  def createIn(container: NavigationProfile): RoleBasedHomePage = js.native
}

