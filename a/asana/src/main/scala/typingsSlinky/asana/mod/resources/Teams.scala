package typingsSlinky.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.asana.mod.Dispatcher
import typingsSlinky.asana.mod.resources.Teams.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A _team_ is used to group related projects and people together within an
  * organization. Each project in an organization is associated with a team.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Teams
  extends typingsSlinky.asana.mod.resources.Resource {
  
  /**
    * * The user making this call must be a member of the team in order to add others.
    * * The user to add must exist in the same organization as the team in order to be added.
    * * The user to add can be referenced by their globally unique user ID or their email address.
    * * Returns the full user record for the added user.
    *   * @param {String|Number} team Globally unique identifier for the team.
    *   * @param {Object} data Data for the request
    *   * @param {Number|String} data.user An identifier for the user. Can be one of an email address,
    *   * the globally unique identifier for the user, or the keyword `me`
    *   * to indicate the current user making the request.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param team
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addUser(team: String, data: UserParams): typingsSlinky.bluebird.mod.^[_] = js.native
  def addUser(team: String, data: UserParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def addUser(team: Double, data: UserParams): typingsSlinky.bluebird.mod.^[_] = js.native
  def addUser(team: Double, data: UserParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  
  /**
    * * Returns the full record for a single team.
    *   * @param {String|Number} team Globally unique identifier for the team.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param team
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(team: String): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(team: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(team: String, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(team: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(team: Double): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(team: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(team: Double, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(team: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  
  /**
    * * Returns the compact records for all teams in the organization visible to
    * * the authorized user.
    *   * @param {String|Number} organization Globally unique identifier for the workspace or organization.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param organization
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByOrganization(organization: String): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def findByOrganization(organization: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def findByOrganization(organization: String, params: Params): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def findByOrganization(organization: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def findByOrganization(organization: Double): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def findByOrganization(organization: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def findByOrganization(organization: Double, params: Params): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def findByOrganization(organization: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  
  /**
    * * The user to remove can be referenced by their globally unique user ID or their email address.
    * * Removes the user from the specified team. Returns an empty data record.
    *   * @param {String|Number} team Globally unique identifier for the team.
    *   * @param {Object} data Data for the request
    *   * @param {Number|String} data.user An identifier for the user. Can be one of an email address,
    *   * the globally unique identifier for the user, or the keyword `me`
    *   * to indicate the current user making the request.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param team
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def removeUser(team: String, data: UserParams): typingsSlinky.bluebird.mod.^[_] = js.native
  def removeUser(team: String, data: UserParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def removeUser(team: Double, data: UserParams): typingsSlinky.bluebird.mod.^[_] = js.native
  def removeUser(team: Double, data: UserParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  
  /**
    * * Returns the compact records for all users that are members of the team.
    *   * @param {String|Number} team Globally unique identifier for the team.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param team
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def users(team: String): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def users(team: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def users(team: String, params: Params): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def users(team: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def users(team: Double): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def users(team: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def users(team: Double, params: Params): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def users(team: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
}
object Teams extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Teams")
  @js.native
  class ^ protected () extends Teams {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Teams")
  @js.native
  val ^ : TeamsStatic = js.native
  
  @js.native
  trait Type
    extends typingsSlinky.asana.mod.resources.Resource {
    
    var organization: typingsSlinky.asana.mod.resources.Resource = js.native
  }
  
  type _To = TeamsStatic
  
  /* This means you don't have to write `^`, but can instead just say `Teams.foo` */
  override def _to: TeamsStatic = ^
}
