package typingsSlinky.angularHttpAuth

import typingsSlinky.angular.mod.IRequestConfig
import typingsSlinky.angular.mod.global.Function
import typingsSlinky.angularHttpAuth.anon.Reject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object httpAuth {
    
    @js.native
    trait IAuthService extends StObject {
      
      def loginCancelled(): Unit = js.native
      def loginCancelled(data: js.UndefOr[scala.Nothing], reason: js.Any): Unit = js.native
      def loginCancelled(data: js.Any): Unit = js.native
      def loginCancelled(data: js.Any, reason: js.Any): Unit = js.native
      
      def loginConfirmed(): Unit = js.native
      def loginConfirmed(data: js.UndefOr[scala.Nothing], configUpdater: Function): Unit = js.native
      def loginConfirmed(data: js.Any): Unit = js.native
      def loginConfirmed(data: js.Any, configUpdater: Function): Unit = js.native
    }
    
    @js.native
    trait IHttpBuffer extends StObject {
      
      def append(config: IRequestConfig, deferred: Reject): Unit = js.native
      
      def rejectAll(): Unit = js.native
      def rejectAll(reason: js.Any): Unit = js.native
      
      def retryAll(): Unit = js.native
      def retryAll(updater: Function): Unit = js.native
    }
  }
}
