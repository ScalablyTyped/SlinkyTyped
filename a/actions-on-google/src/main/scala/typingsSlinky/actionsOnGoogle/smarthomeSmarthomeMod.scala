package typingsSlinky.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.service_account
import typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectRequest
import typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1DisconnectResponse
import typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteRequest
import typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1ExecuteResponse
import typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1Intents
import typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryRequest
import typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1QueryResponse
import typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1ReportStateRequest
import typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1Request
import typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1Response
import typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncRequest
import typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1SyncResponse
import typingsSlinky.actionsOnGoogle.assistantMod.AppHandler
import typingsSlinky.actionsOnGoogle.assistantMod.AppOptions
import typingsSlinky.actionsOnGoogle.assistantMod.ServiceBaseApp
import typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata
import typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smarthomeSmarthomeMod {
  
  @JSImport("actions-on-google/dist/service/smarthome/smarthome", "smarthome")
  @js.native
  val smarthome: SmartHome_ = js.native
  
  @js.native
  trait SmartHomeApp extends ServiceBaseApp {
    
    /** @hidden */
    def _intent(intent: SmartHomeV1Intents, handler: SmartHomeHandler[SmartHomeV1Request, SmartHomeV1Response]): this.type = js.native
    
    /** @hidden */
    var _intents: SmartHomeHandlers = js.native
    
    /** @public */
    var jwt: js.UndefOr[SmartHomeJwt] = js.native
    
    /** @public */
    var key: js.UndefOr[String] = js.native
    
    /**
      * Defines a function that will run when a DISCONNECT request is received.
      *
      * @example
      * ```javascript
      *
      * const app = smarthome();
      * app.onDisconnect((body, headers) => {
      *   // User unlinked their account, stop reporting state for user
      *   return {}
      * })
      * ```
      * @param handler The function that will run for an EXECUTE request. It should
      *   return a valid response or a Promise that resolves to valid response.
      *
      * @public
      */
    def onDisconnect(handler: SmartHomeHandler[SmartHomeV1DisconnectRequest, SmartHomeV1DisconnectResponse]): this.type = js.native
    
    /**
      * Defines a function that will run when an EXECUTE request is received.
      *
      * @example
      * ```javascript
      *
      * const app = smarthome();
      * app.onExecute((body, headers) => {
      *   return {
      *     requestId: 'ff36...',
      *     payload: {
      *       ...
      *     }
      *   }
      * })
      * ```
      * @param handler The function that will run for an EXECUTE request. It should
      *   return a valid response or a Promise that resolves to valid response.
      *
      * @public
      */
    def onExecute(handler: SmartHomeHandler[SmartHomeV1ExecuteRequest, SmartHomeV1ExecuteResponse]): this.type = js.native
    
    /**
      * Defines a function that will run when a QUERY request is received.
      *
      * @example
      * ```javascript
      *
      * const app = smarthome();
      * app.onQuery((body, headers) => {
      *   return {
      *     requestId: 'ff36...',
      *     payload: {
      *       ...
      *     }
      *   }
      * })
      * ```
      *
      * @param handler The function that will run for a QUERY request. It should
      *   return a valid response or a Promise that resolves to valid response.
      *
      * @public
      */
    def onQuery(handler: SmartHomeHandler[SmartHomeV1QueryRequest, SmartHomeV1QueryResponse]): this.type = js.native
    
    /**
      * Defines a function that will run when a SYNC request is received.
      *
      * @example
      * ```javascript
      *
      * const app = smarthome();
      * app.onSync((body, headers) => {
      *   return {
      *     requestId: 'ff36...',
      *     payload: {
      *       ...
      *     }
      *   }
      * })
      * ```
      *
      * @param handler The function that will run for a SYNC request. It should
      *   return a valid response or a Promise that resolves to valid response.
      *
      * @public
      */
    def onSync(handler: SmartHomeHandler[SmartHomeV1SyncRequest, SmartHomeV1SyncResponse]): this.type = js.native
    
    /**
      * Reports the current state of a device or set of devices to the home graph.
      * This may be done if the state of the device was changed locally, like a
      * light turning on through a light switch.
      *
      * When calling this function, a JWT (JSON Web Token) needs to be provided
      * as an option in the constructor.
      *
      * @example
      * ```javascript
      * const app = smarthome({
      *   jwt: require('./jwt.json');
      * });
      *
      * const reportState = () => {
      *   app.reportState({
      *     requestId: '123ABC',
      *     agentUserId: 'user-123',
      *     payload: {
      *       devices: {
      *         states: {
      *           "light-123": {
      *             on: true
      *           }
      *         }
      *       }
      *     }
      *   })
      *   .then((res) => {
      *     // Report state was successful
      *   })
      *   .catch((res) => {
      *     // Report state failed
      *   })
      * };
      * ```
      *
      * @param reportedState A payload containing a device or set of devices with their states
      *
      * @public
      */
    def reportState(reportedState: SmartHomeV1ReportStateRequest): js.Promise[String] = js.native
    
    /**
      * Sends a request to the home graph to send a new SYNC request. This should
      * be called when a device is added or removed for a given user id.
      *
      * When calling this function, an API key needs to be provided as an option
      * in the constructor. See https://developers.google.com/actions/smarthome/create-app#request-sync
      * to learn more.
      *
      * @example
      * ```javascript
      *
      * const app = smarthome({
      *   key: "123ABC"
      * });
      *
      * const addNewDevice = () => {
      *   app.requestSync('user-123')
      *     .then((res) => {
      *       // Request sync was successful
      *     })
      *     .catch((res) => {
      *       // Request sync failed
      *     })
      * }
      *
      * // When request sync is called, a SYNC
      * // intent will be received soon after.
      * app.onSync(body => {
      *   // ...
      * })
      * ```
      *
      * @param agentUserId The user identifier.
      *
      * @public
      */
    def requestSync(agentUserId: String): js.Promise[String] = js.native
  }
  
  type SmartHomeHandler[TRequest /* <: SmartHomeV1Request */, TResponse /* <: SmartHomeV1Response */] = js.Function3[
    /* body */ TRequest, 
    /* headers */ Headers, 
    /* framework */ BuiltinFrameworkMetadata, 
    TResponse | js.Promise[TResponse]
  ]
  
  type SmartHomeHandlers = StringDictionary[SmartHomeHandler[SmartHomeV1Request, SmartHomeV1Response]]
  
  @js.native
  trait SmartHomeJwt extends StObject {
    
    var auth_provider_x509_cert_url: String = js.native
    
    var auth_uri: String = js.native
    
    var client_email: String = js.native
    
    var client_id: String = js.native
    
    var client_x509_cert_url: String = js.native
    
    var private_key: String = js.native
    
    var private_key_id: String = js.native
    
    var project_id: String = js.native
    
    var token_uri: String = js.native
    
    var `type`: service_account = js.native
  }
  object SmartHomeJwt {
    
    @scala.inline
    def apply(
      auth_provider_x509_cert_url: String,
      auth_uri: String,
      client_email: String,
      client_id: String,
      client_x509_cert_url: String,
      private_key: String,
      private_key_id: String,
      project_id: String,
      token_uri: String,
      `type`: service_account
    ): SmartHomeJwt = {
      val __obj = js.Dynamic.literal(auth_provider_x509_cert_url = auth_provider_x509_cert_url.asInstanceOf[js.Any], auth_uri = auth_uri.asInstanceOf[js.Any], client_email = client_email.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], client_x509_cert_url = client_x509_cert_url.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any], private_key_id = private_key_id.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], token_uri = token_uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmartHomeJwt]
    }
    
    @scala.inline
    implicit class SmartHomeJwtMutableBuilder[Self <: SmartHomeJwt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth_provider_x509_cert_url(value: String): Self = StObject.set(x, "auth_provider_x509_cert_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuth_uri(value: String): Self = StObject.set(x, "auth_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_x509_cert_url(value: String): Self = StObject.set(x, "client_x509_cert_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate_key_id(value: String): Self = StObject.set(x, "private_key_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject_id(value: String): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken_uri(value: String): Self = StObject.set(x, "token_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: service_account): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SmartHomeOptions extends AppOptions {
    
    /**
      * A JWT (JSON Web Token) that is able to access the home graph API.
      * This is used for report state. See https://jwt.io/. A JWT can be
      * created through the Google Cloud Console: https://console.cloud.google.com/apis/credentials
      * @public
      */
    var jwt: js.UndefOr[SmartHomeJwt] = js.native
    
    /**
      * An API key to use the home graph API. See
      * https://console.cloud.google.com/apis/api/homegraph.googleapis.com/overview
      * to learn more.
      * @public
      */
    var key: js.UndefOr[String] = js.native
  }
  object SmartHomeOptions {
    
    @scala.inline
    def apply(): SmartHomeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmartHomeOptions]
    }
    
    @scala.inline
    implicit class SmartHomeOptionsMutableBuilder[Self <: SmartHomeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJwt(value: SmartHomeJwt): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  type SmartHome_ = js.Function1[/* options */ js.UndefOr[SmartHomeOptions], AppHandler with SmartHomeApp]
}
