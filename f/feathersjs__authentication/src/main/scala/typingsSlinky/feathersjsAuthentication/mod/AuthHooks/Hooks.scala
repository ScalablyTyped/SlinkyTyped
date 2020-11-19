package typingsSlinky.feathersjsAuthentication.mod.AuthHooks

import typingsSlinky.feathersjsFeathers.mod.Hook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hooks extends js.Object {
  
  def authenticate(strategies: String): Hook = js.native
  def authenticate(strategies: js.Array[String]): Hook = js.native
  
  /**
    * The `hashPassword` hook will automatically hash the data coming in on the provided passwordField.
    * It is intended to be used as a before hook on the user service for the create, update, or patch methods.
    *
    */
  def hashPassword(): Hook = js.native
  def hashPassword(options: HashPassOptions): Hook = js.native
  
  /**
    * The populateUser hook is for populating a user based on an id.
    * It can be used on any service method as either a before or after hook.
    * It is called internally after a token is created.
    *
    */
  def populateUser(): Hook = js.native
  def populateUser(options: js.Any): Hook = js.native
  
  /**
    * The `restrictToAuthenticated` hook throws an error if there isn't a logged-in user by checking for the `hook.params.user` object.
    * It can be used on any service method and is intended to be used as a before hook.
    * It doesn't take any arguments.
    *
    */
  def restrictToAuthenticated(): Hook = js.native
  
  /**
    * `restrictToOwner` is meant to be used as a before hook.
    * It only allows the user to retrieve resources that are owned by them.
    * It will return a *Forbidden* error without the proper permissions.
    * It can be used on `get`, `create`, `update`, `patch` or `remove` methods.
    *
    */
  def restrictToOwner(): Hook = js.native
  def restrictToOwner(options: RestrictOptions): Hook = js.native
  
  /**
    * The `verifyToken` hook will attempt to verify a token.
    * If the token is missing or is invalid it returns an error.
    * If the token is valid it adds the decrypted payload to hook.params.payload which contains the user id.
    * It is intended to be used as a before hook on any of the service methods.
    *
    */
  def verifyToken(): Hook = js.native
  def verifyToken(options: js.Any): Hook = js.native
}
