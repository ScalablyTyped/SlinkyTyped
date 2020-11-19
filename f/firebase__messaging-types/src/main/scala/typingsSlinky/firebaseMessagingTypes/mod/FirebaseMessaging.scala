package typingsSlinky.firebaseMessagingTypes.mod

import org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration
import typingsSlinky.firebaseUtil.subscribeMod.CompleteFn
import typingsSlinky.firebaseUtil.subscribeMod.ErrorFn
import typingsSlinky.firebaseUtil.subscribeMod.NextFn
import typingsSlinky.firebaseUtil.subscribeMod.Observer
import typingsSlinky.firebaseUtil.subscribeMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseMessaging extends js.Object {
  
  // TODO: remove the token parameter and just delete the token that matches
  // this app if it exists.
  def deleteToken(token: String): js.Promise[Boolean] = js.native
  
  def getToken(): js.Promise[String] = js.native
  
  def onMessage(nextOrObserver: NextFn[_]): Unsubscribe = js.native
  def onMessage(nextOrObserver: NextFn[_], error: js.UndefOr[scala.Nothing], completed: CompleteFn): Unsubscribe = js.native
  def onMessage(nextOrObserver: NextFn[_], error: ErrorFn): Unsubscribe = js.native
  def onMessage(nextOrObserver: NextFn[_], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
  def onMessage(nextOrObserver: Observer[_]): Unsubscribe = js.native
  def onMessage(nextOrObserver: Observer[_], error: js.UndefOr[scala.Nothing], completed: CompleteFn): Unsubscribe = js.native
  def onMessage(nextOrObserver: Observer[_], error: ErrorFn): Unsubscribe = js.native
  def onMessage(nextOrObserver: Observer[_], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
  
  def onTokenRefresh(nextOrObserver: NextFn[_]): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: NextFn[_], error: js.UndefOr[scala.Nothing], completed: CompleteFn): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: NextFn[_], error: ErrorFn): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: NextFn[_], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: Observer[_]): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: Observer[_], error: js.UndefOr[scala.Nothing], completed: CompleteFn): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: Observer[_], error: ErrorFn): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: Observer[_], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
  
  /**
    * @deprecated Use Notification.requestPermission() instead.
    * https://developer.mozilla.org/en-US/docs/Web/API/Notification/requestPermission
    */
  def requestPermission(): js.Promise[Unit] = js.native
  
  def setBackgroundMessageHandler(callback: js.Function1[/* payload */ js.Any, js.Promise[_] | Unit]): Unit = js.native
  
  def usePublicVapidKey(b64PublicKey: String): Unit = js.native
  
  def useServiceWorker(registration: ServiceWorkerRegistration): Unit = js.native
}
