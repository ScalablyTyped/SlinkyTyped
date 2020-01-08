package typingsSlinky.atFirebaseMessaging

import org.scalajs.dom.experimental.push.PushSubscription
import org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration
import typingsSlinky.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typingsSlinky.atFirebaseAppDashTypes.privateMod.FirebaseService
import typingsSlinky.atFirebaseAppDashTypes.privateMod.FirebaseServiceInternals
import typingsSlinky.atFirebaseMessaging.distSrcInterfacesInternalDashServicesMod.FirebaseInternalServices
import typingsSlinky.atFirebaseMessaging.distSrcInterfacesMessageDashPayloadMod.MessagePayload
import typingsSlinky.atFirebaseMessaging.distSrcModelsSubscriptionDashManagerMod.SubscriptionManager
import typingsSlinky.atFirebaseMessaging.distSrcModelsTokenDashDetailsDashModelMod.TokenDetailsModel
import typingsSlinky.atFirebaseMessaging.distSrcModelsVapidDashDetailsDashModelMod.VapidDetailsModel
import typingsSlinky.atFirebaseMessagingDashTypes.atFirebaseMessagingDashTypesMod.FirebaseMessaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/src/controllers/base-controller", JSImport.Namespace)
@js.native
object distSrcControllersBaseDashControllerMod extends js.Object {
  @js.native
  abstract class BaseController protected ()
    extends FirebaseMessaging
       with FirebaseService {
    def this(services: FirebaseInternalServices) = this()
    @JSName("INTERNAL")
    var INTERNAL_BaseController: FirebaseServiceInternals = js.native
    /* CompleteClass */
    override var app: FirebaseApp = js.native
    /**
      * This method will delete the token from the client database, and make a
      * call to FCM to remove it from the server DB. Does not temper with the
      * push subscription.
      */
    var deleteTokenFromDB: js.Any = js.native
    var getNewToken: js.Any = js.native
    /**
      * Returns the current Notification Permission state.
      */
    var getNotificationPermission: js.Any = js.native
    /**
      * manageExistingToken is triggered if there's an existing FCM token in the
      * database and it can take 3 different actions:
      * 1) Retrieve the existing FCM token from the database.
      * 2) If VAPID details have changed: Delete the existing token and create a
      * new one with the new VAPID key.
      * 3) If the database cache is invalidated: Send a request to FCM to update
      * the token, and to check if the token is still valid on FCM-side.
      */
    var manageExistingToken: js.Any = js.native
    /**
      * Requests notification permission from the user.
      */
    var requestNotificationPermission: js.Any = js.native
    val services: FirebaseInternalServices = js.native
    val subscriptionManager: js.Any = js.native
    val tokenDetailsModel: js.Any = js.native
    var updateToken: js.Any = js.native
    val vapidDetailsModel: js.Any = js.native
    /**
      * This method is required to adhere to the Firebase interface.
      * It closes any currently open indexdb database connections.
      */
    def delete(): js.Promise[Unit] = js.native
    def getPublicVapidKey_(): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
    /**
      * Gets a PushSubscription for the current user.
      */
    def getPushSubscription(swRegistration: ServiceWorkerRegistration, publicVapidKey: scala.scalajs.js.typedarray.Uint8Array): js.Promise[PushSubscription] = js.native
    def getSWRegistration_(): js.Promise[ServiceWorkerRegistration] = js.native
    def getSubscriptionManager(): SubscriptionManager = js.native
    def getTokenDetailsModel(): TokenDetailsModel = js.native
    def getVapidDetailsModel(): VapidDetailsModel = js.native
  }
  
  val TOKEN_EXPIRATION_MILLIS: Double = js.native
  type BgMessageHandler = js.Function1[/* payload */ MessagePayload, js.Promise[js.Any] | Unit]
}

