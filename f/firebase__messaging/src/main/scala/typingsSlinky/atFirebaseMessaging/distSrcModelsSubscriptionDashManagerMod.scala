package typingsSlinky.atFirebaseMessaging

import org.scalajs.dom.experimental.push.PushSubscription
import typingsSlinky.atFirebaseMessaging.distSrcInterfacesInternalDashServicesMod.FirebaseInternalServices
import typingsSlinky.atFirebaseMessaging.distSrcInterfacesTokenDashDetailsMod.TokenDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/src/models/subscription-manager", JSImport.Namespace)
@js.native
object distSrcModelsSubscriptionDashManagerMod extends js.Object {
  @js.native
  class SubscriptionManager () extends js.Object {
    def deleteToken(services: FirebaseInternalServices, tokenDetails: TokenDetails): js.Promise[Unit] = js.native
    def getToken(
      services: FirebaseInternalServices,
      subscription: PushSubscription,
      vapidKey: scala.scalajs.js.typedarray.Uint8Array
    ): js.Promise[String] = js.native
    /**
      * Update the underlying token details for fcmToken.
      */
    def updateToken(
      tokenDetails: TokenDetails,
      services: FirebaseInternalServices,
      subscription: PushSubscription,
      vapidKey: scala.scalajs.js.typedarray.Uint8Array
    ): js.Promise[String] = js.native
  }
  
}

