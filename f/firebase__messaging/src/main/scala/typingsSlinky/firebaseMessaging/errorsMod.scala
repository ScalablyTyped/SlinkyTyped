package typingsSlinky.firebaseMessaging

import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`failed-service-worker-registration`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`invalid-bg-handler`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`invalid-sw-registration`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`invalid-vapid-key`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`missing-app-config-values`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`only-available-in-sw`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`only-available-in-window`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`permission-blocked`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`permission-default`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-failed`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-no-token`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-unsubscribe-failed`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-update-failed`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-update-no-token`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`unsupported-browser`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`use-sw-after-get-token`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`use-vapid-key-after-get-token`
import typingsSlinky.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@firebase/messaging/dist/util/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[ErrorCode, ErrorParams] = js.native
  
  /* Inlined @firebase/util.@firebase/util.ErrorMap<@firebase/messaging.@firebase/messaging/dist/util/errors.ErrorCode> */
  object ERROR_MAP {
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.failed-service-worker-registration")
    @js.native
    val failedServiceWorkerRegistration: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.invalid-bg-handler")
    @js.native
    val invalidBgHandler: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.invalid-sw-registration")
    @js.native
    val invalidSwRegistration: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.invalid-vapid-key")
    @js.native
    val invalidVapidKey: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.missing-app-config-values")
    @js.native
    val missingAppConfigValues: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.only-available-in-sw")
    @js.native
    val onlyAvailableInSw: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.only-available-in-window")
    @js.native
    val onlyAvailableInWindow: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.permission-blocked")
    @js.native
    val permissionBlocked: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.permission-default")
    @js.native
    val permissionDefault: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.token-subscribe-failed")
    @js.native
    val tokenSubscribeFailed: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.token-subscribe-no-token")
    @js.native
    val tokenSubscribeNoToken: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.token-unsubscribe-failed")
    @js.native
    val tokenUnsubscribeFailed: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.token-update-failed")
    @js.native
    val tokenUpdateFailed: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.token-update-no-token")
    @js.native
    val tokenUpdateNoToken: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.unsupported-browser")
    @js.native
    val unsupportedBrowser: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.use-sw-after-get-token")
    @js.native
    val useSwAfterGetToken: String = js.native
    
    @JSImport("@firebase/messaging/dist/util/errors", "ERROR_MAP.use-vapid-key-after-get-token")
    @js.native
    val useVapidKeyAfterGetToken: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`missing-app-config-values`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`only-available-in-window`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`only-available-in-sw`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`permission-default`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`permission-blocked`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`unsupported-browser`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`failed-service-worker-registration`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-failed`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-no-token`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-unsubscribe-failed`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-update-failed`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-update-no-token`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`invalid-bg-handler`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`use-sw-after-get-token`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`invalid-sw-registration`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`use-vapid-key-after-get-token`
    - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`invalid-vapid-key`
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    @scala.inline
    def AVAILABLE_IN_SW: `only-available-in-sw` = "only-available-in-sw".asInstanceOf[`only-available-in-sw`]
    
    @scala.inline
    def AVAILABLE_IN_WINDOW: `only-available-in-window` = "only-available-in-window".asInstanceOf[`only-available-in-window`]
    
    @scala.inline
    def FAILED_DEFAULT_REGISTRATION: `failed-service-worker-registration` = "failed-service-worker-registration".asInstanceOf[`failed-service-worker-registration`]
    
    @scala.inline
    def INVALID_BG_HANDLER: `invalid-bg-handler` = "invalid-bg-handler".asInstanceOf[`invalid-bg-handler`]
    
    @scala.inline
    def INVALID_SW_REGISTRATION: `invalid-sw-registration` = "invalid-sw-registration".asInstanceOf[`invalid-sw-registration`]
    
    @scala.inline
    def INVALID_VAPID_KEY: `invalid-vapid-key` = "invalid-vapid-key".asInstanceOf[`invalid-vapid-key`]
    
    @scala.inline
    def MISSING_APP_CONFIG_VALUES: `missing-app-config-values` = "missing-app-config-values".asInstanceOf[`missing-app-config-values`]
    
    @scala.inline
    def PERMISSION_BLOCKED: `permission-blocked` = "permission-blocked".asInstanceOf[`permission-blocked`]
    
    @scala.inline
    def PERMISSION_DEFAULT: `permission-default` = "permission-default".asInstanceOf[`permission-default`]
    
    @scala.inline
    def TOKEN_SUBSCRIBE_FAILED: `token-subscribe-failed` = "token-subscribe-failed".asInstanceOf[`token-subscribe-failed`]
    
    @scala.inline
    def TOKEN_SUBSCRIBE_NO_TOKEN: `token-subscribe-no-token` = "token-subscribe-no-token".asInstanceOf[`token-subscribe-no-token`]
    
    @scala.inline
    def TOKEN_UNSUBSCRIBE_FAILED: `token-unsubscribe-failed` = "token-unsubscribe-failed".asInstanceOf[`token-unsubscribe-failed`]
    
    @scala.inline
    def TOKEN_UPDATE_FAILED: `token-update-failed` = "token-update-failed".asInstanceOf[`token-update-failed`]
    
    @scala.inline
    def TOKEN_UPDATE_NO_TOKEN: `token-update-no-token` = "token-update-no-token".asInstanceOf[`token-update-no-token`]
    
    @scala.inline
    def UNSUPPORTED_BROWSER: `unsupported-browser` = "unsupported-browser".asInstanceOf[`unsupported-browser`]
    
    @scala.inline
    def USE_SW_AFTER_GET_TOKEN: `use-sw-after-get-token` = "use-sw-after-get-token".asInstanceOf[`use-sw-after-get-token`]
    
    @scala.inline
    def USE_VAPID_KEY_AFTER_GET_TOKEN: `use-vapid-key-after-get-token` = "use-vapid-key-after-get-token".asInstanceOf[`use-vapid-key-after-get-token`]
  }
  
  @js.native
  trait ErrorParams extends StObject
}
