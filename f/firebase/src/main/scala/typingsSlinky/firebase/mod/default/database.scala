package typingsSlinky.firebase.mod.default

import typingsSlinky.firebase.mod.firebase.app.App
import typingsSlinky.firebase.mod.firebase.database.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object database {
  
  /**
    * Gets the {@link firebase.database.Database `Database`} service for the
    * default app or a given app.
    *
    * `firebase.database()` can be called with no arguments to access the default
    * app's {@link firebase.database.Database `Database`} service or as
    * `firebase.database(app)` to access the
    * {@link firebase.database.Database `Database`} service associated with a
    * specific app.
    *
    * `firebase.database` is also a namespace that can be used to access global
    * constants and methods associated with the `Database` service.
    *
    * @example
    * ```javascript
    * // Get the Database service for the default app
    * var defaultDatabase = firebase.database();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Database service for a specific app
    * var otherDatabase = firebase.database(app);
    * ```
    *
    * @namespace
    * @param app Optional app whose Database service to
    *   return. If not provided, the default Database service will be returned.
    * @return The default Database service if no app
    *   is provided or the Database service associated with the provided app.
    */
  @JSImport("firebase", "default.database")
  @js.native
  def apply(): Database = js.native
  @JSImport("firebase", "default.database")
  @js.native
  def apply(app: App): Database = js.native
  
  object ServerValue {
    
    @JSImport("firebase", "default.database.ServerValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A placeholder value for auto-populating the current timestamp (time
      * since the Unix epoch, in milliseconds) as determined by the Firebase
      * servers.
      *
      * @example
      * ```javascript
      * var sessionsRef = firebase.database().ref("sessions");
      * sessionsRef.push({
      *   startedAt: firebase.database.ServerValue.TIMESTAMP
      * });
      * ```
      */
    @JSImport("firebase", "default.database.ServerValue.TIMESTAMP")
    @js.native
    def TIMESTAMP: js.Object = js.native
    @scala.inline
    def TIMESTAMP_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMESTAMP")(x.asInstanceOf[js.Any])
    
    /**
      * Returns a placeholder value that can be used to atomically increment the
      * current database value by the provided delta.
      *
      * @param delta the amount to modify the current value atomically.
      * @return a placeholder value for modifying data atomically server-side.
      */
    @JSImport("firebase", "default.database.ServerValue.increment")
    @js.native
    def increment(delta: Double): js.Object = js.native
  }
  
  /**
    * Logs debugging information to the console.
    *
    * @example
    * ```javascript
    * // Enable logging
    * firebase.database.enableLogging(true);
    * ```
    *
    * @example
    * ```javascript
    * // Disable logging
    * firebase.database.enableLogging(false);
    * ```
    *
    * @example
    * ```javascript
    * // Enable logging across page refreshes
    * firebase.database.enableLogging(true, true);
    * ```
    *
    * @example
    * ```javascript
    * // Provide custom logger which prefixes log statements with "[FIREBASE]"
    * firebase.database.enableLogging(function(message) {
    *   console.log("[FIREBASE]", message);
    * });
    * ```
    *
    * @param logger Enables logging if `true`;
    *   disables logging if `false`. You can also provide a custom logger function
    *   to control how things get logged.
    * @param persistent Remembers the logging state between page
    *   refreshes if `true`.
    */
  @JSImport("firebase", "default.database.enableLogging")
  @js.native
  def enableLogging(): js.Any = js.native
  @JSImport("firebase", "default.database.enableLogging")
  @js.native
  def enableLogging(logger: js.UndefOr[scala.Nothing], persistent: Boolean): js.Any = js.native
  @JSImport("firebase", "default.database.enableLogging")
  @js.native
  def enableLogging(logger: js.Function1[/* a */ String, _]): js.Any = js.native
  @JSImport("firebase", "default.database.enableLogging")
  @js.native
  def enableLogging(logger: js.Function1[/* a */ String, _], persistent: Boolean): js.Any = js.native
  @JSImport("firebase", "default.database.enableLogging")
  @js.native
  def enableLogging(logger: Boolean): js.Any = js.native
  @JSImport("firebase", "default.database.enableLogging")
  @js.native
  def enableLogging(logger: Boolean, persistent: Boolean): js.Any = js.native
}
