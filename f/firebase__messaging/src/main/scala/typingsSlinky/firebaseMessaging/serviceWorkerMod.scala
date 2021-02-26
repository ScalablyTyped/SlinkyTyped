package typingsSlinky.firebaseMessaging

import typingsSlinky.std.EventInit
import typingsSlinky.std.PushManager
import typingsSlinky.std.PushSubscription
import typingsSlinky.std.ServiceWorkerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceWorkerMod {
  
  @JSImport("@firebase/messaging/dist/testing/fakes/service-worker", "FakeEvent")
  @js.native
  class FakeEvent protected () extends ExtendableEvent {
    def this(`type`: String) = this()
    def this(`type`: String, options: EventInit) = this()
    
    @JSName("currentTarget")
    var currentTarget_FakeEvent: Null = js.native
    
    def initEvent(): Unit = js.native
    
    @JSName("srcElement")
    var srcElement_FakeEvent: Null = js.native
    
    @JSName("target")
    var target_FakeEvent: Null = js.native
    
    def waitUntil(): Unit = js.native
  }
  
  @JSImport("@firebase/messaging/dist/testing/fakes/service-worker", "FakePushSubscription")
  @js.native
  class FakePushSubscription () extends PushSubscription {
    
    var auth: String = js.native
    
    @JSName("expirationTime")
    var expirationTime_FakePushSubscription: Double = js.native
    
    var p256: String = js.native
  }
  
  @JSImport("@firebase/messaging/dist/testing/fakes/service-worker", "FakeServiceWorkerRegistration")
  @js.native
  class FakeServiceWorkerRegistration () extends ServiceWorkerRegistration {
    
    @JSName("active")
    var active_FakeServiceWorkerRegistration: Null = js.native
    
    def addEventListener(): Unit = js.native
    
    def dispatchEvent(): Boolean = js.native
    
    @JSName("installing")
    var installing_FakeServiceWorkerRegistration: Null = js.native
    
    @JSName("onupdatefound")
    var onupdatefound_FakeServiceWorkerRegistration: Null = js.native
    
    @JSName("pushManager")
    var pushManager_FakeServiceWorkerRegistration: FakePushManager = js.native
    
    def removeEventListener(): Unit = js.native
    
    def showNotification(): js.Promise[Unit] = js.native
    
    @JSName("waiting")
    var waiting_FakeServiceWorkerRegistration: Null = js.native
  }
  
  @JSImport("@firebase/messaging/dist/testing/fakes/service-worker", "mockServiceWorker")
  @js.native
  def mockServiceWorker(): Unit = js.native
  
  @JSImport("@firebase/messaging/dist/testing/fakes/service-worker", "restoreServiceWorker")
  @js.native
  def restoreServiceWorker(): Unit = js.native
  
  @js.native
  trait FakePushManager extends PushManager {
    
    var subscription: js.Any = js.native
  }
}
