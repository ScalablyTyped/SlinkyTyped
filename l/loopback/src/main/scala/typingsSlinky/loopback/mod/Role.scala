package typingsSlinky.loopback.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Role model
  * @class Role
  * @inherits {PersistedModel}
  * @header Role objec
  */
@JSImport("loopback", "Role")
@js.native
class Role protected () extends PersistedModel {
  def this(data: js.Any) = this()
}
object Role {
  
  /**
    * List roles for a given principal.
    * @param {any} context The security context.
    * @callback {() => void} callback Callback function.
    * @param {Error} err Error object.
    * @param {string[]} roles An Array of role IDs
    */
  /* static member */
  @JSImport("loopback", "Role.getRoles")
  @js.native
  def getRoles(context: js.Any, callback: js.Function2[/* err */ js.Error, /* roles */ js.Array[String], Unit]): Unit = js.native
  
  /**
    * Check if the user ID is authenticated
    * @param {any} context The security context.@callback {() => void} callback Callback function.
    * @param {Error} err Error object.
    * @param {boolean} isAuthenticated True if the user is authenticated.
    */
  /* static member */
  @JSImport("loopback", "Role.isAuthenticated")
  @js.native
  def isAuthenticated(context: js.Any, callback: js.Function2[/* err */ js.Error, /* isAuthenticated */ Boolean, Unit]): Unit = js.native
  
  /**
    * Check if a given principal is in the specified role.
    * @param {string} role The role name.
    * @param {any} context The context object.
    * @callback {() => void} callback Callback function.
    * @param {Error} err Error object.
    * @param {boolean} isInRole True if the principal is in the specified role.
    */
  /* static member */
  @JSImport("loopback", "Role.isInRole")
  @js.native
  def isInRole(
    role: String,
    context: js.Any,
    callback: js.Function2[/* err */ js.Error, /* isInRole */ Boolean, Unit]
  ): Unit = js.native
  
  /**
    * Check if a given user ID is the owner the model instance.
    * @param {() => void} modelClass The model class
    * @param {*} modelId The model ID
    * @param {*} userId The user ID
    * @param {() => void} callback Callback function
    */
  /* static member */
  @JSImport("loopback", "Role.isOwner")
  @js.native
  def isOwner(modelClass: js.Function0[Unit], modelId: js.Any, userId: js.Any, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Add custom handler for roles.
    * @param {string} role Name of role.
    * @param {() => void} resolver () => void that determines
    * if a principal is in the specified role.
    * Should provide a callback or return a promise.
    */
  /* static member */
  @JSImport("loopback", "Role.registerResolver")
  @js.native
  def registerResolver(
    role: String,
    resolver: js.Function3[
      /* role */ String, 
      /* ctx */ Context, 
      /* callback */ js.UndefOr[js.Function2[/* err */ js.Error, /* resolved */ Boolean, Unit]], 
      js.Promise[Boolean] | Unit
    ]
  ): Unit = js.native
}
