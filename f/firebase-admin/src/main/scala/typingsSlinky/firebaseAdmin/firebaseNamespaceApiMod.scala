package typingsSlinky.firebaseAdmin

import typingsSlinky.firebaseAdmin.authMod.auth.Auth
import typingsSlinky.firebaseAdmin.credentialMod.credential.Credential
import typingsSlinky.firebaseAdmin.databaseMod.database.Database
import typingsSlinky.firebaseAdmin.firebaseNamespaceApiMod.app.App
import typingsSlinky.firebaseAdmin.firestoreMod.firestore.Firestore
import typingsSlinky.firebaseAdmin.instanceIdMod.instanceId.InstanceId
import typingsSlinky.firebaseAdmin.machineLearningMod.machineLearning.MachineLearning
import typingsSlinky.firebaseAdmin.messagingMod.messaging.Messaging
import typingsSlinky.firebaseAdmin.projectManagementMod.projectManagement.ProjectManagement
import typingsSlinky.firebaseAdmin.remoteConfigMod.remoteConfig.RemoteConfig
import typingsSlinky.firebaseAdmin.securityRulesMod.securityRules.SecurityRules
import typingsSlinky.firebaseAdmin.storageMod.storage.Storage
import typingsSlinky.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseNamespaceApiMod {
  
  @JSImport("firebase-admin/lib/firebase-namespace-api", "SDK_VERSION")
  @js.native
  val SDK_VERSION: String = js.native
  
  object app {
    
    @JSImport("firebase-admin/lib/firebase-namespace-api", "app")
    @js.native
    def apply(): App = js.native
    @JSImport("firebase-admin/lib/firebase-namespace-api", "app")
    @js.native
    def apply(name: String): App = js.native
    
    /**
      * A Firebase app holds the initialization information for a collection of
      * services.
      *
      * Do not call this constructor directly. Instead, use
      * {@link
      *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
      *   `admin.initializeApp()`}
      * to create an app.
      */
    @js.native
    trait App extends StObject {
      
      def auth(): Auth = js.native
      
      def database(): Database = js.native
      def database(url: String): Database = js.native
      
      /**
        * Renders this local `FirebaseApp` unusable and frees the resources of
        * all associated services (though it does *not* clean up any backend
        * resources). When running the SDK locally, this method
        * must be called to ensure graceful termination of the process.
        *
        * @example
        * ```javascript
        * app.delete()
        *   .then(function() {
        *     console.log("App deleted successfully");
        *   })
        *   .catch(function(error) {
        *     console.log("Error deleting app:", error);
        *   });
        * ```
        */
      def delete(): js.Promise[Unit] = js.native
      
      def firestore(): Firestore = js.native
      
      def instanceId(): InstanceId = js.native
      
      def machineLearning(): MachineLearning = js.native
      
      def messaging(): Messaging = js.native
      
      /**
        * The (read-only) name for this app.
        *
        * The default app's name is `"[DEFAULT]"`.
        *
        * @example
        * ```javascript
        * // The default app's name is "[DEFAULT]"
        * admin.initializeApp(defaultAppConfig);
        * console.log(admin.app().name);  // "[DEFAULT]"
        * ```
        *
        * @example
        * ```javascript
        * // A named app's name is what you provide to initializeApp()
        * var otherApp = admin.initializeApp(otherAppConfig, "other");
        * console.log(otherApp.name);  // "other"
        * ```
        */
      var name: String = js.native
      
      /**
        * The (read-only) configuration options for this app. These are the original
        * parameters given in
        * {@link
        *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
        *   `admin.initializeApp()`}.
        *
        * @example
        * ```javascript
        * var app = admin.initializeApp(config);
        * console.log(app.options.credential === config.credential);  // true
        * console.log(app.options.databaseURL === config.databaseURL);  // true
        * ```
        */
      var options: AppOptions = js.native
      
      def projectManagement(): ProjectManagement = js.native
      
      def remoteConfig(): RemoteConfig = js.native
      
      def securityRules(): SecurityRules = js.native
      
      def storage(): Storage = js.native
    }
  }
  
  @JSImport("firebase-admin/lib/firebase-namespace-api", "apps")
  @js.native
  val apps: js.Array[App | Null] = js.native
  
  @JSImport("firebase-admin/lib/firebase-namespace-api", "initializeApp")
  @js.native
  def initializeApp(): App = js.native
  @JSImport("firebase-admin/lib/firebase-namespace-api", "initializeApp")
  @js.native
  def initializeApp(options: js.UndefOr[scala.Nothing], name: String): App = js.native
  @JSImport("firebase-admin/lib/firebase-namespace-api", "initializeApp")
  @js.native
  def initializeApp(options: AppOptions): App = js.native
  @JSImport("firebase-admin/lib/firebase-namespace-api", "initializeApp")
  @js.native
  def initializeApp(options: AppOptions, name: String): App = js.native
  
  @js.native
  trait AppOptions extends StObject {
    
    /**
      * A {@link credential.Credential `Credential`} object used to
      * authenticate the Admin SDK.
      *
      * See [Initialize the SDK](/docs/admin/setup#initialize_the_sdk) for detailed
      * documentation and code samples.
      */
    var credential: js.UndefOr[Credential] = js.native
    
    /**
      * The object to use as the [`auth`](/docs/reference/security/database/#auth)
      * variable in your Realtime Database Rules when the Admin SDK reads from or
      * writes to the Realtime Database. This allows you to downscope the Admin SDK
      * from its default full read and write privileges.
      *
      * You can pass `null` to act as an unauthenticated client.
      *
      * See
      * [Authenticate with limited privileges](/docs/database/admin/start#authenticate-with-limited-privileges)
      * for detailed documentation and code samples.
      */
    var databaseAuthVariableOverride: js.UndefOr[js.Object | Null] = js.native
    
    /**
      * The URL of the Realtime Database from which to read and write data.
      */
    var databaseURL: js.UndefOr[String] = js.native
    
    /**
      * An [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
      * to be used when making outgoing HTTP calls. This Agent instance is used
      * by all services that make REST calls (e.g. `auth`, `messaging`,
      * `projectManagement`).
      *
      * Realtime Database and Firestore use other means of communicating with
      * the backend servers, so they do not use this HTTP Agent. `Credential`
      * instances also do not use this HTTP Agent, but instead support
      * specifying an HTTP Agent in the corresponding factory methods.
      */
    var httpAgent: js.UndefOr[Agent] = js.native
    
    /**
      * The ID of the Google Cloud project associated with the App.
      */
    var projectId: js.UndefOr[String] = js.native
    
    /**
      * The ID of the service account to be used for signing custom tokens. This
      * can be found in the `client_email` field of a service account JSON file.
      */
    var serviceAccountId: js.UndefOr[String] = js.native
    
    /**
      * The name of the Google Cloud Storage bucket used for storing application data.
      * Use only the bucket name without any prefixes or additions (do *not* prefix
      * the name with "gs://").
      */
    var storageBucket: js.UndefOr[String] = js.native
  }
  object AppOptions {
    
    @scala.inline
    def apply(): AppOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppOptions]
    }
    
    @scala.inline
    implicit class AppOptionsMutableBuilder[Self <: AppOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredential(value: Credential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
      
      @scala.inline
      def setDatabaseAuthVariableOverride(value: js.Object): Self = StObject.set(x, "databaseAuthVariableOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseAuthVariableOverrideNull: Self = StObject.set(x, "databaseAuthVariableOverride", null)
      
      @scala.inline
      def setDatabaseAuthVariableOverrideUndefined: Self = StObject.set(x, "databaseAuthVariableOverride", js.undefined)
      
      @scala.inline
      def setDatabaseURL(value: String): Self = StObject.set(x, "databaseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseURLUndefined: Self = StObject.set(x, "databaseURL", js.undefined)
      
      @scala.inline
      def setHttpAgent(value: Agent): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      @scala.inline
      def setServiceAccountId(value: String): Self = StObject.set(x, "serviceAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceAccountIdUndefined: Self = StObject.set(x, "serviceAccountId", js.undefined)
      
      @scala.inline
      def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageBucketUndefined: Self = StObject.set(x, "storageBucket", js.undefined)
    }
  }
  
  @js.native
  trait FirebaseArrayIndexError extends StObject {
    
    /**
      * The error object.
      */
    var error: FirebaseError = js.native
    
    /**
      * The index of the errored item within the original array passed as part of the
      * called API method.
      */
    var index: Double = js.native
  }
  object FirebaseArrayIndexError {
    
    @scala.inline
    def apply(error: FirebaseError, index: Double): FirebaseArrayIndexError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseArrayIndexError]
    }
    
    @scala.inline
    implicit class FirebaseArrayIndexErrorMutableBuilder[Self <: FirebaseArrayIndexError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: FirebaseError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FirebaseError extends StObject {
    
    /**
      * Error codes are strings using the following format: `"service/string-code"`.
      * Some examples include `"auth/invalid-uid"` and
      * `"messaging/invalid-recipient"`.
      *
      * While the message for a given error can change, the code will remain the same
      * between backward-compatible versions of the Firebase SDK.
      */
    var code: String = js.native
    
    /**
      * An explanatory message for the error that just occurred.
      *
      * This message is designed to be helpful to you, the developer. Because
      * it generally does not convey meaningful information to end users,
      * this message should not be displayed in your application.
      */
    var message: String = js.native
    
    /**
      * A string value containing the execution backtrace when the error originally
      * occurred.
      *
      * This information can be useful to you and can be sent to
      * {@link https://firebase.google.com/support/ Firebase Support} to help
      * explain the cause of an error.
      */
    var stack: js.UndefOr[String] = js.native
    
    /**
      * @return A JSON-serializable representation of this object.
      */
    def toJSON(): js.Object = js.native
  }
  object FirebaseError {
    
    @scala.inline
    def apply(code: String, message: String, toJSON: () => js.Object): FirebaseError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[FirebaseError]
    }
    
    @scala.inline
    implicit class FirebaseErrorMutableBuilder[Self <: FirebaseError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
