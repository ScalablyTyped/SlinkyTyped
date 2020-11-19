package typingsSlinky.realm.Realm.Sync

import typingsSlinky.realm.Realm.Configuration
import typingsSlinky.realm.Realm.PartialConfiguration
import typingsSlinky.realm.realmStrings.any
import typingsSlinky.realm.realmStrings.currentUser
import typingsSlinky.realm.realmStrings.otherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.User.html }
  */
@js.native
trait User extends js.Object {
  
  def acceptPermissionOffer(token: String): js.Promise[String] = js.native
  
  def applyPermissions(condition: PermissionCondition, realmUrl: String, accessLevel: AccessLevel): js.Promise[Unit] = js.native
  
  def createConfiguration(): Configuration = js.native
  def createConfiguration(config: PartialConfiguration): Configuration = js.native
  
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_any(recipient: any): js.Promise[js.Array[Permission]] = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_currentUser(recipient: currentUser): js.Promise[js.Array[Permission]] = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_otherUser(recipient: otherUser): js.Promise[js.Array[Permission]] = js.native
  
  def getPermissionOffers(): js.Promise[js.Array[PermissionOffer]] = js.native
  
  val identity: String = js.native
  
  def invalidatePermissionOffer(permissionOfferOrToken: String): js.Promise[Unit] = js.native
  def invalidatePermissionOffer(permissionOfferOrToken: PermissionOffer): js.Promise[Unit] = js.native
  
  val isAdmin: Boolean = js.native
  
  val isAdminToken: Boolean = js.native
  
  def logout(): js.Promise[Unit] = js.native
  
  def offerPermissions(realmUrl: String, accessLevel: AccessLevel): js.Promise[String] = js.native
  def offerPermissions(realmUrl: String, accessLevel: AccessLevel, expiresAt: js.Date): js.Promise[String] = js.native
  
  def retrieveAccount(provider: String, username: String): js.Promise[Account] = js.native
  
  def serialize(): SerializedUser | SerializedTokenUser = js.native
  
  val server: String = js.native
  
  val token: String = js.native
}
